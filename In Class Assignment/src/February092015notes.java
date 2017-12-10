
/*
 * In Class Assignment 10
 * References: Introduction to Programming Using Java, Anthony J Dos Reis; 
 * 
 * @author Peter Dobbs
 * @version Created: 2/9/15
 * 
 */

public class February092015notes {

	public static void main(String[] args) {
	
		/*Example 1
		int x=10;
		while(x<20)
		{
			System.out.println(x);
			x++;
		}
		*/
		
		/*Example 2
		int count = 1, sum = 0;
		while (count <= 10)
		{
			sum = sum + count;
			count++;
		}
		System.out.println("sum = "+sum);
		*/
		
		/*Example 3 - interior exit: break statement
		int x = 1, square;
		while (true)
		{
			square = x*x;
			if (square >= 5000) break;
			System.out.println(x + " squared = " + square);
			x++;
		}
		helpful if condition is not clear ahead of time
		*/
		
		//Example 4 - boolean alternative to example 3
		int x = 1, square;
		boolean keepGoing = true;
		while (keepGoing)
		{
			square = x*x;
			if (square >= 5000)
				keepGoing = false;
			else
			{
				System.out.println(x + " squared = " + square);
				x++;
			}
		}
		
		//create Scanner object
		/*
		 * import java.util.Scanner;
		 * public classs c4eg1{
		 * 
		 * public static void main(String[] args){
		 * System.out.println("Enter integer greater than 0");
		 * Scanner kb = new Scanner(System.in);
		 * int x1 = kb.nextInt();
		 * 
		 */
		
		
	}

}
