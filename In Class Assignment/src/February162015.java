
/*
 * In Class Assignment 13
 */

import java.util.Scanner;
public class February162015 {

	public static void main(String[] args) {
		
		System.out.println("Prompt");
		
		Scanner a = new Scanner(System.in);
		System.out.println("angle to be calculated:");
		double x = a.nextInt()*0.0174532925;
		System.out.println("precision of estimate:");
		double n = a.nextInt();
		double numerator = Math.pow(x, n);
		double sum = 0;
		double count = n-1;
		
		System.out.print("sin " + x + " = ");
		while (count>0)
		{
			n = count;
			if (n%2==0)
			{	
			}
			else
			{
				sum = sum + numerator/(n);
			}
			count--;
			System.out.println(sum);
		}
		System.out.println(sum);
		System.out.println("Something is wrong...");
		System.out.print("The correct answer is: ");
		System.out.println(Math.sin(x));
		
		
		a.close();

	}

}
