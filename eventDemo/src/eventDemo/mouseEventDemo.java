package eventDemo;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseEventDemo extends Frame implements MouseListener {
	private TextField tx, ty;
	public mouseEventDemo() {
		setLayout(new FlowLayout());
		add(new Label("X Co-Ordinate : "));
		tx = new TextField(10);
		tx.setEditable(false);
		add(tx);
		add(new Label("Y Co-Ordinate : "));
		ty = new TextField(10);
		ty.setEditable(false);
		add(ty);
		addMouseListener(this);
		setTitle("MouseEvent Demo");
		setSize(350, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new mouseEventDemo();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		tx.setText(e.getX() + "");
		ty.setText(e.getY() + "");
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}
	