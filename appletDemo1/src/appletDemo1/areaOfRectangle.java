package appletDemo1;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class areaOfRectangle extends Applet implements ActionListener {
	Label lbllength,lblbreadth,lblanswer;
	Button btnanswer;
	TextField txtlength, txtbreadth, txtanswer;
	
	public void init() {
		txtlength = new TextField(5);
		txtbreadth = new TextField(5);
		txtanswer = new TextField(5);
		
		lbllength = new Label("Enter Length: ");
		lblbreadth = new Label("Enter Breadth: ");
		lblanswer = new Label("Answer: ");
		
		btnanswer = new Button("Area Of Rectangle");
		
		add(lbllength);
		add(txtlength);
		
		add(lblbreadth);
		add(txtbreadth);
		
		add(btnanswer);
		btnanswer.addActionListener(this);
		
		add(lblanswer);
		add(txtanswer);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Double l = Double.parseDouble(txtlength.getText());
		Double b = Double.parseDouble(txtbreadth.getText());
		
		Double ans = l * b;
		
		txtanswer.setText(ans+"");
	}
	
}
