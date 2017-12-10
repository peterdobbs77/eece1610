package MissileCommando;
import java.awt.Color;
import java.awt.Graphics;
/* A simple rectangular base.  This object just sits around waiting
 * to explode. */
class Base extends Thing
{
    private int W = 0;
    private int H = 0;
    //-----------------
    Base(MissileCommando parent, Color color, int x, int y, int w, int h)
    {
    	this.parent = parent;
    	X = x;
    	Y = y;
    	this.color = color;
    	W = w;
    	H = h;
    	start();
    }
    public void run()
    {
    	Thread.currentThread().setPriority (Thread.MIN_PRIORITY);
    	waitToDie();
    }
    public synchronized void waitToDie()
    {
    	try 
    	{
    		wait();
    	}
    	catch(InterruptedException e)
    	{
    	}
    }
    public synchronized void timeToDie()
    {
    	notify();
    }
    public boolean hit(Missile m)
    {
    	return(m.X >= X && m.X <= (X + W)
    			&& m.Y >= Y && m.Y <= (Y + H));
    }
    public void explode()
    {
    	timeToDie();
    	stop();
    }
    public void paint(Graphics g)
    {
    	g.setColor(color);
    	g.fillRect(X, Y, W, H);
    }
    public void erase(Graphics g)
    {
    	g.setColor(Color.lightGray);
    	g.fillRect(X, Y, W, H);
    }
}