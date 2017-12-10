import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Base extends JPanel{
	
	//dimensions
	//colors
	//location
	public Base(){
		//constructor for base object
	}
	
	public void paintBase(Graphics g, int x){
		Graphics2D base = (Graphics2D)g;
		base.setColor(Color.blue);
		base.fillRect(x, 650, 50, 50);
	}
	
	public void baseDisappear(){
		//this.delete;
		//explosion graphic
		//changeScore(-500);
	}
	
	
	

}
