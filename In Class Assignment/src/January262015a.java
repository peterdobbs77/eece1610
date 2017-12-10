
/*
 * In Class Assignment 5: 
 * January 26, 2015
 * Peter Dobbs
 */

public class January262015a {

	public static void main(String[] args) {
		
		String a=args[0];						//assign string a
		System.out.println("String a is "+a);	//display string a
		String b=args[1];						//assign string b
		System.out.println("String b is "+b);	//display string b
		String c=args[2];						//assign string c
		System.out.println("String c is "+c);	//display string c
		
		//print result with object.boolean("String");
		System.out.println("Does String 1 begin with 'A': " + a.startsWith("A"));	//displays false
		System.out.println("Does String 2 begin with 'A': " + b.startsWith("A"));	//displays false
		System.out.println("Does String 3 begin with 'A': " + c.startsWith("A"));	//displays true
		

	}

}
