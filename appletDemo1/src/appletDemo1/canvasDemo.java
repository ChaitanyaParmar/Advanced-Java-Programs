package appletDemo1;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class canvasDemo extends Applet{
	Canvas c;
	public void init() {
		c = new Canvas();
		c.setBackground(Color.black);
		c.setSize(50, 90);
		add(c);
	}
}
