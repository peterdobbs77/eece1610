import java.util.Scanner;
public class Hw8_Q5 {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("How many times do you want to say hello?");
		int x = kb.nextInt();
		for (int i = 1; i<=x; i++)
		{
			System.out.println(i + ". " + "hello");
		}
		kb.close();
	}

}
