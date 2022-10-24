package swingDemo;

import java.awt.*;
import javax.swing.*;

public class JTextFieldDemo2 extends JFrame{
	public JTextFieldDemo2(String title) {
		super(title);
		setSize(300,300);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JTextField txt1 = new JTextField("Aryan Wala",10); //string and total char visible in textbox
		add(txt1);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new JTextFieldDemo2("Hello World");
	}	

}
