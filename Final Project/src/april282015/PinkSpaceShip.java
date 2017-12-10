package april282015;

import java.awt.*;

public class PinkSpaceShip {

	public int xCoord = 0;
	public int yCoord = 450;
	public int pinkW = 10;
	public int pinkH = 75;
	public double pinkSpeed = 10;
	//--------------------------------
	public void pinkSpaceship(Graphics g){
		
        g.setColor(Color.PINK);
        g.fillOval(xCoord, yCoord, pinkH, pinkW);
        xCoord += pinkSpeed;
	}
}
