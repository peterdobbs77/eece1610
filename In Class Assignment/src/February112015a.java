
/*
 * In Class Assignment 11a
 * 
 * @author Peter Dobbs
 * @version Created: 2/11/15
 */
import java.util.Scanner;
public class February112015a {

	public static void main(String[] args) {
		
		//prompt the user to enter an integer
		System.out.println("Enter a positive integer");
		
		//create read-in line
		Scanner a = new Scanner(System.in);
		
		//designate the integer import to a variable
		int x = a.nextInt();
		
		//prompt the user to enter a word
		System.out.println("Enter a word");
		
		//allow text to be typed on a following line
		a.nextLine();
		
		//assign the String import to a variable
		String y = a.next();
		
		//setup the while loop to read out the String x times
		int count = 1;
		while (count<=x)
		{
			System.out.println(y);
			count++;
		}
		
		
		a.close();

	}

}
