
/*
 * In Class Assignment 9
 * 
 * @author Peter Dobbs
 * @version Created: 2/4/15
 */

public class February042015a {

	public static void main(String[] args) {
		
		/*
		int x=2;
		if (x == 5)
			System.out.println("h");
		else
			if (x == 6)
				System.out.println("i");
			else
				if (x == 7)
					System.out.println("j");
				else
					System.out.println("wrong");
		*/

		System.out.println("String is "+args[0]);
		if (args[0].length() == 10)
		{
			if (args[0].startsWith("A"))
				System.out.println("Length = 10 & String begins with A");
			else
				System.out.println("Length = 10");
		}
		else
		{
			if (args[0].startsWith("A"))
				System.out.println("String begins with A");
			else
				System.out.println("Neither condition is met");
		}
		
		
	}

}
