/*
 * Factorial Sequence bounded by an input maximum value
 */
import java.util.Scanner;
public class Hw04_Q05 
{
	public static void main(String[] args)
	{
		System.out.println("Enter an upper bounding integer greater than 0");
		Scanner kb = new Scanner(System.in);
		int max = kb.nextInt();
		if (max<=0) System.out.println("Domain error. Run again.");
		double result = 1.0;
		int i = 1;
		while(true)
		{
			result = result*i;
			i++;
			if (result>=max)
			{
				System.out.println("end of sequence");
				break;
			}
			else
				System.out.print(result+", ");
		}
		kb.close();
	}
}
