package swingDemo;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo extends JFrame{
	public JButtonDemo(String title) {
		super(title);
		setLayout(new GridLayout(3,2));
		
		JButton b1 = new JButton("ADD");
		JButton b2 = new JButton("OK");
		
		add(b1);
		add(b2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		JButtonDemo test = new JButtonDemo("JButton Demo");
		test.setSize(300, 100);
		test.setVisible(true);
	}
}
