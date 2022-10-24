package eventDemo;

import java.awt.*;
import java.awt.event.*;

public class keyEventDemo extends Frame implements KeyListener{
	private TextField Input;
	private TextArea Display;
	public keyEventDemo() {
		setLayout(new FlowLayout());
		add(new Label("Enter Text : "));
		Input = new TextField(10);
		add(Input);
		Display = new TextArea(5, 40);
		add(Display);
		Input.addKeyListener(this);
		setTitle("KeyEvent Demo");
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new keyEventDemo();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		Display.append("You have typed " + e.getKeyChar() + "\n");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
