package exam2;

import java.util.*;

public class Exam2Prog2 {

	public static void main(String[] args) {

		System.out.println("Prompt");
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for (int i=0; i<=n; i++)
			System.out.print("2^"+i+", ");
		
		System.out.println();
		
		for (int i=0; i<=n; i++)
			System.out.print(Math.pow(2,i)+", ");
		
		s.close();
	}

}
