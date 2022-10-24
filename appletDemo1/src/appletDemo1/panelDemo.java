package appletDemo1;

import java.awt.*;

public class panelDemo extends Panel{

	public static void main(String[] args) {
		Frame f = new Frame("PanelDemo");
		panelDemo ex = new panelDemo();
		
		f.add(ex,"Center");
		f.pack();
		f.show();
	}
}