/*
 * Approximate the cosine function using the roughly equivalent taylor series
 */
public class Hw05_Q02 
{
	public static void main(String[] args)
	{
		System.out.println("cos(pi/3): "+Math.cos(Math.PI/3));
		System.out.println("myCos(pi/3): "+myCos(Math.PI/3));
		System.out.println("cos(pi/6): "+Math.cos(Math.PI/6));
		System.out.println("myCos(pi/6): "+myCos(Math.PI/6));
	}
	//----------------------------------------
	public static double myCos(double x)
	{
		// 1.0 - x^2/2! + x^4/4! - x^6/6! + x^8/8! - ... + x^96/96! - x^98/98!
		double result = 0;
		double final_result =0;
		for (int i = 1; i<=98; i++)
		{
			if (i%2==0)
			{
				//System.out.println("exponent value: "+i);
				double factorial = i;
				int y = 1;
				while (i>y)
				{
					factorial = factorial*(i-y);
					y++;
				}
				//System.out.println("factorial value: "+factorial);
				double term = Math.pow(x, i)/factorial;
				//System.out.println("term value: "+term);
				if (i%4!=0) result = result - term;
				else result = result + term;
				//System.out.println("result value: "+result);
				final_result = result+1;
				//System.out.println("final result value: "+final_result);
				//System.out.println();
			}
			else continue;
		}
		return final_result;
	}
}
