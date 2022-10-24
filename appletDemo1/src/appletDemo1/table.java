package appletDemo1;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class table extends Applet implements ActionListener {
	Label lblnumber, lblanswer;
	TextField txtnumber;
	TextArea txtanswer;
	Button btnanswer;
	public void init() {
		lblnumber = new Label("Enter Number: ");
		lblanswer = new Label("Table: ");
		
		txtnumber = new TextField(5);
		txtanswer = new TextArea(5,10);
		
		btnanswer = new Button("Answer");
		
		add(lblnumber);
		add(txtnumber);
		
		add(btnanswer);
		btnanswer.addActionListener(this);
		
		add(lblanswer);
		add(txtanswer);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "";
		int no = Integer.parseInt(txtnumber.getText());
		int j;
		
		for(int i = 0; i < 10; i++) {
			j = i +1;
			s = (s + no) + " X " + j + " = " + (no * j) + "\n"; 
		}
		txtanswer.setText(s);
	}
}
