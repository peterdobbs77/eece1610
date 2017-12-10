/*
 * In Class Assignment 20
 * 
 * @author Peter Dobbs
 * @version Created: 3/4/2015
 */
import java.util.Random;
public class March042015b 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		
		int occur6=0;
		for (int i=0; i<10000; i++)
		{
			int roll6 = r.nextInt(5)+1;
			if (roll6==1)
				occur6 = occur6+1;
		}
		double prob1 = 10000/occur6;
		System.out.println(prob1);
		
		int occur12=0;
		for (int i=0; i<10000; i++)
		{
			int roll12 = r.nextInt(11)+1;
			if (roll12==1)
				occur12 = occur12+1;
		}
		double prob2 = 10000/(2*occur12);
		System.out.println(prob2);
		
		System.out.println("wrong");
	}
}