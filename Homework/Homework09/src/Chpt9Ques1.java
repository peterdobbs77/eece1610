/*
 * Homework 9 Question 1
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 */
public class Chpt9Ques1 {
	
	public static void main(String[] args){
		//sum of any number of command line arguments
		// placed 1, 2, 3, 4 , and 5 into command line
		double sum = 0;
		for (int i=0; i<args.length;i++)
		{
			System.out.println(args[i]);
			sum = sum+Double.parseDouble(args[i]);
		}
		System.out.println("sum = "+sum);
	}
}