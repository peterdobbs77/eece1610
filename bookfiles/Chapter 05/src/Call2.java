
/*
 * Taken from An Introduction to Programming Using Java by Anthony J Dos Reis, pg 88
 */

public class Call2 {

	public static void main(String[] args) {
		
		int x = 1;
		displaySum(x, x+5, 20);
		System.out.println("All done");
	}

	public static void displaySum(int a, int b, int c)
	{
		int sum;
		sum = a + b + c;
		System.out.println("sum = " +sum);
	}
}
