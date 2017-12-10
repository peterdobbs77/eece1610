/*
 * Homework 5 Question 1: nested loops for displaying digits 1 through 10
 * References: Introduction to Programming Using Java
 * 
 * @author Peter Dobbs
 * @version Created: 2/12/2015
 */
public class Chpt4Ques8 {

	public static void main(String[] args) {
		
		int count = 1;
		while (count <= 10)					//initialize while loop with parameters
		{
			System.out.print("1 ");			//displays 1 as first digit of every line
			if (count>=2)					
				System.out.print("2 ");		
			//previous if statement displays 2 as second digit of every line after the first line
			if (count>=3)					
				System.out.print("3 ");		
			//previous if statement displays 3 as third digit of every line after the second line
			if (count>=4)					
				System.out.print("4 ");		
			//previous if statement displays 4 as fourth digit of every line after the third line
			if (count>=5)					
				System.out.print("5 ");		
			//previous if statement displays 5 as fifth digit of every line after the fourth line
			if (count>=6)					
				System.out.print("6 ");		
			//previous if statement displays 6 as sixth digit of every line after the fifth line
			if (count>=7)					
				System.out.print("7 ");		
			//previous if statement displays 7 as seventh digit of every line after the sixth line
			if (count>=8)					
				System.out.print("8 ");		
			//previous if statement displays 8 as eighth digit of every line after the seventh line
			if (count>=9)					
				System.out.print("9 ");		
			//previous if statement displays 9 as ninth digit of every line after the eighth line
			if (count>=10)					
				System.out.print("10 ");	
			//previous if statement displays 10 as tenth digit of every line after the ninth line
			count++;
			//following print line starts new line in display
			System.out.println();			
		}
	}
}
