package swingDemo;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo extends JFrame{
	public JLabelDemo(String title) {
		super(title);
		setLayout(new GridLayout(3,1));
		JLabel plainLabel = new JLabel("Plain small label");
		add(plainLabel);
		JLabel fancyLabel = new JLabel("fancy big label");
		Font fancyFont = new Font("Vraj" , Font.BOLD | Font.ITALIC, 32);
		fancyLabel.setFont(fancyFont);
		fancyLabel.setHorizontalAlignment(JLabel.RIGHT);
		add(fancyLabel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[]args) {
		JLabelDemo test = new JLabelDemo("Jlabel demo");
		test.setSize(300,100);
		test.setVisible(true);
	}

}