
/*
 * In Class Assignment 12
 * 
 * @author Peter Dobbs
 * @version Created: 2/13/15
 */

import java.util.Scanner;
public class February132015b {

	public static void main(String[] args) {
		
		System.out.println("How many numbers do you want to average?");
		Scanner a = new Scanner(System.in);
		double b = a.nextDouble();
		int count = 1;
		double average;
		double sum = 0;
		
		System.out.println("What numbers would you like to average?");
		while (count<=b)
		{
			sum = sum + a.nextDouble();
			count++;
		}
		average = sum / b;
		System.out.println(average);
		
		
		a.close();
	}

}
