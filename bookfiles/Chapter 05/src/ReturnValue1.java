
/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 91
 */

public class ReturnValue1 {

	public static void main(String[] args) 
	{	
		int x = 1, y;
		y = getSum(x, x+5, 20);		// assigns return value
		System.out.println("sum = "+y);
		System.out.println("All Done");
	}	
	//---------------------------------
	public static int getSum(int a, int b, int c)
	{
		int sum;
		sum = a + b + c;
		return sum;		// returns value in sum
	}
}