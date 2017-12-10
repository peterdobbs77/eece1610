package april212015;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class Bomb extends FlyingObjects
{
	public int startX = 0;
	public int baseX = 125;
	public int startY = 0;
	public int baseY = 675;
	private int baseNumber;
	public int interX = 0;
	public int interY = 0;
	private final static int BOMB_SIZE=20;
	
	public Bomb(){
		Thread bombAnimationThread = new Thread(new Runnable() {
        public void run() {
            while (true) {
                repaint();
                try {Thread.sleep(2000);} catch (Exception ex) {}
            }
        }});
		bombAnimationThread.start();
	}
	//-------------------------------------
	public void paintComponent(Graphics g)
	{   
		Random r = new Random();
		baseNumber = r.nextInt(3);
//		startX = r.nextInt(750)+25;
//		if (baseNumber == 0){
//			baseX = 175;
//		}
//		if (baseNumber == 1){
//			baseX = 375;
//		}
//		if (baseNumber == 2){
//			baseX = 575;
//		}
		
		double dx=(baseX-startX)*(.05);
		double dy=(baseY-startY)*(.05);
		g.setColor(Color.GREEN);
		g.fillOval(interX, interY, BOMB_SIZE, BOMB_SIZE);
	
		interX += dx;
		interY += dy;
//		moveComponent(g);
	}
	//-------------------------------------
	public void moveComponent(Graphics g){
		
		
//		while (interY<(baseY-75)){
			
			g.setColor(Color.GREEN);
			g.fillOval(interX-10, interY-10, 20, 20);
//		}
	}
}
