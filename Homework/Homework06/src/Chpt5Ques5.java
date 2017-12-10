/*
 * Homework 6 Question 2: approximate pi using a random number generator
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis.
 * 
 * @author Peter Dobbs
 * @version Created 2/26/15
 */
import java.util.Random;
public class Chpt5Ques5 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		double approx = 1;
		int i;
		for (i=1; i<=100000; i++)
		{
			// random numbers for (x, y)
			double x = r.nextDouble();
			double y = r.nextDouble();
			// distance between (x, y) and (0, 0)
			double d = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
			// if distance is less than one, then...
			if (d<1)
			{
				// compiling number of hits
				approx = 1 + approx;
			}
			else continue;
		}
		// adjust the approximated ratio to approximate pi
		double pi = approx*.00004;
		System.out.println(pi);
	}
}