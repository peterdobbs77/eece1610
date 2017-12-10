package MissileCommando;
import java.awt.Color;
import java.awt.Graphics;
/* Draw a blinking message. */
class Message extends Thing
{
    private String message;
    private int blinks;
    private int delay;
    private int blinkCount;
    //-----------------------
    Message (MissileCommando parent, String message, int x, int y, int blinks, int delay)
    {
    	this.parent = parent;
    	this.message = message;
    	X = x;
    	Y = y;
    	this.blinks = blinks;
    	this.delay = delay;
    	color = Color.black;
    	start ();
    }
    Message (MissileCommando parent, String message, int x, int y, int blinks)
    {
    	this (parent, message, x, y, blinks, 500);
    }
    Message (MissileCommando parent, String message, int x, int y)
    {
    	this (parent, message, x, y, 3, 500);
    }
    public void run ()
    {
    	Thread.currentThread().setPriority (Thread.MIN_PRIORITY);
    	for (blinkCount = 0; blinkCount < 2*blinks; blinkCount++)
    	{
    		parent.repaint ();
    		try 
    		{
    			Thread.sleep (delay);
    		}
    		catch (InterruptedException e)
            {
            }
    	}
    	parent.repaint ();
    }
    public void paint (Graphics g)
    {
    	if ((blinkCount % 2) == 0)
    	{
    		g.setColor (color);
    	}
    	else
    	{
    		g.setColor (Color.lightGray);
    	}
    	g.drawString (message, X, Y);
    }
    public void erase (Graphics g)
    {
    	g.setColor (Color.lightGray);
    	g.drawString (message, X, Y);
    }
    public boolean hit (Missile m)
    {
    	return false;
    }
    public void explode ()
    {
    }
}