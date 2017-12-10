
/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 89
 */

public class Call3 {

	public static void main(String[] args) {
		
		int x = 1;
		displaySum(x, x+5, 20);
		System.out.println("All done");
	}
	//------------------------------------
	public static void displaySum(int x, int y, int z)
	{
		int sum;
		sum = x + y + z;	// x does not conflict with x in main
		System.out.println("sum = "+sum);
	}
}