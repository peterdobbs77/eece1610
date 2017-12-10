import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Primary extends JPanel {
	
	private static int xCoord;
	private static int yCoord;
	private static DrawFlash object = new DrawFlash();

//	public void paint(Graphics g){
//		super.paint(g);
//		Graphics2D ground = (Graphics2D) g;
//		ground.setColor(Color.green);
//		ground.fillRect(0, 700, 800, 55);
//		ground.setColor(Color.black);
//		ground.fillRect(0, 0, 800, 700);
//		Base base1 = new Base();
//		Base base2 = new Base();
//		Base base3 = new Base();
//		base1.paintBase(g, 100);
//		base2.paintBase(g, 350);
//		base3.paintBase(g, 650);
//		
//	}
	
	public static void main(String[] args) {
		
		Primary gameScreen = new Primary();
		JFrame frame = new JFrame("Mission Control");
		frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gameScreen);
		frame.add(object);
		object.addMouseListener(new AL());		

	}
	
	static class AL extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e){
			xCoord = e.getX();
			yCoord = e.getY();
			object.drawFlash(xCoord, yCoord);

		}
	}
}
