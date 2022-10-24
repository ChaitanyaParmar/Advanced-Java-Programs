package swingDemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldDemo extends JFrame {
	public JTextFieldDemo(String title) {
		super(title);
		setSize(400, 400);
		setLayout(new GridLayout(3, 1));
		JTextField userText = new JTextField("Hello", 6);
		add(userText);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		JTextFieldDemo tf = new JTextFieldDemo("JTextField Demo");
	}
}
