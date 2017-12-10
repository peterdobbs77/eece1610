
/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 93-94
 */

public class Overloading {

	public static void main(String[] args) 
	{	
		o();		//Calls o on line 17
		o(2);		//Calls o on line 22
		o(2.0);		//Calls o on line 27
		o(2, 2.0);	//Calls o on line 32
		o(2.0, 2);	//Calls o on line 37
	}
	//-----------------------------------------
	public static void o()
	{
		System.out.println("No args");
	} 
	//-----------------------------------------
	public static void o(int i)
	{
		System.out.println("i = " + i);
	}
	//-----------------------------------------
	public static void o(double d)
	{
		System.out.println("d = " + d);
	}
	//-----------------------------------------
	public static void o(int i, double d)
	{
		System.out.println("i = " + i + "	d = " + d);
	}
	//------------------------------------------
	public static void o(double d, int i)
	{
		System.out.println("d = " + d + " i = " + i);
	}
}
