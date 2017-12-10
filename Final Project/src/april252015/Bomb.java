package april252015;


import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class Bomb extends JComponent{
	public int startX = 0;
	public int baseX = 150;
	public int startY = 0;
	public int baseY = 625;
	private int baseNumber;
	public int bombX = 0;
	public int bombY = 0;
	private int xCoord, yCoord;
	private final static int BASES = 3;
	private final static int BOMB_SIZE=20;
	
	public Bomb(){
		
		
	}
	
	//---------------------------
//	public void cyanBomb(Graphics g){
//		
//		double dx=(baseX-startX)*(.05);
//		double dy=(baseY-startY)*(.05);
//		g.setColor(Color.CYAN);
//		g.fillOval(bombX-10, bombY-10, BOMB_SIZE, BOMB_SIZE);
//		bombX += dx;
//		bombY += dy;
//		if (bombX>getWidth()-75||bombY>getHeight()-75){
//			Random r = new Random();
//			startX=r.nextInt(650)+25;
//			baseNumber = r.nextInt(BASES);
//			if (baseNumber == 0){
//				baseX = 175;
//			}
//			if (baseNumber == 1){
//				baseX = 375;
//			}
//			if (baseNumber == 2){
//				baseX = 575;
//			}
//			bombX=startX;
//			bombY=0;
//		}
//	}
	//-------------------------------------
	public void paintComponent(Graphics g)
	{   
		
		double dx=(baseX-startX)*(.005);
		double dy=(baseY-startY)*(.005);
		g.setColor(Color.GREEN);
		g.fillOval(bombX, bombY, BOMB_SIZE, BOMB_SIZE);
	
		bombX += dx;
		bombY += dy;
		
		if (bombY==625){
			bombY=0;
			Random r = new Random();
			baseNumber = r.nextInt(3);
			startX = r.nextInt(750)+25;
			if (baseNumber == 0){
				baseX = 175;
			}
			if (baseNumber == 1){
				baseX = 375;
			}
			if (baseNumber == 2){
				baseX = 575;
			}
		}
	}
	//----------------------------------------
	class MListener implements MouseListener{
		
		public void mouseClicked(MouseEvent e){
			
//			xCoord = e.getX();
//			yCoord = e.getY();
		}
		@Override
		public void mouseEntered(MouseEvent e){	
		}
		@Override
		public void mouseExited(MouseEvent e){	
		}
		@Override
		public void mousePressed(MouseEvent e){	
		}
		@Override
		public void mouseReleased(MouseEvent e){
		}
//		public void paint(Graphics g){
////			if (xCoord>=0&&xCoord<=250){
////				baseX = 150;
////			}
////			if (xCoord>250&&xCoord<=450){
////				baseX = 350;
////			}
////			if (xCoord>450&&xCoord<=700){
////				baseX = 650;
////			}
//			
//			currentX=baseX;
//			currentY=625;
//			double dx2=(baseX-xCoord)*(.05);
//			double dy2=(baseY-yCoord)*(.05);
//			g.setColor(Color.MAGENTA);
//			g.fillOval(currentX-10, currentY-10, BOMB_SIZE, BOMB_SIZE);
//			currentX -= dx2;
//			currentY -= dy2;
//		}
	}
}
