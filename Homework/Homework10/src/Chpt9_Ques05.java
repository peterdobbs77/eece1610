/*
 * Homework 10 Problem 1
 * References: Introduction to Programming Using Java, Anthony J. Dos Reis
 * 
 * @author Peter Dobbs
 */

import java.util.Random;
public class Chpt9_Ques05 {

	public static void copyArray(int[] i1, int[] i2){
		
		//
		for (int i=0; i<i1.length; i++){
			i2[i]=i1[i];
		}
	}
	//---------------------------------------
	public static void main(String[] args) {
		//
		int[] ia1 = new int[10];
		int[] ia2 = new int[10];
		Random rand = new Random();
		// assigns random integers to indecises
		for (int i=0; i<ia1.length; i++){
			ia1[i] = rand.nextInt();
		}
		//
		copyArray(ia1, ia2);
		// displays values side by side
		for (int i=0; i<ia1.length; i++){
			System.out.print(ia1[i]);
			System.out.print("	");
			System.out.println(ia2[i]);
		}
	}
}