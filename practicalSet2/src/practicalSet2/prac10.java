package practicalSet2;

import java.awt.*;
import java.awt.event.*;

public class prac10{
	prac10(){
		Frame f=new Frame("Menubar");
		MenuBar m = new MenuBar();
		Menu file = new Menu("File");
		Menu home = new Menu("Home");
		Menu edit = new Menu("Edit");
		Menu help = new Menu("Help");
		MenuItem n = new MenuItem("New");
		MenuItem s = new MenuItem("Save");
		MenuItem sa = new MenuItem("Save As");
		MenuItem c = new MenuItem("Close");
		file.add(s);
		file.add(sa);
		file.add(n);
		file.add(c);
		m.add(file);
		m.add(home);
		m.add(edit);
		m.add(help);
		f.setMenuBar(m);  
		f.setSize(400,400);  
		f.setLayout(null);  
		f.setVisible(true);	
		
		f.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                f.dispose();    
            }    
        });    
	}
	
	public static void main(final String[] ar){
		new prac10();
	}
}
