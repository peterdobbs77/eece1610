/*
 * Unbeatable NIM game -- computer is kinda an asshole
 */
import java.util.Random;
import java.util.Scanner;
public class Hw8_Q8 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Let's play a game! :)");
		System.out.println("------------------");
		System.out.println("We will start with a randomly");
		System.out.println("generated number of straws.\n");
		
		System.out.println("We will take turns picking up straws.\n");
		
		System.out.println("The goal is to make me");
		System.out.println("end up with the last straw.\n");
		
		System.out.println("Are you ready to play?");
		System.out.println("Type 'yes' for yes. Type 'no' for no");
		
		String response1 = s.next();
		//if yes, then let's play
		if (response1.equals("yes"))
		{
			System.out.println("Here we go!");
			System.out.println("-----------");
			do
			{
				int initial = r.nextInt(11)+10;
				//initial number of straws
				if ((initial-1)%4==0) initial = initial+1;
				System.out.println("initial number of straws: "+initial);
				
				int straws = initial;
				while (true)
				{
					//program's strategy:
					int program = 0;
					if (straws%4==1) 
					{
						program = 1;
						System.out.println("program's move: "+program);
					}
					if (straws%4==2) 
					{
						program = 1;
						System.out.println("program's move: "+program);
					}
					if (straws%4==3) 
					{
						program = 2;
						System.out.println("program's move: "+program);
					}
					if (straws%4==0) 
					{
						program = 3;
						System.out.println("program's move: "+program);
					}
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
				String response2 = s.next();
				//if yes, then reinitiate the loop
				if (response2.equals("yes")) initial = r.nextInt(11)+10;
				//if no, then end the game
				else if (response2.equals("no"))
				{
					System.out.println("That's okay, I cheated ;)");
					break;
				}
				else 
				{
					System.out.println("Sorry, we don't speak gibberish here.");
					break;
				}
			} while (true);
		}
		else if (response1.equals("no"))
		{
			System.out.println("Fine, I didn't want to play anyways :(");
		}
		else System.out.println("Sorry, we don't speak gibberish here.");
		s.close();
	}
}