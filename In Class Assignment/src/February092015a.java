
/*
 * In Class Assignment 10
 * References: Introduction to Programming Using Java, Anthony J Dos Reis; 
 * 
 * @author Peter Dobbs
 * @version Created: 2/9/15
 */

public class February092015a {

	public static void main(String[] args) {		

		int x1 = 1, x2 = 10, count = 1, sum;
		while (count <= 7)
		{
			if (x1<=x2)
			{
				sum = x1 + x2;
				x1++;
				System.out.println(sum);
				count++;
			}
		}
		
		count = 1;
		while (count <= 7)
		{
			for (x1=1, x2=55; x1<x2||x2<x1; x1++)
			{
				sum = x1 + x2;
				System.out.println(sum);
				count++;
			}
		}
		System.out.println("done");
	}
}