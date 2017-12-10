import java.awt.*;

import javax.swing.*;


@SuppressWarnings("serial")
public class DrawFlash extends JPanel{
	private static int xCoord;
	private static int yCoord;
	
	public void drawFlash(int xx, int yy){
		xCoord = xx;
		yCoord = yy;
		repaint();
	}

	public void paint(Graphics g){
		//Shape flash = new Ellipse2D.Float(x,y,20,20);
		super.paint(g);

		Graphics2D ground = (Graphics2D) g;
		ground.setColor(Color.green);
		ground.fillRect(0, 700, 800, 55);
		ground.setColor(Color.black);
		ground.fillRect(0, 0, 800, 700);
		Base base1 = new Base();
		Base base2 = new Base();
		Base base3 = new Base();
		base1.paintBase(g, 100);
		base2.paintBase(g, 350);
		base3.paintBase(g, 650);

		g.setColor(Color.red);
		g.fillOval(xCoord, yCoord, 20, 20);
	}
}
