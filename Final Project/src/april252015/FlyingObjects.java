package april252015;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
class FlyingObjects extends JComponent{
	
	private int lastX = 0;
	private int lastY = 0;
	private int startX = 10;
	private int baseX = 150;
	private int startY = 10;
	private int baseY = 625;
	protected int bombX = 0;
	protected int bombY = 0;
	private int baseNumber;
	private int missileX = 150;
	private int missileY = 650;
	private int lvl;
	private int xCoord, yCoord;
	public boolean base1Exists;
	public boolean base2Exists;
	public boolean base3Exists;
	private Missile missile;
	private Missile missile2;
	private MListener mouseListener;
	private Color color1 = Color.BLUE;
	private Color color2 = Color.BLUE;
	private Color color3 = Color.BLUE;
	private final static int BASES = 3;
	private final static int BOMB_SIZE=20;
	//-----------------------------------------
	public FlyingObjects(){
		
		setBounds(0,0,700,700);
		setOpaque(false);
		
		base1Exists=true;
		base2Exists=true;
		base3Exists=true;
		
		Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    repaint();
                    try {Thread.sleep(150);} catch (Exception ex) {}
                }
            }
        });
        animationThread.start();
        
        missile = new Missile(xCoord, yCoord);
        mouseListener = new MListener();
        addMouseListener(mouseListener);
        
	}
	//------------------------------------
	public void paintComponent(Graphics g){
		
		// bases
		g.setColor(color1);
		g.fillRect(125, 625, 50, 75);
		g.setColor(color2);
		g.fillRect(325, 625, 50, 75);
		g.setColor(color3);
		g.fillRect(525, 625, 50, 75);
		
		//create cyan bomb
        greyBomb(g);
        
        // magenta missile
        missile.magentaMissile(g);
		
        //create pink spaceship
        if (lvl>=2){
        	pinkSpaceship(g);
        }
        
        //create orange spaceship
        if (lvl>=3){
        	orangeSpaceship(g);
        }
        
        // 
//        if(missileX<=xCoord&&missileY<=yCoord){
//        	
//        	g.setColor(Color.RED);
//        	g.fillOval(xCoord-25, yCoord-25, 50, 50);
//        	missileX=150;
//        	missileY=650;
//        	
////        	magentaMissile(g);
//        }
        
        // missile collision with bomb
        int r = 50;
        	// if the distance between missile and bomb is less that the explosion radius...
        if(Math.sqrt(Math.pow(missile.missileX-bombX,2)+Math.pow(missile.missileY-bombY,2)) <= r){
        	// explode at collision
        	g.setColor(Color.RED);
        	g.fillOval(missile.missileX-25, missile.missileY-25, 50, 50);
			// crease new bomb
        	Random rand = new Random();
        	startX=rand.nextInt(650)+25;
			baseNumber = rand.nextInt(BASES);
			if (baseNumber==0&&base1Exists==true){
				baseX = 175;
			}
			if (baseNumber==1&&base2Exists==true){
				baseX = 375;
			}
			if (baseNumber==2&&base2Exists==true){
				baseX = 575;
			}
			bombX=startX;
			bombY=0;
        }
        // bomb collision with base
        if (bombY>=625){
        	if (bombX>125&&bombX<175){
        		g.setColor(Color.ORANGE);
            	g.fillOval(bombX-50, bombY-50, 100, 100);
            	color1 = Color.WHITE;
            	base1Exists=false;
        	}
        	if (bombX>325&&bombX<375){
        		g.setColor(Color.ORANGE);
            	g.fillOval(bombX-50, bombY-50, 100, 100);
            	color2 = Color.WHITE;
            	base2Exists=false;
        	}
        	if (bombX>525&&bombX<575){
        		g.setColor(Color.ORANGE);
            	g.fillOval(bombX-50, bombY-50, 100, 100);
            	color3 = Color.WHITE;
            	base3Exists=false;
        	}
        }
        // bomb collision with ground
        if (bombY>=700){
        	g.setColor(Color.ORANGE);
        	g.fillOval(bombX-50, bombY-50, 100, 100);
        }
	}
	//---------------------------------------
	public void greyBomb(Graphics g){
		
		double dx=(baseX-startX)*(.05);
		double dy=(baseY-startY)*(.05);
		g.setColor(Color.DARK_GRAY);
		g.fillOval(bombX-10, bombY-10, BOMB_SIZE, BOMB_SIZE);
		bombX += dx;
		bombY += dy;
		if (bombX>getWidth()-25||bombY>getHeight()-25){
			Random r = new Random();
			startX=r.nextInt(650)+25;
			baseNumber = r.nextInt(BASES);
			if (baseNumber == 0){
				baseX = 175;
			}
			if (baseNumber == 1){
				baseX = 375;
			}
			if (baseNumber == 2){
				baseX = 575;
			}
			bombX=startX;
			bombY=0;
		}
	}
	//-------------------------------------------
	public void pinkSpaceship(Graphics g){
		
		int w = getWidth();
        int h = getHeight();

        int spaceship1W = 100;
        int spaceship1H = 10;
        int spaceship1Speed = 3;

        if (lastX > w + spaceship1W) {
            lastX = -spaceship1W;
        }

        g.setColor(Color.PINK);
        g.fillRect(lastX, h/2 + spaceship1H, spaceship1W, spaceship1H);

        lastX += spaceship1Speed;
	}
	//-----------------------------
	public void orangeSpaceship(Graphics g){
		
		int w2 = getWidth();
        int h2 = getHeight();
        
        int spaceship2W = 50;
        int spaceship2H = 20;
        int spaceship2Speed = 2;
        
        if(lastY > h2 + spaceship2H){
        	lastY = -spaceship2H;
        }
        
        g.setColor(Color.ORANGE);
        g.fillOval(lastX, lastY, spaceship2W, spaceship2H);
        
        lastY += spaceship2Speed;
	}
	
	public void setXYCoords(int x, int y){
		
		xCoord = new Integer(x);
		yCoord = new Integer(y);
	}
	//--------------------------------
	class MListener implements MouseListener{
		
		public void mouseClicked(MouseEvent e){
			
			int x = e.getX();
			int y = e.getY();
			missile = new Missile(x, y);
//			missile2 = new Missile(x+100, y+100);
		}
		@Override
		public void mouseEntered(MouseEvent e){	
		}
		@Override
		public void mouseExited(MouseEvent e){	
		}
		@Override
		public void mousePressed(MouseEvent e){	
		}
		@Override
		public void mouseReleased(MouseEvent e){
		}
//		public void paint(Graphics g){
////			if (xCoord>=0&&xCoord<=250){
////				baseX = 150;
////			}
////			if (xCoord>250&&xCoord<=450){
////				baseX = 350;
////			}
////			if (xCoord>450&&xCoord<=700){
////				baseX = 650;
////			}
//			
//			currentX=baseX;
//			currentY=625;
//			double dx2=(baseX-xCoord)*(.05);
//			double dy2=(baseY-yCoord)*(.05);
//			g.setColor(Color.MAGENTA);
//			g.fillOval(currentX-10, currentY-10, BOMB_SIZE, BOMB_SIZE);
//			currentX -= dx2;
//			currentY -= dy2;
//		}
	}
}