/*
 * In Class Assignment 23
 * March 25, 2015
 * 
 * @author Peter Dobbs
 */

class Point
{
	private double x;
	private double y;
	private double z;
	//--------------------------------
	public Point()
	{
		x = 0;
		y = 0;
		z = 0;
	}
	//--------------------------------
	public Point(double xx, double yy, double zz)
	{
		x = xx;
		y = yy;
		z = zz;
	}
	//---------------------------------
	public double E_Distance(Point p)
	{
		double e = Math.sqrt(Math.pow(x-p.x, 2)+Math.pow(y-p.y,2)+Math.pow(z-p.z,2));
		return e;
	}
	public double L1_Distance(Point p)
	{
		double l1 = Math.abs(x-p.x)+Math.abs(y-p.y)+Math.abs(z-p.z);
		return l1;
	}
}
//======================================
class March252015 
{
	public static void main(String[] args)
	{
		Point p1 = new Point(1, 2, 3);
		Point p2 = new Point(4, 5, 6);
		System.out.println("Euclidian Distance: "+p1.E_Distance(p2));
		System.out.println("L1_Distance: "+p2.L1_Distance(p2));
	}
}
