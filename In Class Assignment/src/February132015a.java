
/*
 * In Class Assignment 12
 * 
 * @author Peter Dobbs
 * @version Created: 2/13/15
 */

import java.util.Scanner;
public class February132015a {

	public static void main(String[] args) {
		
		System.out.println("Enter two positive integers");
		
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		int y = a.nextInt();
		int c = 1;
		
		int i;
		for (i=1;i<=y;i++)
		{
			int series = x;
			System.out.print(series + " ");
			if (c%5<1)
			{
				System.out.println();
			}
			c++;
			x++;
		}
		
		a.close();

	}

}
