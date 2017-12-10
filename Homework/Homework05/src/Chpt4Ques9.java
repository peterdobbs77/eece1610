/*
 * Homework 5 Question 1: Approximating pi
 * References: Introduction to Programming Using Java
 * 
 * @author Peter Dobbs
 * @version Created: 2/12/2015
 */
import java.util.Scanner;
public class Chpt4Ques9 {

	public static void main(String[] args) {
		//prompt
		System.out.println("Approximate pi to what degree?");
		//create and assign variables
		Scanner a = new Scanner(System.in);
		double b = a.nextDouble();
		double h = 1;
		double i = 1;
		double term = 1;
		double sum = 0;
		int count = 1;
		int n = 0;
		//while loop
		while (count<=b)			//count-controlled loop
		{
			h = (2*count)-1;		//denominator
			i = (4.0/h);			//term without alternating signs
			count++;
			term = i*(Math.pow(-1, n)); //term with alternating signs
			n++;
			sum = sum + term;		//sum of terms
		}
		System.out.println("estimated value = "+sum);
		System.out.println("actual value = "+Math.PI);
		a.close();
	}
}