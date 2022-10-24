package appletDemo1;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class areaOfTriangle extends Applet implements ActionListener{
	Label lblheight,lblbase,lblanswer;
	Button btnanswer;
	TextField txtHeight, txtBase, txtanswer;
	
	public void init() {
		lblheight = new Label("Enter Height :");
		lblbase = new Label("Enter Base :");
		lblanswer = new Label("Answer: ");
		
		btnanswer = new Button("Area Of Triangle");
		
		txtHeight = new TextField(5);
		txtBase = new TextField(5);
		txtanswer = new TextField(5);
		
		add(lblheight);
		add(txtHeight);
		
		add(lblbase);
		add(txtBase);
		
		add(btnanswer);
		btnanswer.addActionListener(this);
		
		add(lblanswer);
		add(txtanswer);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Double h = Double.parseDouble(txtHeight.getText());
		Double b = Double.parseDouble(txtBase.getText());
		
		Double ans = 0.5 * h * b;
		
		txtanswer.setText(ans+"");
	}
}