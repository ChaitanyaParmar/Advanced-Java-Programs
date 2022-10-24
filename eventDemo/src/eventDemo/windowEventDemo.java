package eventDemo;

import java.awt.*;
import java.awt.event.*;

public class windowEventDemo extends Frame{
	public windowEventDemo() {
		setTitle("Button with ActionListener Demo");
		setSize(400, 400);
		setLayout (new FlowLayout());
		setLocationRelativeTo(null);
		setVisible(true);
		addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent we) {
				System.out.println("Window Opened");
			}
			public void windowClosing(WindowEvent we) {
				System.out.println("Window Closing");
				
			}
			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("Window Closed");
			}
			@Override
			public void windowIconified(WindowEvent e) {
				setTitle("Iconified");
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
				setTitle("Deiconified");
			}
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("Window Activated");
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("Window Deactivated");
			}
		});
	}
	public static void main(String[] args) {
		new windowEventDemo();
	}
}