
/*
 * In Class Assignment 12
 * 
 * @author Peter Dobbs
 * @version Created: 2/13/15
 */

import java.util.Scanner;
public class February132015c {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter a positive number less than ten.");
		double b = a.nextDouble();
		
		System.out.println("Enter an angle");
		double c = a.nextDouble();
		double sum = 0;
		int count = 0;
		while (count<=b)
		{
			if (count%2==0)
			{
				System.out.print(c + "/" + (2*b) + " ");
				sum = sum + b;
				System.out.println(sum);
			}
			count++;
		}
		System.out.println(c/sum);
		
		a.close();
	}
}
