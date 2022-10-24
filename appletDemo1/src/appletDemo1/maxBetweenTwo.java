package appletDemo1;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class maxBetweenTwo extends Applet implements ActionListener{
	TextField txtnumber1, txtnumber2, txtanswer;
	Label lblnumber1, lblnumber2, lblanswer;
	Button btnanswer;
	
	public void init(){
		txtnumber1 = new TextField(5);
		txtnumber2 = new TextField(5);
		txtanswer = new TextField(5);
		
		lblnumber1 = new Label("Enter Number 1: ");
		lblnumber2 = new Label("Enter Number 2: ");
		lblanswer = new Label("Max Number: ");
		
		btnanswer = new Button("Calculate");
		
		add(lblnumber1);
		add(txtnumber1);

		add(lblnumber2);
		add(txtnumber2);
		
		add(btnanswer);
		btnanswer.addActionListener(this);
		
		add(lblanswer);
		add(txtanswer);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int no1 = Integer.parseInt(txtnumber1.getText());
		int no2 = Integer.parseInt(txtnumber2.getText());
		if(no1 > no2) {
			txtanswer.setText(no1+"");
		}
		else {
			txtanswer.setText(no2+"");
		}
		
	}
}
