
/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 92
 */

public class ReturnValue2 {

	public static void main(String[] args) {
		
		int x = 1;
		System.out.println("sum = "+ getSum(x, x+5, 20));
		System.out.println("All done");
	}
	//------------------------------
	public static int getSum(int a, int b, int c)
	{
		return a + b + c;
	}
}
