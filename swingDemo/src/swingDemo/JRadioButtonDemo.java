package swingDemo;

import javax.swing.*;
import java.awt.*;

public class JRadioButtonDemo extends JFrame {
	public JRadioButtonDemo(String title) {
		super(title);
		setLayout(new GridLayout(4, 1));
		JRadioButton radioButton;
		ButtonGroup rbg = new ButtonGroup();
		JLabel label = new JLabel("Select Gender : ");
		label.setFont(new Font("SansSerif", Font.BOLD, 14));
		add(label);
		radioButton = new JRadioButton("Male");
		add(radioButton);
		rbg.add(radioButton);
		radioButton.setSelected(true);
		radioButton = new JRadioButton("Female");
		add(radioButton);
		rbg.add(radioButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		JRadioButtonDemo rb = new JRadioButtonDemo("JRadioButton Demo");
		rb.setSize(300, 100);
		rb.setVisible(true);
	}
}