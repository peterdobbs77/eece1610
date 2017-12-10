
/*
 * In Class Assignment 14
 * 
 * @author Peter Dobbs
 * @version Created: 2/18/2015
 */

public class February182015b {

	public static void main(String[] args) {
		
		boolean x = false;
		boolean y = false;
		boolean z = true;
		System.out.println("before call");
		System.out.println(majority(x, y, z));
		System.out.println("after call");
	}
	
	
	public static boolean majority(boolean a, boolean b, boolean c)
	{
	if ((a&&b)||(a&&c)||(b&&c))
		return true;	
	else
		return false;
	}
}