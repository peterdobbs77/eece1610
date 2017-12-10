/*
 * In Class Assignment 7
 * Peter Dobbs
 * 
 */

public class January302015notes {
	
	/*
	 * int x; 		// four bytes
	 * double y;	// eight bytes
	 * 
	 * 
	 */
	
	public static void main(String[] args){
		
		int b, i = 99999999;
		// byte b = i // wrong!
		b = (byte)i;									//cast i as byte
		System.out.println("i is: "+i+", b is: "+b);	//weird output
		
		//precedence
		System.out.println(1 + 3.5);
		System.out.println(1.0 + 7/2);
		System.out.println(1.0 + 7.0/2);
		//cast is applied to 7
		
		//char variable
		char c;
		c = 'A';
		System.out.println(c);
		//unicode
		
		//boolean
		boolean boo1, boo2;
		boo1 = true;
		boo2 = boo1;
		System.out.println(boo1);
		System.out.println(boo2);
		
		/*
		 * relational operators:
		 * 		<
		 * 		>
		 * 		<=	less than, or equal
		 * 		>=	greater than, or equal
		 * 		==	equal
		 * 		!=	not equal
		 */
		
	}

}
