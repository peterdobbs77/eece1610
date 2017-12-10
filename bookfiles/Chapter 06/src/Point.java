/*
 * Chapter 6 Homework Problem 1
 * In Class Assignment 21
 * 
 * @author Peter Dobbs
 */

class Point 
{
	private double x;
	private double y;
	//--------------------
	public Point()
	{
		x = 0.0;
		y = 0.0;
	}
	//--------------------------------
	public Point(double xx, double yy)
	{
		x = xx;
		y = yy;
	}
	//---------------------------------
	public double distanceFromOrigin()
	{
		double sum = Math.pow(x, 2)+Math.pow(y, 2);
		double d = Math.sqrt(sum);
		return d;
	}
	//----------------------------------
	public String toString()
	{
		String s = "("+x+", "+y+")";
		return s;
	}
	//---------------------------------
	public static void main(String[] args)
	{
		Point p = new Point();
		System.out.println("Point "+p.toString()+" is this far from origin: "
							+p.distanceFromOrigin());
		p = new Point(3.0, 4.0);
		System.out.println("Point "+p.toString()+" is this far from origin: "
							+p.distanceFromOrigin());
	}
}