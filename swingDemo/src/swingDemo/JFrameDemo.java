package swingDemo;

import java.awt.GridLayout;

import javax.swing.*;

public class JFrameDemo extends JFrame{
	JFrame f;
	JLabel hi;
	public JFrameDemo(){
		f = new JFrame("Helo");
		
		hi = new JLabel("Hello world");
		hi.setBounds(10,10,100,100);
		f.add(hi);
		
		f.setVisible(true);
		f.setSize(200,200);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JFrameDemo();
	}

}