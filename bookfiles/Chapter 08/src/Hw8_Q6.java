import java.util.Scanner;
public class Hw8_Q6 {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		while (true)
		{
			// typical couple fight
			System.out.println("How many times you gonna hello?");
			int x = kb.nextInt();
			for (int i = 1; i<=x; i++)
			{
				System.out.println(i + ". " + "hello");
			}
			if (x<=0) 
			{
				// they breakin' up
				System.out.println("good bye");
				break;
				// I never liked him anyways
			}
			else 
			{
				System.out.println("Wrong answer! \n");
				/*the fight*/ continue/*s*/;
			}
		}
		kb.close();
	}
}