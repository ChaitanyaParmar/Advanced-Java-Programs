package layoutDemo;

import java.awt.*;
import java.applet.*;

public class gridLayout extends Applet {
	public void init() {
		setLayout(new GridLayout(3,2));
		add(new Button("One"));	
		add(new Button("Two"));
		add(new Button("Three"));
		add(new Button("Four"));
		add(new Button("Five"));
		add(new Button("Six"));
	}
}
