
/*
 * In Class Assignment 11c
 * 
 * @author Peter Dobbs
 * @version Created: 2/11/15
 */

import java.util.Scanner;
public class February112015c {

	public static void main(String[] args) {
		
		//prompt
		System.out.println("Enter two integers");
		
		//assignment
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		int y = a.nextInt();
		int count = 1;
		
		//while statement
		while (count<y)
		{
			System.out.print(x + " " + x+1 + " ");
			x++;
			count = count+5;
		}
		
		a.close();

	}

}
