/*
 * In Class Assignment 14
 * 
 * @author Peter Dobbs
 * @version Created: 2/18/2015
 */
import java.util.Scanner;
public class February182015a {

	public static void main(String[] args) {
		System.out.println("What integer would you like factorilate?");
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		System.out.println("before call");
		factorial(n);
		System.out.println("after call");
		a.close();
	}

	public static int factorial(int n)
	{
		int product = 1, count = 1;
		while (count <= n)
		{
			product = product*count;
			count++;
		}
		System.out.println("Factorial of " +n+ " = " +product);
		return product;
	}
}
