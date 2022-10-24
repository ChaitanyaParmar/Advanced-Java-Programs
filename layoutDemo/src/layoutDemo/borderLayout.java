package layoutDemo;

import java.awt.*;
import java.applet.*;

public class borderLayout extends Applet {
	public void init() {
		setLayout(new BorderLayout());
		add(new Button("One"), BorderLayout.NORTH);	
		add(new Button("Two"), BorderLayout.SOUTH);
		add(new Button("Three"), BorderLayout.CENTER);
		add(new Button("Four"), BorderLayout.EAST);
		add(new Button("Five"), BorderLayout.WEST);
	}
}
