
/*
 * Chapter 4 Question 1
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created: 2/9/15
 */

//open the scanner
import java.util.Scanner;

public class Chpt4Ques1 {

	public static void main(String[] args) {
		
		int count;
		//initialize use of scanner
		Scanner a = new Scanner(System.in);
		//prompt
		System.out.println("Enter a positive integer");
		//assign n to input
		double n = a.nextInt();
		//prompt
		System.out.println("Enter an integer greater than the first input");
		//assign m to next input
		double m = a.nextInt();
		//initialize variable cube
		double cube;
		count = 0;
		//while loop takes input values as boundaries and finds cubes of numbers between bounds
		while (count<=m&&n<=m)
		{
			cube = (n)*(n)*(n);
			System.out.print("Cube of ");
			System.out.print(n);
			System.out.print(" = ");
			System.out.println(cube);
			count++;
			n++;
		}
		a.close();
	}
}