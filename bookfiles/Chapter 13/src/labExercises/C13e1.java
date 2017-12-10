package labExercises;

import java.io.*;

public class C13e1 {

	public static void main(String[] args) throws IOException{
		
		PrintWriter outFile = new PrintWriter("C13e1.txt");
		
		for (int i=1; i<=10000; i++){
			outFile.println(i);
		}
		
		// sequence will not reach 10000 without explicit close
		outFile.close();
	}
}
