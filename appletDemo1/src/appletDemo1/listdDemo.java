package appletDemo1;

import java.awt.*;
import java.applet.*;
public class listdDemo extends Applet{
	public void init() {
		List li = new List(5, true);
		li.addItem("Item 1");
		li.addItem("Item 2");
		li.addItem("Item 3");
		li.addItem("Item 4");
		li.addItem("Item 5");
		li.addItem("Item 6");
		li.addItem("Item 7");
		li.addItem("Item 8");
		li.addItem("Item 9");
		li.addItem("Item 10");
		
		add(li);
	}
}
