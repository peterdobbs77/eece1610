
/*
 * In Class Assignment 15
 */

import java.util.Scanner;
public class February202015b {

	public static void main(String[] args) 
	{ 	
		System.out.println("Enter the coefficients for Ax^2+Bx+C");
		Scanner n = new Scanner(System.in);
		System.out.println("A:");
		double a = n.nextDouble();
		System.out.println("B:");
		double b = n.nextDouble();
		System.out.println("C:");
		double c = n.nextDouble();
		Quadratic(a, b, c);
		n.close();
	}
	//-----------------------------------------------------
	public static void Quadratic(double d1, double d2, double d3)
	{
		
	}

}
