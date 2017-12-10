package labExercises;

import java.util.*;
import java.io.*;

public class C13e3 {

	public static void main(String[] args) throws IOException{
		
		Scanner inFile = new Scanner(new File("lab13.txt"));
		
		int i;
		double sum=0, count=0;
		while (inFile.hasNextInt()){
			count++;
			i = inFile.nextInt();
			sum+=i;
		}
		double average = sum/count;
		
		System.out.println(average);
		
		inFile.close();
	}
}
