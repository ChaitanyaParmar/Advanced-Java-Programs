package swingDemo;

import javax.swing.*;
import java.awt.event.*;

public class JMenuDemo extends JFrame implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		
	}
	
	public JMenuDemo() {
		super("Jmenu Demo");
		JMenuBar jmb = new JMenuBar();
		JMenu file = new JMenu("file");
		JMenuItem item;
		file.add(item = new JMenuItem("New"));
		item.addActionListener (this);
		file.add(item = new JMenuItem("opem"));
		item.addActionListener(this);
		file.addSeparator();
		file.add(item = new JMenuItem("close"));
		item.addActionListener(this);
		jmb.add(file);
		JMenu edit = new JMenu("edit");
		edit.add(item = new JMenuItem("Copy"));
		item.addActionListener (this);
		edit.add(item = new JMenuItem("paste"));
		item.setHorizontalTextPosition(JMenuItem.LEFT);
		item.addActionListener (this);
		jmb.add(edit);
		JMenu choice = new JMenu("colours");
		JCheckBoxMenuItem check = new JCheckBoxMenuItem("Toggle screen");
		check.addActionListener(this);
		choice.add(check);
		ButtonGroup rbg  = new ButtonGroup();
		JRadioButtonMenuItem red = new JRadioButtonMenuItem("Colourfull");
		choice.add(red);
		rbg.add(red);
		red.addActionListener(this);
		red = new JRadioButtonMenuItem("Black & white");
		choice.add(red);
		rbg.add(red);
		red.addActionListener(this);
		jmb.add(choice);
		setJMenuBar(jmb);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[]args) {
		JMenuDemo ob = new JMenuDemo();
		ob.setSize(300,100);
		ob.setVisible(true);
	}
}