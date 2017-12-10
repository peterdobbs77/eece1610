/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 212
 */
public class ArrayExample 
{	
	public static void main(String[] args)
	{
		int[] ia = new int[5];	// create ia array
		initArray(ia, 20);		// pass value of ia and 20
	}
	//--------------------------------------------
	public static void initArray(int[] v, int value)
	{
		for (int i = 0; i < v.length; i++)
			v[i] = value;		// initializes v array
	}
}
