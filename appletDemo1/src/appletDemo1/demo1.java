package appletDemo1;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class demo1 extends Applet implements ActionListener{
	TextField txtnumber, txtanswer;
	Label lblnumber, lblanswer;
	Button btnanswer;
	
	public void init(){
		txtnumber = new TextField(5);
		txtanswer = new TextField(5);
		
		lblnumber = new Label("Number");
		lblanswer = new Label("Answer");
		
		btnanswer = new Button("Click Me");
		
		add(lblnumber);
		add(txtnumber);
		
		add(btnanswer);
		btnanswer.addActionListener(this);
		
		add(lblanswer);
		add(txtanswer);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int no = Integer.parseInt(txtnumber.getText());
		txtanswer.setText((no*no)+"");
	}

}
