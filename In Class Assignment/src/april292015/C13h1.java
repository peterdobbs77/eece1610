package april292015;

import java.util.*;
import java.io.*;

public class C13h1 {

	public static void main(String[] args) throws IOException {

		Scanner fileIn = new Scanner(new File("lab13.txt"));
		PrintWriter fileOut = new PrintWriter("C13h1.txt");
		
		ArrayList<Integer> contents = new ArrayList<Integer>();
		
		double sum=0;
		while (fileIn.hasNextInt()){
			contents.add(fileIn.nextInt());
		}
		
		for (int i=0; i<contents.size(); i++){
			sum = contents.get(i) + sum;
		}
		
		double average = sum/contents.size();
		
		while (fileIn.hasNextInt()){
			if (fileIn.nextInt()>average){
				fileOut.print(fileIn.nextInt());
				continue;
			}
		}
		
		fileIn.close();
		fileOut.close();
	}

}
