package april292015;

import java.io.*;
import java.util.*;

@SuppressWarnings("serial")
public class C12h1 extends Exception {

	public static void main(String[] args) throws IOException {
		
		f();
	}
	
	public static void f() throws IOException {
		
		System.out.println("Enter an integer.");
		Scanner kb = new Scanner(System.in);
		
		int i = kb.nextInt();
		
		if (i<0){
			kb.close();
			try {
				throw new IOException();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (i>0){
			kb.close();
			throw new NullPointerException();
		}
		
		if(i==0){
			kb.close();
			throw new ArithmeticException();
		}
		
		kb.close();
	}

}
