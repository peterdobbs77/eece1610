/*
 * In Class Assignment 19
 * Output mean, median, standard deviation of 5 numbers
 */
import java.util.Scanner;
import java.util.Arrays;
public class March022015b 
{
	public static double median;
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Enter 5 integers");
		double i1 = n.nextInt();
		double i2 = n.nextInt();
		double i3 = n.nextInt();
		double i4 = n.nextInt();
		double i5 = n.nextInt();
		
		//mean
		double mean = (i1 +i2 + i3 + i4 + i5)/5;
		System.out.println("Mean is: "+mean);
		
		//median
		System.out.println("Median: "+myMedian(i1, i2, i3, i4, i5));
		
		//standard deviation
		System.out.println("Standard Deviation: "+myStandardDeviation(mean, i1, i2, i3, i4, i5));
		
		n.close();
	}
	//----------------------------------------------------
	public static double myMedian(double a, double b, double c, double d, double e)
	{
		double[] n = {a,b,c,d,e};
		Arrays.sort(n);
		median = n[2];
		return median;
	}
	//------------------------------
	public static double myStandardDeviation(double s, double a, double b, double c, double d, double e)
	{
		double sd = Math.sqrt((Math.pow(s-a, 2)+Math.pow(s-b, 2)+Math.pow(s-c, 2)+Math.pow(s-d, 2)+Math.pow(s-e, 2))/5);
		return sd;
	}
}
