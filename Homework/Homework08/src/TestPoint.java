/*
 * Homework 8 Problem 2
 * References: An Introduction to Programming Using Java, Anthony J. Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created 3/18/15
 */
import java.util.Scanner;
class Point
{
	private double x;
	private double y;
	//--------------------
	// constructor with no parameters
	public Point()
	{
		x = 0.0;
		y = 0.0;
	}
	//--------------------------------
	// constructor with parameters set to instance variables
	public Point(double xx, double yy)
	{
		x = xx;
		y = yy;
	}
	//---------------------------------
	// method to calculate distance of given point from (0,0)
	public double distanceFromOrigin()
	{
		double sum = Math.pow(x, 2)+Math.pow(y, 2);
		double d = Math.sqrt(sum);
		return d;
	}
	//----------------------------------
	// method to convert the input doubles to String format
	public String toString()
	{
		String s = "("+x+", "+y+")";
		return s;
	}
	//---------------------------------
	// method to calculate the distance between two input points
	public double distance(Point r)
	{
		double sum = Math.pow(x-r.x, 2)+Math.pow(y-r.y, 2);
		double d = Math.sqrt(sum);
		return d;
	}
}
//============================================================
class TestPoint
{
	public static void main(String[] args)
	{
		// Example of hard coded distance from origin
		Point p = new Point();
		System.out.println("Point "+p.toString()+" is this far from origin: "
									+p.distanceFromOrigin());
		p = new Point(3.0, 4.0);
		System.out.println("Point "+p.toString()+" is this far from origin: "
									+p.distanceFromOrigin());
		//------------------------------------------------
		// Example of distance between input points
		// open Scanner
		Scanner kb = new Scanner(System.in);
		// declaring and assigning variables
		System.out.println("Enter the Sample Point Coordinates:");
		System.out.println("x1:");
		double x1 = kb.nextDouble();
		System.out.println("y1:");
		double y1 = kb.nextDouble();
		System.out.println("Enter the Reference Point Coordinates");
		System.out.println("x2:");
		double x2 = kb.nextDouble();
		System.out.println("y2:");
		double y2 = kb.nextDouble();
		// executing Point class with input parameters
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		// display result
		System.out.println("Point "+p1.toString()+" is "+p1.distance(p2)
							+" far from "+p2.toString());
		// close Scanner
		kb.close();
	}
}