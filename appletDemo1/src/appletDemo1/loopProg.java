package appletDemo1;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class loopProg extends Applet implements ActionListener {
	TextField txtnumber, txtfactorial, txtseries;
	Label lblnumber, lblfactorial, lblseries;
	Button btnanswer;
	
	public void init(){
		txtnumber = new TextField(5);
		txtfactorial = new TextField(5);
		txtseries = new TextField(5);
		
		lblnumber = new Label("Enter Number: ");
		lblfactorial = new Label("Factorial: ");
		lblseries = new Label("Series: ");
		
		btnanswer = new Button("Calculate");
		
		add(lblnumber);
		add(txtnumber);

		
		add(btnanswer);
		btnanswer.addActionListener(this);
		
		add(lblfactorial);
		add(txtfactorial);
		
		add(lblseries);
		add(txtseries);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int no = Integer.parseInt(txtnumber.getText());
		int fact = 1;
		for(int t = 1; t<= no; t++) {
			fact = fact * t;
			txtfactorial.setText(fact+"");
		}
	}
}
