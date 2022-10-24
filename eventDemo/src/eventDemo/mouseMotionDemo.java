package eventDemo;
import java.awt.*;
import java.awt.event.*;

public class mouseMotionDemo extends Frame implements MouseListener, MouseMotionListener{
	private TextField tx,ty,xpos,ypos;
	
	public mouseMotionDemo() {
		setLayout(new FlowLayout());
		add(new Label("X Co-Ordinate :"));
		tx = new TextField(10);
		tx.setEditable(false);
		add(tx);
		
		add(new Label("Y Co-Ordinate :"));
		ty = new TextField(10);
		ty.setEditable(false);
		add(ty);
		
		add(new Label("X Position :"));
		xpos = new TextField(10);
		xpos.setEditable(false);
		add(xpos);
		
		add(new Label("Y Position :"));
		ypos = new TextField(10);
		ypos.setEditable(false);
		add(ypos);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setTitle("Mouse Motion Demo");
		setSize(400,120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new mouseMotionDemo();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		xpos.setText(e.getX()+ "");
		ypos.setText(e.getY()+ "");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		tx.setText(e.getX() + "");
		ty.setText(e.getY() + "");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

}