package swingDemo;

import javax.swing.JApplet;
import java.awt.*;

public class JAppletDemo extends JApplet{
	final int r = 25;
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 150, 150);
	}
}
