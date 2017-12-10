
/*
 * In Class Assignment 11b
 * 
 * @author Peter Dobbs
 * @version Created: 2/11/15
 */

import java.util.Scanner;
public class February112015b {

	public static void main(String[] args) {
		
		//prompt
		System.out.println("Enter three integers");
		
		//grab input and assign to variables
		Scanner a = new Scanner(System.in);
		System.out.print("first int: ");
		int x = a.nextInt();
		a.nextLine();
		System.out.print("second int: ");
		int y = a.nextInt();
		a.nextLine();
		System.out.print("third int: ");
		int z = a.nextInt();
		
		//if statements determine the greatest input value and the least input value
		if (x>y&&x>z)
			System.out.println("MAX = "+x);
		if (y>x&&y>z)
			System.out.println("MAX = "+y);
		if (z>y&&x<z)
			System.out.println("MAX = "+z);
		if (x<y&&x<z)
			System.out.println("MIN = "+x);
		if (x>y&&y<z)
			System.out.println("MIN = "+y);
		if (z<y&&x>z)
			System.out.println("MIN = "+z);
		a.close();
	}
}
