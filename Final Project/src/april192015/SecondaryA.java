package april192015;

import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class SecondaryA extends JFrame implements ActionListener{
	
	private final static int FRAME_WIDTH=800;
	private final static int FRAME_HEIGHT=800;
	private final static int GAME_WIDTH=700;
	private final static int GAME_HEIGHT=700;
	private final static int BOMB_SIZE=20;
	public MouseListener mouseListener;
	public ActionListener listener;
	public int xCoord, yCoord;
	public JPanel gamePanel = new JPanel();
	public JPanel scorePanel, groundPanel, basePanel, bombPanel;
	public JComponent flyingobjectsComponent;
	public JLayeredPane panelHolder = new JLayeredPane();
	public JLabel currentScoreLabel, missileCountLabel, highScoreLabel;
	public JLabel gameVeteran1, gameVeteran2, gameVeteran3;
	public JButton bombButton;
	public int score, nMissiles, bombX, bombY;
	//-----------------------------------------
	public SecondaryA(){
			
		setTitle("Mission Control 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		setResizable(false);
		setLayout(new BorderLayout());		
		
		mouseListener = new AL();
		listener = new Listener();
		//addMouseListener(mouseListener);
		
		// game
		gamePanel.setBackground(Color.BLACK);
		gamePanel.setBounds(0, 0, GAME_WIDTH, GAME_HEIGHT);
		gamePanel.setOpaque(false);
		gamePanel.addMouseListener(mouseListener);
		
		// components
		flyingobjectsComponent = new FlyingObjects();
		
		// ground
		groundPanel = new JPanel();
		groundPanel.setBackground(Color.GREEN);
		groundPanel.setBounds(0, 700, 800, 75);
		
		// score panel
		scorePanel = new JPanel();
		scorePanel.setBackground(Color.RED);
		scorePanel.setBounds(700,0,100,800);
		scorePanel.setOpaque(true);
		score = 0;
		// current score
		currentScoreLabel = new JLabel("Score = "+score);
		// number of missiles
		nMissiles = 10;
		missileCountLabel = new JLabel("Missiles = "+nMissiles);
		// high score list:
		highScoreLabel = new JLabel("\nHigh Scores:");
		gameVeteran1 = new JLabel("1. LoLo");
		gameVeteran2 = new JLabel("2. Mrlrl   ");
		gameVeteran3 = new JLabel("3. Pistol Pete");
		scorePanel.add(currentScoreLabel);
		scorePanel.add(missileCountLabel);
		scorePanel.add(highScoreLabel);
		scorePanel.add(gameVeteran1);
		scorePanel.add(gameVeteran2);
		scorePanel.add(gameVeteran3);
		
		// bomb
		bombX=0;
		bombY=0;
		add(gamePanel);
		
		// ground
		add(groundPanel);
		
		for (int i=0, x=125; i<3; i++, x+=200){
			// bases
			makeBasePanel(x);
			add(basePanel);
		}
		// score
		add(scorePanel);
		
		// bomb
///		makeBombPanel();
		
		//gamePanel.add(spaceship1Component);
		//gamePanel.add(spaceship2Component);
		add(flyingobjectsComponent);
		//add(bomb1Component);
		//add(spaceship2Component);
		
		pack();
		setVisible(true);
	}
//========================================
class FlyingObjects extends JComponent
{
	private int lastX = 0;
	private int lastY = 0;
	
	private int x1;
	private int base_x;
	private int y1;
	private final int BASE_Y = 675;
	private int basenumber;
	private int interx;
	private int intery;
	
	public FlyingObjects(){
		Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    repaint();
                    try {Thread.sleep(20);} catch (Exception ex) {}
                }
            }
        });
        animationThread.start();
	}
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
        
        int y = lastY + spaceship1Speed;
        
        if(y > h2 + spaceship1H){
        	y = -spaceship1H;
        }
        
        gg.setColor(Color.ORANGE);
        gg.fillOval(x, y, spaceship1W, spaceship1H);
        
        lastY = y;
        
       //==============================================
        //create green bomb
        Random r = new Random();
		basenumber = r.nextInt(3);
		x1 = r.nextInt(750)+25;
		if (basenumber == 0){
			base_x = 175;
		}
		if (basenumber == 1){
			base_x = 375;
		}
		if (basenumber == 2){
			base_x = 575;
		}
		y1 = 0;
		interx = x1;
		intery = y1;
		double dx=(base_x-x1)*(.05);
		double dy=(BASE_Y-y1)*(.05);
		interx += dx;
		intery += dy;
		if(interx> intery){
			x1 = interx;
		}
		g.setColor(Color.GREEN);
		g.fillOval(interx-10, intery-10, 20, 20);
		
		y1 = intery;
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
//=====================================================

