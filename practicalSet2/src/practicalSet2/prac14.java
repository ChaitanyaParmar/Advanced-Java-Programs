package practicalSet2;

import java.awt.*;
import javax.swing.*;

public class prac14{

	JFrame f = new JFrame("Practical 14");
	JLabel lblname = new JLabel("Branch");
	String branches[] = {"Computer","Electrical","Mechanical","Plastic","Civil"};
	JComboBox branch = new JComboBox(branches);
	JButton btnsubmit = new JButton("Submit");
 
	prac14(){
	
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		
		lblname.setBounds(50,50,200,30);
		branch.setBounds(100,50, 200,30);
		btnsubmit.setBounds(150,130,95,30);  
		
		f.add(lblname);
		f.add(branch);
		f.add(btnsubmit);
	}
	
	public static void main(String [] args){
		new prac14();
	}
}	

