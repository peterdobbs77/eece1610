/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 172-3
 */

public class StringBufferExample 
{
	public static void main(String[] args) 
	{
		String s;
		StringBuffer sb;
		s = "hello";
		//sb = "hello";							// illegal
		sb = new StringBuffer("hello");			// construct object
		s = sb.toString();						// exact string
		
		// would work if sb were a String
		System.out.println(sb);					// displays hello
		System.out.println(sb.charAt(0));		// displays h
		System.out.println(sb.length());		// displays 5
		System.out.println(sb.substring(1));	// displays ello
		System.out.println(sb.substring(1,3));	// displays el
		System.out.println(sb.indexOf("lo"));	// displays 3
		
		// StringBuffer and String do append differently
		sb.append("bye");						// hellobye
		s = s + "bye";							// hellobye
		
		// would not work if sb were a String
		sb.insert(5, " / ");					// hello / bye
		sb.setCharAt(0, 'm');					// mello / bye
		sb.deleteCharAt(6);						// mello  bye
		sb.delete(2, 4);						// meo  bye
		sb.replace(3, 8, "w");					// meow
		sb.reverse();							// woem
	}

}
