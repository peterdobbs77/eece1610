/*
 * In Class Assignment 18
 */
import java.util.Scanner;
public class February272015 
{
	public static double seed;
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		seed = n.nextDouble();
		int i;
		for (i=1; i<30; i++)
		{
			System.out.println(myRand());
		}
		n.close();
	}
	//---------------------------------
	public static double myRand()
	{
		seed = Math.pow((Math.PI+seed), 2);
		int x = (int)seed;
		seed = seed - x;
		return seed;
	}
}