package appletDemo1;

import java.awt.*;
import java.applet.*;

public class frameDemo extends Applet{
	Frame frame;
	Button button;
	public void init() {
		frame = new Frame("Frame Window");
		button = new Button("Show Window");
		add(button);
	}
	public boolean action(Event evt, Object arg) {
		boolean visible = frame.isShowing();
		if(visible) {	
			frame.hide();
			button.setLabel("Show Window");
		}
		else {
			frame.show();
			frame.resize(200, 100);
			button.setLabel("Hide Window");
		}
		return true;
	}
}
