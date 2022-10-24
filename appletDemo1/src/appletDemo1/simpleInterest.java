package appletDemo1;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class simpleInterest extends Applet implements ActionListener {
	TextField txtprincipal, txtrate, txttime, txtanswer;
	Label lblprincipal, lblrate, lbltime, lblanswer;
	Button btnanswer;
	
	public void init() {
		txtprincipal = new TextField(5);
		txtrate = new TextField(5);
		txttime = new TextField(5);
		txtanswer = new TextField(5);
		
		lblprincipal = new Label("Enter Principal: ");
		lblrate = new Label("Enter Rate of Interest: ");
		lbltime = new Label("Enter Time: ");
		lblanswer = new Label("Answer: ");
		
		btnanswer = new Button("Simple Interest");
		
		add(lblprincipal);
		add(txtprincipal);

		add(lblrate);
		add(txtrate);

		add(lbltime);
		add(txttime);
		
		add(btnanswer);
		btnanswer.addActionListener(this);
		
		add(lblanswer);
		add(txtanswer);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int p = Integer.parseInt(txtprincipal.getText());
		int r = Integer.parseInt(txtrate.getText());
		int t = Integer.parseInt(txttime.getText());
		txtanswer.setText(((p*r*t)/100)+"");
		
	}
	
}
