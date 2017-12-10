/*
 * Consecutive square roots of a given number and results of the sqrt converge to 1
 */
public class Hw04_Q10 
{
	public static void main(String[] args)
	{
		double x = 5.0;
		for (int i = 0; i<20; i++)
		{
			x = Math.sqrt(x);
			i++;
		}
		System.out.println("final value of x: " + x);
		double y = 0.5;
		for (int i = 0; i<20; i++)
		{
			y = Math.sqrt(y);
			i++;
		}
		System.out.println("final value of y: "+y);
	}
}
