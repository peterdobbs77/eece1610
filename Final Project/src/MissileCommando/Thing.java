package MissileCommando;

import java.awt.Color;
import java.awt.Graphics;

/* Abstract class used for moving objects, etc. */
abstract class Thing extends Thread
{
	MissileCommando parent;
	public int X;
	public int Y;
	Color color;
    abstract void paint(Graphics g); /* paint the object */
    abstract void erase(Graphics g); /* erase the object */
    abstract boolean hit(Missile m); /* did this missile hit the object? */
    abstract void explode(); /* explode the object */
}