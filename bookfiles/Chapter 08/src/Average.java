/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 183
 */
import java.util.Scanner;
public class Average 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		double sum = 0.0;
		int numberOfGrades, i = 1;
		
		System.out.println("Enter number of grades");
		numberOfGrades = kb.nextInt();
		System.out.println("Enter Grades");
		
		while (i<=numberOfGrades)
		{
			sum = sum + kb.nextDouble();
			i++;
		}
		System.out.println("Average = " + sum/numberOfGrades);
		
		kb.close();
	}
}
