public class Why_We_Need_Arrays 
{
	public static void main(String[] args)
	{
		int[] w = new int[1000000];			// create array
		//
		//	code that places values in the w array goes here
		//
		int i = 0;
		while (i < w.length)				// display array
		{
			System.out.println(w[i]);		// display value in w[i]
			i++;							// add 1 to i
		}
	}
}