import java.util.*;
import java.io.*;

public class HandlingIOException {

	public void f() throws IOException{
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner inFile = new Scanner(new File("t1.txt"));
		// ...
	}
	// OR
	public void f2(){
		@SuppressWarnings("unused")
		Scanner inFile = null;	// need null to keep compiler happy
		try{
			inFile = new Scanner(new File("t1.txt"));
		}
		catch(IOException e){
			// ...
		}
		// ...
	}
}
