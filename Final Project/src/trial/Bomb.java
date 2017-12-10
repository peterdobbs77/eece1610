package trial;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
@SuppressWarnings("serial")
public class Bomb extends JPanel {

	public Rectangle rect;
	
	public int rectW = 24;
	public int rectH = 36;
	
	public Bomb(){
		rect = new Rectangle(180, 180, rectW, rectH);
		
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.black);
		g.setColor(Color.WHITE);
		g.fillRect(rect.x, rect.y, rectW, rectH);
	}
	
	class KA extends KeyAdapter{
		
		public void keyPressed(KeyEvent e){
			
		}
		
	}
}
