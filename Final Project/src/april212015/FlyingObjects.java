package april212015;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
class FlyingObjects extends JComponent
{
	private int lastX = 0;
	private int lastY = 0;
	private Bomb bomb;
	
	public FlyingObjects(){
		Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    repaint();
                    try {Thread.sleep(200);} catch (Exception ex) {}
                }
            }
        });
        animationThread.start();
	}
	//------------------------------------
	public void paintComponent(Graphics g)
	{
		Graphics2D gg = (Graphics2D) g;
		//==================================================
		//create pink spaceship
        int w = getWidth();
        int h = getHeight();

        int spaceship1W = 100;
        int spaceship1H = 10;
        int spaceship1Speed = 3;

        int x = lastX + spaceship1Speed;

        if (x > w + spaceship1W) {
            x = -spaceship1W;
        }

        gg.setColor(Color.PINK);
        gg.fillRect(x, h/2 + spaceship1H, spaceship1W, spaceship1H);

        lastX = x;
        
        //============================================
        //create orange spaceship
        int w2 = getWidth();
        int h2 = getHeight();
        
        int spaceship2W = 50;
        int spaceship2H = 20;
        int spaceship2Speed = 2;
        
        int y = lastY + spaceship2Speed;
        
        if(y > h2 + spaceship2H){
        	y = -spaceship2H;
        }
        
        gg.setColor(Color.ORANGE);
        gg.fillOval(x, y, spaceship2W, spaceship2H);
        
        lastY = y;
        
        //=======================================
        bomb = new Bomb();
        bomb.paintComponent(gg);
        
        //create green bomb
//      Random r = new Random();
//		basenumber = r.nextInt(3);
//		x1 = r.nextInt(750)+25;
//		if (basenumber == 0){
//			base_x = 175;
//		}
//		if (basenumber == 1){
//			base_x = 375;
//		}
//		if (basenumber == 2){
//			base_x = 575;
//		}
//		y1 = 0;
//		interx = x1;
//		intery = y1;
//		double dx=(base_x-x1)*(.05);
//		double dy=(BASE_Y-y1)*(.05);
//		interx += dx;
//		intery += dy;
//		if(interx> intery){
//			x1 = interx;
//		}
//		g.setColor(Color.GREEN);
//		g.fillOval(interx-10, intery-10, 20, 20);
		
//		y1 = intery;
//        int w3 = getWidth();
//        int h3 = getHeight();
//        
//        int interx = x + 3;
//        
//        if(x > y+1){
//        	x = -interx;
//        }
//        
//        gg.setColor(Color.ORANGE);
//        gg.fillOval(interx, intery, w3, h3);
//        
//        lastY = intery;
        
        //===============================================
//        Random r = new Random();
//		basenumber = r.nextInt(3);
//		x1 = r.nextInt(750)+25;
//		if (basenumber == 0){
//			base_x = 175;
//		}
//		if (basenumber == 1){
//			base_x = 375;
//		}
//		if (basenumber == 2){
//			base_x = 575;
//		}
//		y1 = 0;
//		interx = x1;
//		intery = y1;
//		
//		double dx=(base_x-x1)*(.05);
//		double dy=(BASE_Y-y1)*(.05);
//		interx += dx;
//		intery += dy;
//		g.setColor(Color.GREEN);
//		g.fillOval(interx-10, intery-10, 20, 20);
        
	}
}
