package labExercises;

import java.util.*;
import java.io.*;

public class C13e4 {

	public static void main(String[] args) throws IOException {

		Scanner inFile = new Scanner(new File("lab13.txt"));
		
		ArrayList<Integer> ial = new ArrayList<Integer>();
		while (inFile.hasNextInt()){
			ial.add(inFile.nextInt());
		}
		
		for (int i=ial.size()-1; i>=0; i--){
			System.out.println(ial.get(i));
		}
		
		inFile.close();
	}

}
