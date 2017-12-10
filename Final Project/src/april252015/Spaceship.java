package april252015;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Spaceship extends JComponent {

	private int lastX = 0;
	private int lastY = 0;
	//----------------------------
	public Spaceship(){
		
//		Thread animationThread = new Thread(new Runnable() {
//            public void run() {
//                while (true) {
//                    repaint();
//                    try {Thread.sleep(200);} catch (Exception ex) {}
//                }
//            }
//        });
//        animationThread.start();
	}
	//------------------------------
	public void paintComponent(Graphics g){
		
		Graphics2D gg = (Graphics2D) g;
		
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
        
	}
}
