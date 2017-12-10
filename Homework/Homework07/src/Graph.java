/* Homework 7 Problem 2a
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created 2/28/15
 */
/* Assignment:
 * Write a Graph class that has methods countIt and graphIt.
 * 
 * countIt should use five counters (c0, c1, c2, c3, c4) to 
 * count the number of 0's, 1's, 2's, 3's, 4's it is passed.
 * Use a switch statement
 * 
 * graphIt should display the final counts in the form of a
 * bar graph, with on bar for each count. Each bar should 
 * consist of a horizontal line of consecutive asterisks.
 * If the count is greater than 50, scale the size of the bars
 * so that the largest bar has 50 asterisks.
 */

import java.util.Arrays;

public class Graph 
{
	//initialize encapsulated doubles
	static double c0 = 0;
	static double c1 = 0;
	static double c2 = 0;
	static double c3 = 0;
	static double c4 = 0;
	public void countIt(int n)
	{
		//switch statement
		switch (n)
		{
			case 0: 	c0++;
						break;
			case 1: 	c1++;
						break;
			case 2: 	c2++;
						break;
			case 3: 	c3++;
						break;
			case 4: 	c4++;
						break;
		}
	}
	//-----------------------------
	//initiate encapsulated Strings
	static String c0line = "";
	static String c1line = "";
	static String c2line = "";
	static String c3line = "";
	static String c4line = "";
	//-----------------------------
	public void graphIt()
	{
		//scaling to the maxium number being 50
		if (c0>50 || c1>50 || c2>50 || c3>50 || c4>50)
		{
			double[] array = {c0, c1, c2, c3, c4};
			Arrays.sort(array);
			double max = array[4];
			c0 = (c0/max)*50;
			c1 = (c1/max)*50;
			c2 = (c2/max)*50;
			c3 = (c3/max)*50;
			c4 = (c4/max)*50;
		}
		//bar graph for c0
		for (int i=0; i<=c0; i++)
		{
			c0line = c0line + "*";
		}
		//bar graph for c1
		for (int i=1; i<=c1; i++)
		{
			c1line = c1line + "*";
		}
		//bar graph for c2
		for (int i=0; i<=c2; i++)
		{
			c2line = c2line + "*";
		}
		//bar graph for c3
		for (int i=0; i<=c3; i++)
		{
			c3line = c3line + "*";
		}
		//bar graph for c4
		for (int i=0; i<=c4; i++)
		{
			c4line = c4line + "*";
		}
		//display the bar graphs
		System.out.println("c0: "+c0line);
		System.out.println("c1: "+c1line);
		System.out.println("c2: "+c2line);
		System.out.println("c3: "+c3line);
		System.out.println("c4: "+c4line);
	}
}
