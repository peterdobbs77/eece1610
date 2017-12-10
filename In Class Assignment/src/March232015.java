/*
 * In Class Assignment 22
 */
import java.util.Scanner;
class PhoneNumber
{
	private String area_code;
	private String exchange;
	private String extension;
	//------------------------
	public PhoneNumber(String a, String b, String c)
	{
		area_code = a;
		exchange = b;
		extension = c;
	}
	//-----------------------
	public boolean equals(PhoneNumber p)
	{
		if (area_code.equals(p.area_code)
				&&exchange.equals(p.exchange)
				&&extension.equals(p.extension))
		{
			return true;
		}
		else return false;
	}
	//------------------------
	public String toString()
	{
		return "("+area_code+")"+exchange+"-"+extension;
	}
}
//============================================
public class March232015 
{
	public static void main(String[] args)
	{
		// open Scanner
		Scanner kb = new Scanner(System.in);
		
		// Enter first phone number
		System.out.println("Enter one phone number: ### ### #### (use spaces)");
			String a1 = kb.next();	// area code
			String b1 = kb.next();	// exchange
			String c1 = kb.next();	// extension
		// execute PhoneNumber class
		PhoneNumber pn1 = new PhoneNumber(a1,b1,c1);
		System.out.println("First phone number: "+pn1.toString());
		
		// Enter second phone number
		System.out.println("\nEnter another phone number: ### ### #### (use spaces)");
			String a2 = kb.next();	// area code
			String b2 = kb.next();	// exchange
			String c2 = kb.next();	// extension
		// execute PhoneNumber class
		PhoneNumber pn2 = new PhoneNumber(a2,b2,c2);
		System.out.println("Second phone number: "+pn2.toString());
		
		// compare phone numbers
		System.out.println("\nIs "+pn1.toString()+" the same as "+
								pn2.toString()+"?: "+pn1.equals(pn2));
		
		// close Scanner
		kb.close();
	}
}