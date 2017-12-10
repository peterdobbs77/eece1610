/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 217
 */
import java.util.Random;
class TestSort 
{
	public static void main(String[] args)
	{
		int[] z = new int[10];
		Random r = new Random();
		
		for (int i = 0; i < z.length; i++)	// initialize array
			z[i] = r.nextInt();
		
		selectionSort(z);					// sort array
		
		for (int i = 0; i < z.length; i++)	// display array
			System.out.println(z[i]);
	}
	//-----------------------------------------
	public static void selectionSort(int[] a)
	{
		for (int startIndex=0; startIndex < a.length-1; startIndex++)
		{
			int min = a[startIndex];		// set min to starting element
			int indexOfMin = startIndex;	// remember its index
			
			for (int j = startIndex + 1; j < a.length; j++)
				if (a[j] < min)				// found smaller element?
				{
					min = a[j];				// remember its value
					indexOfMin = j;			// remember its index
				}
			
			a[indexOfMin] = a[startIndex];	// switch first with min
			a[startIndex] = min;
		}
	}
}