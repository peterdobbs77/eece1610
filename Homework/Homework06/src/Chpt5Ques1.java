/*
 * Homework 6 Question 1: sorting three integers from least to greatest
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis.
 * 
 * @author Peter Dobbs
 * @version Created 2/20/15
 */
import java.util.Scanner;
public class Chpt5Ques1 
{
	public static void main(String[] args) 
	{
		//prompt
		System.out.println("What three integers would you like to sort?");
		Scanner s = new Scanner(System.in);
		//read-in integers assign to variables
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		//call method for sorting integers
		sort(x, y, z);
		//close Scanner
		s.close();
	}
	//--------------------------------
	public static void sort(int a, int b, int c)
	{
		if (a>b&&a>c)
		{
			if (b>c)
			{
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
				//if a>b>c then display in order: c, b, a
			}
			else
			{
				System.out.println(b);
				System.out.println(c);
				System.out.println(a);
				//if a>c>b then display in order: b, c, a
			}
		}
		else
			if (b>a&&b>c)
			{
				if (a>c)
				{
					System.out.println(c);
					System.out.println(a);
					System.out.println(b);
					//if b>a>c then display in order: c, a, b
				}
				else
				{
					System.out.println(a);
					System.out.println(c);
					System.out.println(b);
					//if b>c>a then display in order a, c, b
				}
			}
			else
				if (c>a&&c>b)
				{
					if (a>b)
					{
						System.out.println(b);
						System.out.println(a);
						System.out.println(c);
						//if c>a>b then display in order: b, a, c
					}
					else
					{
						System.out.println(a);
						System.out.println(b);
						System.out.println(c);
						//if c>b>a then display in order: a, b, c
					}
				}
	}
}