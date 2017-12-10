package secondary;

import java.awt.*;
import java.util.*;
//import java.awt.event.*;
import javax.swing.*;
//class for creating bombs
@SuppressWarnings("serial")
class Bomb extends JPanel{
	
	public int x1;
	public int baseX;
	public int y1;
	public int baseY = 675;
	private int baseNumber;
	public int interX;
	public int interY;
	//-------------------------------
	public Bomb(){
		
		Random r = new Random();
		baseNumber = r.nextInt(3);
		x1 = r.nextInt(750)+25;
		if (baseNumber == 0){
			baseX = 175;
		}
		if (baseNumber == 1){
			baseX = 375;
		}
		if (baseNumber == 2){
			baseX = 575;
		}
		y1 = 0;
		interX = x1;
		interY = y1;
	}
	//-----------------------------------------------
	public void animateBomb(Graphics g) throws InterruptedException {
		
		double dx=(baseX-x1)*(.05);
		double dy=(baseY-y1)*(.05);
		interX += dx;
		interY += dy;
		g.setColor(Color.MAGENTA);
		g.fillOval(interX-10, interY-10, 20, 20);
		repaint();
	}
}