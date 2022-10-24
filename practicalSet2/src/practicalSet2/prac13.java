package practicalSet2;

import java.awt.*;
import javax.swing.*;

public class prac13{

	JFrame f = new JFrame("Practical 13");
	JLabel lblname = new JLabel("Full Name: ");
	JLabel lblno = new JLabel("Enrollment No: ");
	JTextField txtname = new JTextField();
	JTextField txtno = new JTextField();
	JButton btnsubmit = new JButton("Submit");
 
	public prac13(){
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		
		lblname.setBounds(50,50,200,30);
		txtname.setBounds(150,50,200,30);
		lblno.setBounds(50,80,200,30);
		txtno.setBounds(150,80,200,30);
		btnsubmit.setBounds(150,130,95,30);  
		
		f.add(lblname);
		f.add(txtname);
		f.add(lblno);
		f.add(txtno);
		f.add(btnsubmit);
	}
	
	public static void main(String [] args){
		new prac13();
	}
}	
