package layoutDemo;

import java.awt.*;
import java.applet.*;

public class flowLayout extends Applet {
	public void init() {
		setLayout(new FlowLayout());
//		setLayout(new FlowLayout(FlowLayout.LEFT));
//		setLayout(new FlowLayout(FlowLayout.CENTER));
//		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(new Button("One"));	
		add(new Button("Two"));
		add(new Button("Three"));
		add(new Button("Four"));
		add(new Button("Five"));
		add(new Button("Six"));
	}
}
