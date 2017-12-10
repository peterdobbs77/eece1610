/*
 * In Class Assignment 19
 * Input: x, y
 * Output: r, theta (both in degrees and radians)
 */
import java.util.Scanner;
public class March022015a 
{
	public static void main(String[] args)
	{
		System.out.println("Enter Coordinates: ");
		Scanner n = new Scanner(System.in);
		System.out.println("x: ");
		double x = n.nextDouble();
		System.out.println("y: ");
		double y = n.nextDouble();
		
		double r = Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));
		System.out.println("r: "+r);
		double theta_d = Math.atan(x/y);
		System.out.println("theta in degrees: "+theta_d);
		double theta_r = toRadians(theta_d);
		System.out.println("theta in radians: "+theta_r);
		n.close();
	}
	//---------------------------------------------------
	public static double toRadians(double d)
	{
		// 1 radian = 57.2957795 degrees
		double r = d/57.2957796;
		return r;
	}
}