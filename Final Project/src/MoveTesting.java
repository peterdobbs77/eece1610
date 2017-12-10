import javax.swing.*;

import java.awt.*;

@SuppressWarnings("serial")
public class MoveTesting extends JPanel {

	private static int x = 0;
	private static int y = 0;
	private static final int X_BOUNDARY = 300;
	private static final int Y_BOUNDARY = 400;
	
	private void moveBall(){
		x++;
		y++;
	}
	
	@Override
	public void paint(Graphics g){
//		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 30, 30);
	}
	
	public static void main(String[] args) throws InterruptedException{
		JFrame frame = new JFrame("Mini Tennis");
		MoveTesting game = new MoveTesting();
		frame.add(game);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true){
			game.moveBall();
			game.repaint();
			Thread.sleep(10);
			if (x==X_BOUNDARY) break;
		}
	}
}