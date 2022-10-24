package layoutDemo;

import java.awt.*;
import java.applet.*;

public class cardLayout extends Applet {
	Panel canvasCards = new Panel();
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	CardLayout cardDeck = new CardLayout();
	public void init() {
		canvasCards.setLayout(cardDeck);
		p1.setLayout(new BorderLayout());
		p2.setLayout(new BorderLayout());
		p3.setLayout(new BorderLayout());
		
		Canvas c1 = new Canvas();
		Canvas c2 = new Canvas();
		Canvas c3 = new Canvas();
		
		c1.setBackground(Color.black);
		c2.setBackground(Color.red);
		c3.setBackground(Color.green);
		 
		p1.add("Center", c1);
		p2.add("Center", c2);
		p3.add("Center", c3);
		
		canvasCards.add("p1", p1);
		canvasCards.add("p2", p2);
		canvasCards.add("p3", p3);
		
		setLayout(new BorderLayout());
		add("Center", canvasCards);
	}
	public boolean mouseDown(Event event, int x, int y) {
		cardDeck.next(canvasCards);
		return true;
	}
}
