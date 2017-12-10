
/*
 * Taken from "An Introduction to Programming Using Java" pg 72.
 */

public class ConditionControlled1 {

	public static void main(String[] args) {
		
		int x = 1;
		
		while (x*x < 5000)
		{
			System.out.println(x + " squared = " + x*x);
			x++;
		}
	}
}
