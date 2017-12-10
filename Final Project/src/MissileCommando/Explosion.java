package MissileCommando;
import java.awt.Color;
import java.awt.Graphics;
/* Generic explosion which draws a circle that grows and shrinks.  The
explosion is draw at X,Y and has a maximum size of S. */
class Explosion extends Thing
{
	private boolean paintme = false;
	private int S = 0;
	public int size = 0;
	private int scale = 0;
	//-------------------------------
 Explosion (MissileCommando parent, Color color, int x, int y, int s)
 {
 	this.parent = parent;
 	X = x;
 	Y = y;
 	this.color = color;
 	S = s;
 	start ();
 }
 public void run ()
 {
 	Thread.currentThread().setPriority (Thread.MIN_PRIORITY);
 	/* grow */
 	scale = 10;
 	size = 1;
 	do
 	{
 		paintme = true;
 		parent.repaint ();
 		try 
 		{
 			Thread.sleep (50);
 		}
 		catch (InterruptedException e)
         {
         }
 	} while (size <= S);
 	/* shrink */
 	scale = -10;
 	do
 	{
 		paintme = true;
 		parent.repaint ();
 		try
 		{
 			Thread.sleep (100);
 		}
 		catch (InterruptedException e)
 		{
         }
 	} while (size >= 0);
 	paintme = true;
 	parent.repaint ();
 }
 public boolean hit (Missile m)
 {
 	return (m.X >= (X - size/2) && m.X <= (X + size/2)
 			&& m.Y >= (Y - size/2) && m.Y <= (Y + size/2));
 }
 public void explode ()
 {
 }
 public void paint (Graphics g)
 {
 	if (paintme)
 	{
 		if (scale < 0)
 		{
 			g.setColor (Color.lightGray);
 			g.fillOval (X - size/2, Y - size/2, size, size);
 		}  
 		size += scale;
 		g.setColor (color);
 		g.fillOval (X - size/2, Y - size/2, size, size);
 		paintme = false;
 	}
 }
 public void erase (Graphics g)
 {
 }
}
/* A shot explosion base on Explosion. */
class ShotExplosion extends Explosion
{
    ShotExplosion (MissileCommando parent, int x, int y)
    {
    	super (parent, Color.black, x, y, 60);
    }
}
//===========================================================
/* A base explosion base on Explosion. */
class BaseExplosion extends Explosion
{
    BaseExplosion (MissileCommando parent, int x, int y)
    {
    	super (parent, Color.red, x, y, 100);
    }
}