/*
 * 
 */
import java.util.Scanner;
public class Hw8_Q4 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter two numbers on the same line separated by a space");
		String input1 = kb.next();
		String input2 = kb.next();
		//System.out.println(input1);
		//System.out.println(input2);
		
		int x = Integer.parseInt(input1);
		int y = Integer.parseInt(input2);
		//System.out.println(x);
		//System.out.println(y);
		
		int sum = x + y;
		System.out.println(sum);
		
		kb.close();
	}
}
