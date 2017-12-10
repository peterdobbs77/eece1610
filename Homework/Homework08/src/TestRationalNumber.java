/*
 * Homework 8 Problem 3
 * References: An Introduction to Programming Using Java, Anthony J. Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created 3/18/15
 */
import java.util.Scanner;
class RationalNumber 
{
	private int numerator;
	private int denominator;
	//------------------------------------
	public RationalNumber(int n, int d)
	{
		numerator = n;
		denominator = d;
	}
	//-----------------------------------------
	public RationalNumber add(RationalNumber r)
	{
		numerator = (numerator*r.denominator)+(r.numerator*denominator);
		denominator = denominator*r.denominator;
		return new RationalNumber(numerator, denominator);
	}
	//----------------------------------------------
	public RationalNumber multiply(RationalNumber r)
	{
		numerator = (numerator)*(r.numerator);
		denominator = (denominator)*(r.denominator);
		RationalNumber rn = new RationalNumber(numerator, denominator);
		reduce();
		return rn;
	}
	//--------------------------------------
	public void reduce()
	{
		int remainder = numerator%denominator;
		int quotient = numerator/denominator;
		if (remainder!=0) System.out.print(quotient+" "+remainder+"/"+denominator);
		else System.out.println(quotient);
	}
	//----------------------------
	public String toString()
	{
		return ""+numerator+"/"+denominator;
	}
}
//==========================================
class TestRationalNumber
{
	public static void main(String[] args)
	{
		//open Scanner
		Scanner kb = new Scanner(System.in);
		//prompting user
		System.out.println("Enter two rational numbers:");
		System.out.println("numerator1: ");
		int numer1 = kb.nextInt();
		System.out.println("denominator1: ");
		int denom1 = kb.nextInt();
		System.out.println("numerator2: ");
		int numer2 = kb.nextInt();
		System.out.println("denominator2: ");
		int denom2 = kb.nextInt(); 
		//assigning variables
		RationalNumber rn1 = new RationalNumber(numer1, denom1);
		RationalNumber rn2 = new RationalNumber(numer2, denom2);
		//call add() and display result
		System.out.println("sum of "+numer1+"/"+denom1+" and "+numer2+"/"+denom2+" is: "+rn1.add(rn2));
		//reassigning variables
		rn1 = new RationalNumber(numer1, denom1);
		rn2 = new RationalNumber(numer2, denom2);
		//displaying result and calling multiply()
		System.out.print("product of "+numer1+"/"+denom1+" and "+numer2+"/"+denom2+" is: ");
		rn1.multiply(rn2);
		//close Scanner
		kb.close();
	}
}