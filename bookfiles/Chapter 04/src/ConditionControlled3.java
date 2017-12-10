
/*
 * Taken from Introduction to Programming Using Java, Anthony J Dos Reis; pg. 75
 */

public class ConditionControlled3 {

	public static void main(String[] args) {
		
		int x = 1, square;
		boolean keepGoing = true;
		
		while (keepGoing)
		{
			square = x*x;
			if (square >= 5000)		//exit test
				keepGoing = false;	//causes exit from loop
			else
			{
				System.out.println(x + " squared = " + square);
				x++;
			}
		}
		
		

	}

}
