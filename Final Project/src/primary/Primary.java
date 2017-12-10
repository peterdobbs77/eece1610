package primary;
import java.awt.*;

//import java.applet.*;
import javax.swing.*;

import java.util.*;
import java.awt.event.*;

//draws Graphics
@SuppressWarnings("serial")
class Draw extends JPanel
{
	private static int xCoord;
	private static int yCoord;
	//---------------------------
	public void drawFlash(int x, int y){
		
		xCoord = x;
		yCoord = y;
		repaint();
	}
	//----------------------------
	public void paint(Graphics g){
		
		super.paint(g);
		//background
		Graphics2D ground = (Graphics2D) g;
		ground.setColor(Color.GREEN);
		ground.fillRect(0, 700, 800, 55);
		ground.setColor(Color.black);
		ground.fillRect(0, 0, 800, 700);
		//bases
		Base base1 = new Base();
		Base base2 = new Base();
		Base base3 = new Base();
		base1.paintBase(g, 100);
		base2.paintBase(g, 350);
		base3.paintBase(g, 650);
		//missiles
		g.setColor(Color.RED);
		g.fillOval(xCoord-10, yCoord-10, 20, 20);
		//bomb
	}
	//------------------------------
	
}

//class for creating bases
@SuppressWarnings("serial")
//===========================
class Base extends JPanel
{	
	public Base()
	{
		
	}
	public void paintBase(Graphics g, int xx)
	{
		Graphics2D base = (Graphics2D)g;
		base.setColor(Color.BLUE);
		base.fillRect(xx, 650, 50, 50);
	}
	
	public void baseDisappear()
	{
		//this.delete;
		//explosion graphic
		//changeScore(-500);
	}
}
//===========================
//class for creating missiles
class Missile
{	
	public Missile()
	{
		
	}
}
//===============================
//class for creating bombs
//@SuppressWarnings("serial")
//class Bomb extends JPanel {
//	public int x1;
//	public int baseX;
//	public int y1;
//	public int baseY = 675;
//	private int baseNumber;
//	public int interX;
//	public int interY;
//		
//	public Bomb()
//	{
//		Random r = new Random();
//		baseNumber = r.nextInt(3);
//		x1 = r.nextInt(750)+25;
//		if (baseNumber == 0){
//			baseX = 175;
//		}
//		if (baseNumber == 1){
//			baseX = 375;
//		}
//		if (baseNumber == 2){
//			baseX = 575;
//		}
//		y1 = 0;
//		interX = x1;
//		interY = y1;
//	}
//	
//	public void paintBomb(Graphics g, int xx, int yy)
//	{
//		Graphics2D bomb = (Graphics2D)g;
//		bomb.setColor(Color.CYAN);
//		bomb.drawLine(0, 0, baseX, baseY);
//	}
//	
//	public void bombDisappear()
//	{
//		//bomb.delete
//		//flash
//		//changeScore(50);
//	}
//
//}
//===========================

//===========================
class Plane
{
	
}
//===========================
class Score
{
	
}
//===========================
@SuppressWarnings("serial")
class Primary extends JFrame{
	
	public static int xCoord, yCoord;
	public static Draw draw = new Draw(); 
	public Primary(){
		
		//constructor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setTitle("Mission Control - 1");
		setResizable(false);
		setVisible(true);
		add(draw);
		draw.addMouseListener(new AL());
		//add(new Bomb());
		
	}
	
	public static void main(String[] args){
		
		new Primary();
	}

	//allows for mouse clicks to be interpreted as point (x, y)
		static class AL extends MouseAdapter{
			
			public void mouseClicked(MouseEvent e)
			{
				xCoord = e.getX();
				yCoord = e.getY();
				draw.drawFlash(xCoord, yCoord);
			}
		}
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalProject window = new FinalProject();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	**
	 * Create the application.
	
	public FinalProject() {
		initialize();
	}

	**
	 * Initialize the contents of the frame.
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	*/
}