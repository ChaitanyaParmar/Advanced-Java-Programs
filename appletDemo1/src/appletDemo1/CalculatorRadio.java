package appletDemo1;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CalculatorRadio  extends Applet implements ItemListener{
	Label lblNo1, lblNo2, lblAns;
	TextField txtNo1, txtNo2, txtAns;
	Checkbox chAdd, chSub, chMul, chDiv;
	CheckboxGroup chg;
	
	public void init() {
		lblNo1 = new Label("Enter Number 1: ");
		lblNo2 = new Label("Enter Number 2: ");
		lblAns = new Label("Answer: ");
		
		txtNo1 = new TextField(5);
		txtNo2 = new TextField(5);
		txtAns = new TextField(5);
		
		chg = new CheckboxGroup();
		
		chAdd = new Checkbox("Add", chg, false);
		chSub = new Checkbox("Sub", chg, false);
		chMul = new Checkbox("Mul", chg, false);
		chDiv = new Checkbox("Div", chg, false);
		
		chAdd.addItemListener(this);
		chSub.addItemListener(this);
		chMul.addItemListener(this);
		chDiv.addItemListener(this);
		
		
		add(lblNo1);
		add(txtNo1);
		
		add(lblNo2);
		add(txtNo2);

		add(chAdd);
		add(chSub);
		add(chMul);
		add(chDiv);
		
		add(lblAns);
		add(txtAns);
		
		
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		int no1 = Integer.parseInt(txtNo1.getText());
		int no2 = Integer.parseInt(txtNo2.getText());
		float ans = 0;
		Checkbox ch = chg.getSelectedCheckbox();
		
		if(ch.getLabel() == "Add") {
			ans = no1 + no2;
		}
		else if(ch.getLabel() == "Sub") {
			ans = no1 - no2;
		}
		else if(ch.getLabel() == "Mul") {
			ans = no1 * no2;
		}
		else if(ch.getLabel() == "Div") {
			ans = no1 / no2;
		}
		txtAns.setText(ans+"");
	}
}
