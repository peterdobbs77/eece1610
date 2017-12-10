package MissileCommando;
import java.awt.Color;
import java.awt.Graphics;
/* A missile which moves from X1,Y1 to X2,Y2 with velocity V.  A
missile can randomly replicate itself into 3 missiles. */
class Missile extends Thing{
	
    private boolean paintme = false;
    private int X1 = 0;
    private int Y1 = 0;
    private int X2 = 0;
    private int Y2 = 0;
    private int V = 0;
    private float m = 0;
    private float b = 0;
    private float x = 0;
    private float y = 0;
    private boolean replicate = false;
    //------------------------------------
    Missile(MissileCommando parent, Color color, int x1, int y1, int x2, int y2, int v)
    {
    	this.parent = parent;
    	X = X1;
    	Y = Y1;
    	this.color = color;
    	X1 = x1;
    	Y1 = y1;
    	X2 = x2;
    	Y2 = y2;
    	V = v;	
    	start ();
    }
    public void run()
    {
    	Thread.currentThread().setPriority (Thread.MIN_PRIORITY);
    	m = (float) (Y2 - Y1) / (X2 - X1);
    	b = Y1 - (m*X1);
    	x = X1;
    	y = Y1;
    	/* 10% chance this missile will replicate. */
    	replicate = Math.random() > 0.90;
    	if (replicate)
    	{
    		color = Color.magenta;
    	}
    	while (y <= Y2)
    	{
    		/* 25% chance this missile will replicate now. */
    		if (replicate && y > Y1+5*V && Math.random() > 0.75)
    		{
    			for (int i = 0; i < 3; i++)
    			{
    				parent.createMissile(X, Y, V);
    			}
    			/* stop the current missile */
    			break;
    		}
    		paintme = true;
    		parent.repaint ();
    		try 
    		{
    			Thread.sleep (100);
    		}
    		catch (InterruptedException e)
    		{
    		}
    	}
    	paintme = true;
    	parent.repaint ();
    	}
    public boolean hit (Missile m)
    {
    	return m.X == X && m.Y == Y;
    }
    public void explode ()
    {
    	stop ();
    }
    public void paint (Graphics g)
    {
    	if (paintme)
    	{
    		g.setColor (Color.lightGray);
    		g.drawLine (X1, Y1, X, Y);
    		y += V;
    		x = (y - b) / m;
    		X = (int)x;
    		Y = (int)y;
    		g.setColor (color);
    		g.drawLine (X1, Y1, X, Y);
    		paintme = false;
    	}
    }
    public void erase (Graphics g)
    {
    	g.setColor (Color.lightGray);
    	g.drawLine (X1, Y1, X, Y);
    }
}