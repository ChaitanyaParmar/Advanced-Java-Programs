package appletDemo1;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class calculatorDropDown extends Applet implements ItemListener{
	Label lblNumber1, lblNumber2, lblAnswer;
	TextField txtNumber1, txtNumber2, txtAnswer;
	Choice cmb; 
	
	public void init() {
		lblNumber1 = new Label("Enter Number 1: ");
		lblNumber2 = new Label("Enter Number 2: ");
		lblAnswer = new Label("Enter Answer: ");
		
		txtNumber1 = new TextField(5);
		txtNumber2 = new TextField(5);
		txtAnswer = new TextField(5);
		
		cmb = new Choice();
		
		cmb.add("Add");
		cmb.add("Sub");
		cmb.add("Mul");
		cmb.add("Div");
		
		cmb.addItemListener(this);
		
		add(lblNumber1);
		add(txtNumber1);
		
		add(lblNumber2);
		add(txtNumber2);
		
		add(cmb);
		
		add(lblAnswer);
		add(txtAnswer);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		int no1 = Integer.parseInt(txtNumber1.getText());
		int no2 = Integer.parseInt(txtNumber2.getText());
		float ans = 0;
		
		if(cmb.getSelectedItem() == "Add") {
			ans = no1 + no2;
		}
		else if(cmb.getSelectedItem() == "Sub") {
			ans = no1 - no2;
		}
		else if(cmb.getSelectedItem() == "Mul") {
			ans = no1 * no2;
		}
		else if(cmb.getSelectedItem() == "Div") {
			ans = no1 / no2;
		}
		txtAnswer.setText(ans+"");
	}
}
