/*
 * Homework 7 Problem 1: approximate square root of a given number
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created: 2/26/15; Updated: 2/28/15
 */
import java.util.Scanner;
public class Chpt5Ques4 
{
	public static double root;
	//------------------------------------------
	public static void main(String[] args) 
	{	
		Scanner n = new Scanner(System.in);
		//prompt
		System.out.println("What would you like to root?");
		double x = n.nextDouble();
		//System.out.println("What degree of precision would you like for your root?");
		//double y = n.nextDouble();
		double r = mySqrt(x);
		System.out.println("estimate: "+r);
		System.out.println("actual: "+Math.sqrt(x));
		n.close();
	}
	//-----------------------------------------
	public static double mySqrt(double x)
	{
		root = 1.0;
		//double precision = Math.pow(10, y);
		int i;
		for (i=0; i<1000; i++)
		{
			root = (root + (x/root))/2;
		}
		return root;
	}

}
