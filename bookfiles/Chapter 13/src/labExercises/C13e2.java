package labExercises;

import java.io.*;
import java.util.*;

public class C13e2 {

	public static void main(String[] args) throws IOException{
		
		Scanner inFile = new Scanner(new File("lab13.txt"));
		PrintWriter outFile = new PrintWriter("C13e2.text");
		
		int i;
		while(inFile.hasNextInt()){
			
			i = inFile.nextInt();
			outFile.println(i);
		}
		
		inFile.close();
		outFile.close();
	}
}
