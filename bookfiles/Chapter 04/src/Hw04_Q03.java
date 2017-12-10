/*
 * Computes and displays the sum of: 0.1 + (0.1)^2 + (0.1)^3 + ... + (0.1)^n
 */
import java.util.Scanner;
public class Hw04_Q03 
{
	public static void main(String[] args)
	{
		System.out.println("Enter what order you want for n");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		double term = 0.1;
		double sum = 0.0;
		for (int i = 0; i<n; i++)
		{
			sum = sum + term;
			term = term*0.1;
		}
		System.out.println("result: "+sum);
		kb.close();
	}
}
