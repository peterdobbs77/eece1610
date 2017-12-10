package p1C13h2;

/*
 * Homework 13 Problem 1 (Chapter 13 homework 2, pg. 333)
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created 4/27/2015
 */

import java.io.*;
import java.util.*;

public class C13h2 {

	public static void main(String[] args) throws IOException{
		
		// two scanners, a printwriter, and an array list
		Scanner inFile1 = new Scanner(new File("t1.txt"));
		Scanner inFile2 = new Scanner(new File("t2.txt"));
		PrintWriter outFile = new PrintWriter("C13h2");
		ArrayList<Integer> ial = new ArrayList<Integer>();
		
		// read from files and add to array list
		while (inFile1.hasNextInt()){
			ial.add(inFile1.nextInt());
		}
		while(inFile2.hasNextInt()){
			ial.add(inFile2.nextInt());
		}
		
		// sort array list
		Collections.sort(ial);
		
		// send to new file
		for (int i=0; i<ial.size(); i++){
			outFile.println(ial.get(i));
		}
		
		// close scanners and printwriter
		inFile1.close();
		inFile2.close();
		outFile.close();
	}
}
