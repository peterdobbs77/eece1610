package p3C10h6;

/*
 * Homework 13 Problem 3 (Chapter 10 homework 6, pg. 273)
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created 4/27/2015
 */

public class C10h6 {
	
	public static void main(String[] args){
		
		String space = new String(" ");
		String digits = new String("0123456789");
		String lettersUppercase = new String("ABCDEFGHIFKLMNOPQRSTUVWXYZ");
		String lettersLowercase = new String("abcdefghijklmnopqrstuvwxyz");
		//--------------
		//
		// space
		System.out.println("space");
		System.out.println((int)space.charAt(0)+"\n");
		//
		// digits
		System.out.println("digits");
		for(int i=0; i<digits.length(); i++){
			System.out.print(digits.charAt(i));
			System.out.print("	");
		}
		System.out.println();
		for(int i=0; i<digits.length(); i++){
			System.out.print((int)digits.charAt(i));
			System.out.print("	");
		}
		System.out.println("\n");
		//
		// upper case letters
		System.out.println("upper case letters");
		for(int i=0; i<lettersUppercase.length(); i++){
			System.out.print(lettersUppercase.charAt(i));
			System.out.print("	");
		}
		System.out.println();
		for(int i=0; i<lettersUppercase.length(); i++){
			System.out.print((int)lettersUppercase.charAt(i));
			System.out.print("	");
		}
		System.out.println("\n");
		//
		// lower case letters
		System.out.println("lower case letters");
		for(int i=0; i<lettersLowercase.length(); i++){
			System.out.print(lettersLowercase.charAt(i));
			System.out.print("	");
		}
		System.out.println();
		for(int i=0; i<lettersLowercase.length(); i++){
			System.out.print((int)lettersLowercase.charAt(i));
			System.out.print("	");
		}
	}

}
