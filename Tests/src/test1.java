import java.util.Scanner;
public class test1 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		System.out.println("prompt");
		int input = n.nextInt();
		int i;
		for (i=2; i<input; i++)
		{
			if (input%i==0)
			{
				System.out.println("The number "+input+" is not a prime number");
				break;
			}
			else
				continue;
		}
		if (i==input)
			System.out.println(input+" is prime");
		n.close();
	}
}
