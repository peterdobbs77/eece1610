package april252015;

import java.awt.*;
import java.util.*;

//import java.awt.event.*;
//import java.applet.*;
import javax.swing.*;

@SuppressWarnings("serial")
//class for creating missiles
class Missile {	
	
	private int xCoord = 0, yCoord = 0;
	int missileX=150;
	int missileY=625;
	private final static int BOMB_SIZE=20;
	//----------------------
	public Missile(int x, int y){
		
		xCoord = x;
		yCoord = y;
	}
	//----------------------
	public void magentaMissile(Graphics g){
		
		int x = xCoord;
        int y = yCoord;
        double dx = (150-x)*.1;
        double dy = (625-y)*.1;
        g.setColor(Color.MAGENTA);
        g.fillOval(missileX, missileY, BOMB_SIZE, BOMB_SIZE);
        missileX-=dx;
        missileY-=dy;
	}
	//----------------------
	public int getXCoord(){
		return xCoord;
	}
	//----------------------
	public int getYCoord(){
		return yCoord;
	}
}