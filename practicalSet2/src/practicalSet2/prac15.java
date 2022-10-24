package practicalSet2;

import javax.swing.*;    
public class prac15 {    
	JFrame f;    
	prac15(){    
	
	f=new JFrame("Practical 15");  
	f.setSize(400,400);    
	f.setLayout(null);    
	f.setVisible(true);  
	
	JLabel lbl = new JLabel("Gender:");
	lbl.setBounds(30,50,200,40);    

	JRadioButton rb1=new JRadioButton("Male");    
	JRadioButton rb2=new JRadioButton("Female");
	JRadioButton rb3=new JRadioButton("Others");
	rb1.setBounds(100,50,200,40);    
	rb2.setBounds(170,50,200,40);    
	rb3.setBounds(240,50,200,40);   
	
	ButtonGroup b1=new ButtonGroup();    
	b1.add(rb1);
	b1.add(rb2);    
	b1.add(rb3);

	f.add(lbl);
	f.add(rb1);
	f.add(rb2);   
	f.add(rb3);  
	
	JButton btnsubmit = new JButton("Submit");
	btnsubmit.setBounds(150,130,95,30); 
	f.add(btnsubmit);
}    
public static void main(String[] args) {    
	new prac15();    
}    
}
