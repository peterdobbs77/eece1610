package april252015;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

import javax.swing.*;

public class GamePanel extends JPanel {

	private final static int GAME_WIDTH=700;
	private final static int GAME_HEIGHT=700;
	private Bomb bomb;
	private Spaceship spaceship;
	//-------------------------------
	public GamePanel(){
		
		setBackground(Color.BLACK);
		setBounds(0, 0, GAME_WIDTH, GAME_HEIGHT);
		setOpaque(false);
		
//		bomb = new Bomb();
		spaceship = new Spaceship();
		
		add(bomb);
//		add(spaceship);
	}
	//-----------------------------
	
	
}