package appletDemo1;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class popupMenu extends Applet implements ActionListener{
	PopupMenu popup;
	public void init() {
		MenuItem mi;
		popup = new PopupMenu("Title Goes Here");
		popup.add(mi = new MenuItem("Undo"));
		mi.addActionListener(this);
		popup.addSeparator();
		popup.add(mi = new MenuItem("Cut")).setEnabled(false);
		mi.addActionListener(this);
		popup.add(mi = new MenuItem("Copy")).setEnabled(false);
		mi.addActionListener(this);
		popup.add(mi = new MenuItem("Paste"));
		mi.addActionListener(this);
		popup.add(mi = new MenuItem("Delete")).setEnabled(false);
		mi.addActionListener(this);
		popup.add(mi = new MenuItem("Select All"));
		mi.addActionListener(this);  	
		add(popup);
		resize(200, 200);
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);
	}
	protected void processMouseEvent(MouseEvent e) {
		if(e.isPopupTrigger()) {
			popup.show(e.getComponent(), e.getX(), e.getY());
		}
		super.processMouseEvent(e);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
	}

}
