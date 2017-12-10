package secondary;
import javax.swing.*;

import java.awt.*;
//import java.util.*;
import java.awt.event.*;
@SuppressWarnings("serial")
//===========================
class Secondary extends JFrame{
	
	public Container contentPane;
	public JPanel scorePanel = new JPanel();
	public JLabel scoreLabel, missileCountLabel;
	public Draw draw = new Draw();
	public MouseListener mouseListener;
	public int score, nMissiles;
	//-----------------------
	public Secondary(){
		
		setTitle("Mission Control - 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(800, 800));
		setBackground(Color.BLACK);
		setOpacity(1.0f);
		setResizable(false);
		setLayout(new BorderLayout());
//		//setResizable(false);
//		//setLayout(new BorderLayout());
		mouseListener = new AL();
		addMouseListener(mouseListener);
		
		scorePanel.setBackground(Color.GRAY);
		scorePanel.setBounds(700,725,100,75);
		scorePanel.setOpaque(true);
		score = 0;
		scoreLabel = new JLabel("Score = "+score);
		// number of missiles
		nMissiles = 10;
		missileCountLabel = new JLabel("Missiles = "+nMissiles);
		scorePanel.addMouseListener(mouseListener);
		scorePanel.add(scoreLabel);
		scorePanel.add(missileCountLabel);
		
		contentPane = getContentPane();
		//contentPane.setLayout(new BorderLayout());
		contentPane.add(draw, BorderLayout.CENTER);
		contentPane.add(scorePanel, BorderLayout.CENTER);
		contentPane.addMouseListener(mouseListener);
		
		add(draw);
		pack();
		setVisible(true);
	}
	//-----------------------------------------
	public static void main(String[] args){
		
		new Secondary();
	}
	//-----------------------------------
	//allows for mouse clicks to be interpreted as point (x, y)
	private class AL implements MouseListener{
		
		public void mouseClicked(MouseEvent e){
			
			missileCountLabel.setText("Missiles = "+nMissiles--);
			repaint();
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
	//-------------------------------------
//	private class Listener implements ActionListener{
//		
//		public void actionPerformed(ActionEvent e){
//			
//			if (e.getSource() == bombButton)
//				scoreLabel.setText("Score = "+(score+=100));
//		}
//	}
}