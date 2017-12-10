import java.util.Random;
public class Hw8_Q2 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int sum = 0;
		for (int i = 0; i<1000000; i++)
		{
			// three coins
			int coin1 = r.nextInt(2);
			int coin2 = r.nextInt(2);
			int coin3 = r.nextInt(2);
			
			// 
			if (coin1 + coin2 + coin3 == 3)
			{
				sum = sum+1;
			}
			else continue;
		}
		System.out.println("Probability of three coins getting heads: "+((double)sum/1000000));
	}
}