//=====================================================
//class Bomb1 extends JComponent
//{
//	private int x1;
//	private int base_x;
//	private int y1;
//	private final int BASE_Y = 675;
//	private int basenumber;
//	private int interx;
//	private int intery;
//	//private FPhissixks phys;
//	
//	public Bomb1(){
//		Thread animationThread = new Thread(new Runnable() {
//          public void run() {
//              while (true) {
//                  repaint();
//                  try {Thread.sleep(500);} catch (Exception ex) {}
//              }
//          }
//      });
//      animationThread.start();
//	}
//	public void paintComponent(Graphics g)
//	{   
//		Random r = new Random();
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
//		
//	}
//}
////=====================================================
		//------------------------------------
		public static void main(String[] args){
			
			new SecondaryA();
		}
		//-------------------------------------
		public void makeBasePanel(int x){
			
			basePanel = new JPanel();
			basePanel.setBackground(Color.BLUE);
			basePanel.setBounds(x, 625, 50, 75);
			basePanel.setOpaque(true);
		}
		//--------------------------------------
		public void makeBombPanel(){
			
			bombPanel = new JPanel();
			bombPanel.setBackground(Color.GRAY);
//			start();
			bombPanel.setOpaque(true);
			while(bombX<GAME_WIDTH-BOMB_SIZE&&bombY<GAME_HEIGHT-BOMB_SIZE){
				panelHolder.add(bombPanel);
				moveBombPanel();
			}
			makeBombButton();
			panelHolder.add(bombPanel);
		}
		//-------------------------------------
		public void moveBombPanel(){
			
			bombX++;
			bombY++;
//			checkCollision();
			bombPanel = new JPanel();
			bombPanel.setBackground(Color.GRAY);
			bombPanel.setBounds(bombX, bombY, BOMB_SIZE, BOMB_SIZE);
			bombPanel.setOpaque(true);
		}
		//---------------------------------
		public void makeBombButton(){
			
			bombButton = new JButton();
			bombButton.addActionListener(listener);
			bombPanel.add(bombButton);
		}
		//---------------------------------------
		public void checkCollision(){
			if (bombY == 625 && (bombX==150 || bombX==350 || bombX==550))
				System.out.println("Base Dead!");
		}
		//---------------------------------------
		//allows for mouse clicks to be interpreted as point (x, y)
		private class AL implements MouseListener{
			
			public void mouseClicked(MouseEvent e){
				
				xCoord = e.getX();
				yCoord = e.getY();
				missileCountLabel.setText("Missiles = "+(nMissiles--));
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		}
		//-----------------------------------------------
		private class Listener implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				
				if (e.getSource() == bombButton){
					currentScoreLabel.setText("Score = "+(score+=100));
					missileCountLabel.setText("Missiles = "+(nMissiles--));
				}
					
			}
		}
		//--------------------------------
		public void actionPerformed(ActionEvent e) {
//			
//			long duration = System.currentTimeMillis() - startTime;
//			double progress = (double)duration / (double)RUN_TIME;
//			if (progress > 1) {
//				progress = 1;
//				((Timer)e.getSource()).stop();
//			}
//			bombPanel.setBounds(bombX, bombY, 20, 20);
//			bombPanel.repaint();
		}
	}

