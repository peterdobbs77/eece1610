package secondary;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.Timer;

// Graphics class
@SuppressWarnings("serial")
class Draw extends JPanel{
	
	private static int xCoord, yCoord;
	public final int BASE = 3;
	public final int BASE_SPACING = 150;
	public final int BASE_WIDTH = 50;
	public final int BASE_HEIGHT = 75;
	public final int WORLD_WIDTH = 700;
	public final int WORLD_HEIGHT = 700;
	public final int MISSILE_SIZE = 50;
	public final int BOMB_SIZE = 20;
	public AL mouseAdapter;
	public ActionListener listener;
	//private Vector things;
	public Timer timer;
	//---------------------------
	public Draw(){
		
		setBackground(Color.BLACK);
		setBounds(0,0,WORLD_WIDTH,WORLD_HEIGHT);
		setOpaque(true);
		addMouseListener(new AL());
		listener = new Listener();
	}
	//-------------------------------
	public void drawFlash(int x, int y)
	{
		xCoord = x;
		yCoord = y;
		repaint();
	}
	//------------------------------------
	public void paint(Graphics g){
		
		//super.paint(g);
		//bases
		createBases(g);
		//missiles
		createMissile(g);
		//bomb
		try {
			createBomb(g);
			repaint();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		repaint();
	}	
	//-----------------------------------
	public void createBases(Graphics g){
		
		for (int i=0, x=BASE_SPACING; i<BASE; i++, x+=BASE_WIDTH+BASE_SPACING){
			g.setColor(Color.BLUE);
			g.fillRect(x, WORLD_HEIGHT-BASE_HEIGHT, BASE_WIDTH, BASE_HEIGHT);
		}
	}
	//--------------------------------------
	public void createBomb(Graphics g) throws InterruptedException{
		
		Bomb b = new Bomb();
		g.setColor(Color.MAGENTA);
		g.fillOval(b.interX-10, b.interY-10, BOMB_SIZE, BOMB_SIZE);
		while(b.interY<=(WORLD_HEIGHT-BASE_HEIGHT)){
			b.animateBomb(g);
			repaint();
			Thread.sleep(50);
		}
		repaint();
	}
	//--------------------------------
	public void createMissile(Graphics g){
		
//		g.setColor(Color.CYAN);
//		g.drawLine(375, 625, xCoord, yCoord);
//		for (int i=0; i<MISSILE_SIZE; i++){
			g.setColor(Color.RED);
			g.fillOval(xCoord-MISSILE_SIZE/2, yCoord-MISSILE_SIZE/2, MISSILE_SIZE, MISSILE_SIZE);
			repaint();
//		}
	}
	//-----------------------------------
	//allows for mouse clicks to be interpreted as point (x, y)
	public class AL extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e){
			
			xCoord = e.getX();
			yCoord = e.getY();
			drawFlash(xCoord,yCoord);
			repaint();
			//label2.setText("Missiles = "+nMissiles--);
		}
	}
	private class Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			
		}
			
	}
	
}