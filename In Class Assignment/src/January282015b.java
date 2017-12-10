/*
 * In Class Assignment 6
 * Peter Dobbs
 */
public class January282015b {

	public static void main(String[] args) {
		
		String a = args[0];
		String b = args[1];
		String c = args[2];
		System.out.println("String a is "+a + "\nString b is "+b + "\nIs String a = \"java\" = "+a.equals(c));
		a = a.replaceAll(a, b);
		b = b.replaceAll(b, a);
	
		
		
	
		
		

	}

}
