/*
 * taken from An Introduction to Programming Using Java,
 * 				Anthony J Dos Reis, pg 326
 */	

import java.util.*;
import java.io.*;		// java.io has IOException

public class IOExample2 {

	public static void main(String[] args) throws IOException {

		Scanner inFile = new Scanner(new File("t1.txt"));
		PrintWriter outFile = new PrintWriter("t2.txt");
		
		String s;
		while (inFile.hasNextLine()){
			
			s = inFile.nextLine();	// read one line
			outFile.println(s);		// write this line
		}
		
		inFile.close();				// close files
		outFile.close();
	}

}
