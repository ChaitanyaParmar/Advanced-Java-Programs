package swingDemo;

import java.awt.*;
import javax.swing.*;

public class JCheckBoxDemo extends JApplet{
	Icon unchecked = new ToggleIcon(false);
	Icon checked = new ToggleIcon(true);
	public JCheckBoxDemo() {
		setLayout(new GridLayout(3, 1));
		JLabel Hobby = new JLabel("Select Your Hobbies : ");
		JCheckBox cb1 = new JCheckBox("Singing", true);
		cb1.setIcon(unchecked);
		cb1.setSelectedIcon(checked);
		JCheckBox cb2 = new JCheckBox("Reading", false);
		cb2.setIcon(unchecked);
		cb2.setSelectedIcon(checked);
		add(Hobby);
		add(cb1);
		add(cb2);
	}
	public static void main(String[] args) {
		JCheckBoxDemo cb = new JCheckBoxDemo();
		cb.setSize(300, 100);
		cb.setVisible(true);
	}
	class ToggleIcon implements Icon{
		boolean state;
		public ToggleIcon(boolean s) {
			state = s;
		}
		@Override
		public void paintIcon(Component c, Graphics g, int x, int y) {
			int width = getIconWidth();
			int height = getIconHeight();
			g.setColor(Color.black);
			if(state) {
				g.fillRect(x, y, width, height);
			}
			else {
				g.drawRect(x, y, width, height);
			}
		}
		@Override
		public int getIconWidth() {
			return 10;
		}
		@Override
		public int getIconHeight() {
			return 10;
		}
	}
}
