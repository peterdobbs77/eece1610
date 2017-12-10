/*
 * taken from An Introduction to Programming Using Java,
 * 				Anthony J Dos Reis, pg 325
 */	

import java.util.*;
import java.io.*;

public class IOExample1 {

	public static void main(String[] args) {

		Scanner inFile = null;
		PrintWriter outFile = null;
		
		try{
			inFile = new Scanner(new File("t1.txt"));
			outFile = new PrintWriter("t2.txt");
		}
		catch (IOException e){
			System.out.println(e.getMessage());	// display error
			System.exit(1);						// terminate program
		}
		
		String s;
		while (inFile.hasNextLine()){
			
			s = inFile.nextLine();	// read one line
			outFile.println(s);		// write this line
		}
		
		inFile.close();				// close files
		outFile.close();
	}

}
