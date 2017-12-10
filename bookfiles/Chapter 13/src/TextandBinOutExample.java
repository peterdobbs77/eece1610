/*
 * taken from An Introduction to Programming Using Java,
 * 				Anthony J Dos Reis, pg 327
 */	

import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class TextandBinOutExample {

	public static void main(String[] args) throws IOException {

		PrintWriter textOut = new PrintWriter("t3.txt");
		int x = 20;
		textOut.println(x);		// output text
		textOut.close();
		
		DataOutputStream binOut = new DataOutputStream(
								new FileOutputStream("b1.bin"));
								// output binary
		
		binOut.writeInt(x);
		binOut.close();
	}

}
