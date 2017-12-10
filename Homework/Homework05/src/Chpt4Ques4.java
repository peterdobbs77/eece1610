/*
 * Homework 5 Question 1: Approximate e
 * References: Introduction to Programming Using Java
 * 
 * @author Peter Dobbs
 * @version Created: 2/12/2015
 */
import java.util.Scanner;
public class Chpt4Ques4 {

	public static void main(String[] args) {
		
		//prompt
		System.out.println("Approximate e to what degree?");
		//declare and assign variables
		Scanner a = new Scanner(System.in);
		int count = 1;
		double n = a.nextDouble(), i = 0;
		double h = 1;
		double sum = 0;
		//while loop
		while (count<=n)		//count controlled while loop
		{
			i = 1.0f/h;		//individual term calculator
			h = count*h;	//denominator term
			count++;		//counter
			sum = sum + i;	//sum of individual terms
		}
		System.out.println(sum);
		System.out.println("e = "+Math.E);
		a.close();
	}
}
/*
 * Two programmers were out to dinner. When their food finally came, the first programmer
 * wasn't all too pleased with his meal, so he asked his date for some of hers. The second
 * programmer replied "Alright, but only half a byte." *rimshot*
 * 
 * OR
 * 
 * A girl named Ada was traveling through the Sahara Desert when she came upon a a python.
 * She jumped back to avoid getting bitten and the snake responded, "Oh come on, just a nibble!"
 */