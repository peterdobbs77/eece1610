package p2C13h8;

/*
 * Homework 13 Problem 2 (Chapter 13 homwork 8, pg. 334)
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created 4/27/2015
 */

import java.util.*;
import java.io.*;

public class C13h8 {

	public static String similarity;
	//------------------------
	public static void main(String[] args) throws IOException {

		// scanner
		Scanner kb = new Scanner(System.in);
		// prompt for file name 1
		System.out.println("Enter the name of the first file");
		// file scanner 1
		Scanner fileIn1 = new Scanner(new File(kb.next()));
		// prompt for file name 2
		System.out.println("Enter the name of the second file");
		// file scanner 2
		Scanner fileIn2 = new Scanner(new File(kb.next()));
		
		// check for similarities between files
		while (fileIn1.hasNext()&&fileIn2.hasNext()){
			if (fileIn1.next().equals(fileIn2.next())){
				similarity="Files are similar";
				continue;
			}
			else {
				similarity="Files are different.";
				break;
			}
		}
		// displays result of similarity check
		System.out.println(similarity);
		
		// close scanners
		fileIn1.close();
		fileIn2.close();
		kb.close();
	}

}
