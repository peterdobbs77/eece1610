/*
 * Idea: create a program that computes the factorial of an integer input
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author: Peter Dobbs
 * @version Created: 2/9/15
 */

import java.util.Scanner;

public class Factorial_of_Input {

	public static void main(String[] args) {
		
		int product = 1, count = 1, n;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an integer greater than 0");
		
		n = kb.nextInt();
		
		while (count <= n)
		{
			product = product*count;
			count++;
		}
		
		System.out.println("Product of integers 1 to " +n+ " = " +product);
		
		kb.close();

	}

}
