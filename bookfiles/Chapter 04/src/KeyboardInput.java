
/*
 * Copied from: An Introduction to Programming Using Java, by Anthony J Dos Reis; pg. 76
 * Resulted in creation of "Factorial_of_Input" class which computes the factorial of an input positive integer
 * 
 */
import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		
		/*int count = 1, sum = 0, n;
		
		//create scanner object that represents keyboard
		Scanner kb = new Scanner(System.in);
		
		//prompt user of program for an integer greater than 0
		System.out.println("Enter integer greater than 0");
		
		//read in an integer from the keyboard, assign to n
		n = kb.nextInt();
		
		//now sum the integers from 1 to n
		while (count <= n)
		{
			sum = sum + count;	//add count to sum
			count++;			//add 1 to count
		}
		
		//display the sum
		System.out.println("Sum of 1 to " + n + " = " + sum);*/
		
		System.out.println("Enter an integer");
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		System.out.println(x);

		kb.close();
	}

}
