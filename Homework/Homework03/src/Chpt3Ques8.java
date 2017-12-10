
/*
 * 
 * Chapter 3 Question 8
 * References: Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author: Peter Dobbs
 * @version Created: 2/5/15
 * 
 */

public class Chpt3Ques8 {

	public static void main(String[] args) {
		
		int a, b, i;						//declare int
		char c;								//declare char
		String s = "ZztOp6";				//declare String
		for (i = 0; i <= 5; i++)			//create for loop
		{			
			a = s.charAt(i);					//convert char to int
			if (a < 122 && a > 97){				//create: if character selected is lowercase, then...
				b = a-32;						//set b as difference of a and 32
				c = (char)b;					//convert int b to char c
				System.out.println(c);			//display result c
	
		}
		else
			System.out.println((char)a);	//if the character selected is not lowercase, then print out that character
	}
	}

}
