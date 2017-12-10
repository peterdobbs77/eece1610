/*
 * Homework 6 Question 3: checks three points for collinearity
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis.
 * 
 * @author Peter Dobbs	
 * @version Created 2/26/15
 */
import java.util.Scanner;
public class QuestionLast
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		// (x1, y1)
		System.out.println("Enter values for (x1, y1)");
		double x1 = n.nextDouble();
		double y1 = n.nextDouble();
		// (x2, y2)
		System.out.println("Enter values for (x2, y2)");
		double x2 = n.nextDouble();
		double y2 = n.nextDouble();
		// (x3, y3)
		System.out.println("Enter values for (x3, y3)");
		double x3 = n.nextDouble();
		double y3 = n.nextDouble();
		// call the method that checks for collinearity
		String s = Copoints(x1, y1, x2, y2, x3, y3);
		System.out.println(s);
		n.close();
	}
	public static String Copoints(double x1, double y1, double x2, double y2, double x3, double y3)
	{
		//slope of line from (x2, y2) to (x1, y1)
		double m21 = (y2-y1)/(x2-x1);
		//slope of line from (x3, y3) to (x2, y2)
		double m32 = (y3-y2)/(x3-x2);
		//slope of line from (x3, y3) to (x1, y1)
		double m31 = (y3-y1)/(x3-x1);
		if (m21==m32&&m21==m31) return "Points are collinear";
		else return "non-collinear points";	
	}
}