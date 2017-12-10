/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 214
 */
class ArgsExample 
{
	public static void main(String[] args)
	{
		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]);	// access command line arg
	}
}
