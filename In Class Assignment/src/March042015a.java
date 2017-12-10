/*
 * In Class Assignment 20
 * 
 * @author Peter Dobbs
 * @version Created: 3/4/2015
 */
import java.util.Scanner;
public class March042015a {

	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		int N = n.nextInt();
		
		int quarters = N/25;
		//if (quarters>0)
			System.out.println(quarters+" quarters");
		int dimes = (N - (quarters*25))%10;
		//if (dimes>0)
			System.out.println(dimes+" dimes");
		int nickels = ((N - (quarters*25) - (dimes*10))%5);
		//if (nickels>0)
			System.out.println(nickels+" nickels");
		int pennies = (N - (quarters*25) - (dimes*10) - (nickels*5));
		//if (pennies>0)
			System.out.println(pennies+" pennies");
		
		n.close();
	}

}
