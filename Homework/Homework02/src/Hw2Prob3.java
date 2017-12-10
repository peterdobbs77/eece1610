
/*
 * Homework 2 Problem 3
 * References: Introduction to Programming Using Java; Lauren Ernst; Joe Schmitt
 * 
 * @author Peter Dobbs
 * @version Created: 1/22/15
 */

public class Hw2Prob3 {

	public static void main(String[] args) {
	
		int x, y, a, b;										//declare integers
		x = 8;												//assign x
		System.out.println("Value of x is: "+x);			//display output
		y = 3;												//assign y
		System.out.println("Value of y is: "+y);			//display output
		a = x/y;											//quotient
		System.out.println("Quotient of x/y is: "+a);		//display output
		b = x-y*(x/y);										//remainder of quotient without using modulus operator
		System.out.println("Remainder of x/y is: "+b);		//display output
		double s, t;										//declare doubles
		s = x;												//reassigns x as double s
		t = s/y;											
		System.out.println("Decimal value of x/y is: "+t);	//display output
		double c = Math.round(t);							//rounding function
		System.out.println("Rounded value of x/y is: "+c);	//display output

	}

}
