import java.util.Scanner;
public class Hw8_Q3 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		StringBuffer word = new StringBuffer(s.next());
		System.out.println("Input word: "+word);
		
		StringBuffer drow = word.reverse();
		System.out.println("Reverse of word: "+drow);
		
		s.close();
	}
}