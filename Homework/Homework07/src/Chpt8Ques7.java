/*
 * Homework 7 Problem 3
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created: 3/4/15
 */
import java.util.Random;
import java.util.Scanner;
public class Chpt8Ques7 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int initial = r.nextInt(11)+10;
		//initial number of straws
		if ((initial-1)%4==0) initial = initial+1;
		System.out.println("initial number of straws: "+initial);
		Scanner s = new Scanner(System.in);
		
		do
		{
			int straws = initial;
			while (true)
			{
				//program's move:
				int program = r.nextInt(3)+1;
				System.out.println("program's move: "+program);
				straws = straws - program;
			
				// Lose or continue
				if (straws==1)
				{
					System.out.println("You Lose!");
					break;
				}
				// Win or continue
				if (straws<=0) 
				{
					System.out.println("You Win!");
					break;
				}
				
				System.out.println("your straw options: "+straws);
			
				//user's move:
				System.out.println("Your Turn (enter either 1, 2, or 3)");
				int user = s.nextInt();
				// check to make sure that the entered integer is either 1, 2, or 3.
				while (true)
				{
					if (user>3||user<1)
					{
						//alerting the user of an input problem
						System.out.println("Domain Error");	
						System.out.println("Enter an integer from 1 to 3");
						//enter an integer that meets the requirements
						int user_error = s.nextInt();
						if (user_error>3||user_error<1) continue;
						else 
						{
							straws = straws - user_error;
							break;
						}
					}
					else 
					{
							straws = straws - user;
							break;
					}
				}
				//restart:
				System.out.println("straws: "+straws);
			}
			//game ends, ask if user wants to play again
			System.out.println("  Do you want to play again?");
			System.out.println("Type 'yes' for yes. Type 'no' for no");
			String response = s.next();
			//if yes, then reinitiate the loop
			if (response.equals("yes")) initial = r.nextInt(11)+10;
			//if no, then end the game
			else if (response.equals("no"))
			{
				System.out.println("Done");
				break;
			}
			//reinitiating the loop
			if ((initial-1)%4==0) initial = initial+1;
			System.out.println("initial number of straws: "+initial);
		} while (true);
		s.close();
	}
}