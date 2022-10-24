package swingDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxDemo extends JFrame{
	String Seasons[] = {"Winter" , "Summer" ,"Monsoon"};
	public JComboBoxDemo(String title) {
		super(title);
		setLayout(new GridLayout(3,2));
		JLabel f = new JLabel("Select Your Favourite Seasons :");
		JComboBox s = new JComboBox();
		
		for(int i =0;i<Seasons.length;i++) {
			s.addItem (Seasons[i]);
		}
		
		s.setEditable(false);
		s.setSelectedItem("Monsoon");
		s.setMaximumRowCount(4);
		
		add(f);
		add(s);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[]args) {
		JComboBoxDemo ob = new JComboBoxDemo("JComboBox Demo");
		ob.setSize(300,100);
		ob.setVisible(true);
	}
}