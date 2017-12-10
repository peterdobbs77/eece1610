/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 223
 */
import java.util.ArrayList;
class ArrayListExample 
{
	public static void main(String[] args)
	{
		ArrayList<String> sal = new ArrayList<String>();
		
		sal.add("one");				// add "one" to end of sal
		sal.add("three");			// add "three" to end of sal
		sal.add(1, "two");			// insert "two" at index 1
		display(sal);				// displays one two three
		
		sal.set(1, "2.0");			// overlay slot 1 withg "2.0"
		display(sal);				// displays one 2.0 three
		
		System.out.println("slot 1 contains " + sal.get(1));
		
		System.out.println("Now remove " + sal.remove(1));
		display(sal);				// displays one three
		
		System.out.println("idx is " + sal.indexOf("three"));
		
		if (sal.contains("three"))	// sal object contains three?
			System.out.println("sal object contains three");
		else
			System.out.println("sal obj does not containt three");
		
		System.out.println("size of sal obj is " + sal.size());
		
		if (sal.isEmpty())
			System.out.println("sal object is empty");
		else
			System.out.println("sal object is not empty");
		
		sal.clear();				// reset sal to zero size
	}
	//-----------------------------------------
	public static void display(ArrayList<String> sal)
	{
		System.out.print("ArrayList now contains: ");
		for (int i = 0; i < sal.size(); i++)
			System.out.print(sal.get(i) + " ");
		System.out.println();
	}
}
