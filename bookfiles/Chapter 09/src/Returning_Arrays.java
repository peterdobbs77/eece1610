/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 212
 */
public class Returning_Arrays 
{
	public int[] returnIntArray()
	{
		int[] q = new int[100];
		for (int i = 0; i < q.length; i++)
			q[i] = 7;
		return q;
	}
}