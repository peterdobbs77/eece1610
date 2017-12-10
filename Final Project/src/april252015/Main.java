package april252015;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class Main extends JFrame implements ActionListener{
	
	private final static int FRAME_WIDTH=800;
	private final static int FRAME_HEIGHT=800;
	private final static int GAME_WIDTH=700;
	private final static int GAME_HEIGHT=700;
	private final static int BOMB_SIZE=20;
	public MouseListener mouseListener;
	public ActionListener listener;
	public int xCoord, yCoord;
	public JPanel scorePanel, groundPanel, basePanel, bombPanel;
	public JComponent flyingobjectsComponent, bombComponent;
//	public JLayeredPane panelHolder = new JLayeredPane();
	public JLabel currentScoreLabel, missileCountLabel, highScoreLabel;
	public JLabel gameVeteran1, gameVeteran2, gameVeteran3;
	public JButton bombButton;
	public JPanel gamePanel;
	public Bomb bomb;
	public Spaceship spaceship;
	public int score, nMissiles, bombX, bombY;
	//-----------------------------------------
	public Main(){
			
		setTitle("Mission Control 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		setResizable(false);
		
		mouseListener = new AL();
		listener = new Listener();
		
		// components
		flyingobjectsComponent = new FlyingObjects();
		
		//addMouseListener(mouseListener);
		
		// game
		gamePanel = new JPanel();
		gamePanel.setBackground(Color.BLACK);
		gamePanel.setBounds(0, 0, GAME_WIDTH, GAME_HEIGHT);
		gamePanel.setOpaque(false);
		gamePanel.add(flyingobjectsComponent);
		add(gamePanel);
		
		// ground
		groundPanel = new JPanel();
		groundPanel.setBackground(Color.GREEN);
		groundPanel.setBounds(0, 700, 800, 75);
		groundPanel.setOpaque(true);
		
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
		gameVeteran2 = new JLabel("2. Mrlrl");
		gameVeteran3 = new JLabel("3. Pistol Pete");
		scorePanel.add(currentScoreLabel);
		scorePanel.add(missileCountLabel);
		scorePanel.add(highScoreLabel);
		scorePanel.add(gameVeteran1);
		scorePanel.add(gameVeteran2);
		scorePanel.add(gameVeteran3);
		
		// score
		add(scorePanel);
		
		// ground
		add(groundPanel);

		// flying objects
		add(flyingobjectsComponent);
		
		pack();
		setVisible(true);
	}
	//---------------------------------------
	public static void main(String[] args){
		
		new Main();
	}
	//-------------------------------------
//	public void makeBasePanel(int x){
//		
//		basePanel = new JPanel();
//		basePanel.setBackground(Color.BLUE);
//		basePanel.setBounds(x, 625, 50, 75);
//		basePanel.setOpaque(true);
//	}
	//--------------------------------------
//	public void makeBombPanel(){
//		
//		bombPanel = new JPanel();
//		bombPanel.setBackground(Color.GRAY);
//		bombPanel.setOpaque(true);
//		while(bombX<GAME_WIDTH-BOMB_SIZE&&
//				bombY<GAME_HEIGHT-BOMB_SIZE){
//			panelHolder.add(bombPanel);
//			moveBombPanel();
//		}
//		makeBombButton();
//		panelHolder.add(bombPanel);
//	}
//	//-------------------------------------
//	public void moveBombPanel(){
//		
//		bombX++;
//		bombY++;
//		bombPanel = new JPanel();
//		bombPanel.setBackground(Color.GRAY);
//		bombPanel.setBounds(bombX, bombY, BOMB_SIZE, BOMB_SIZE);
//		bombPanel.setOpaque(true);
//	}
//	//---------------------------------
//	public void makeBombButton(){
//	
//		bombButton = new JButton();
//		bombButton.addActionListener(listener);
//		bombPanel.add(bombButton);
//	}
//	//---------------------------------------
//	public void checkCollision(){
//		if (bombY == 625 && (bombX==150 || bombX==350 || bombX==550))
//			System.out.println("Base Dead!");
//	}
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
