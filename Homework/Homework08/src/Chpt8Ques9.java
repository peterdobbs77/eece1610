/*
 * Homework 8 Problem 1
 * 
 * Program simulates the dropping of a one inch needle into a region
 * bounded by horizontal lines two inches apart. Account for every 
 * time the needle that lands passes out of the region and calculate
 * the ratio of the number of times dropped to number of times crossed.
 * 
 * This ratio should be close to pi.
 * 
 * References: An Introduction to Programming Using Java, Anthony J. Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created 3/18/15
 */
import java.util.Random;
public class Chpt8Ques9 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		/*loop generates random values and adds
		  the results based on a condition*/
		double sum = 0;
		for (int i =0; i<1000000; i++)
		{
			double tip = (r.nextDouble()*2)-1;	// landing spot of needle
			//System.out.println("tip: "+tip);
			double angle = r.nextDouble()*180;	// angle of needle
			//System.out.println("angle: "+angle);
			double end = Math.sin(angle)+tip;	// end point of needle
			//System.out.println("end: "+end);
			if(end>=1||end<=-1)	// does the end point cross the boundary?
			{
				sum = sum+1;	// if so, add one to the count
			}
			else continue;		// if not, continue dropping
		}
		//System.out.println("sum: "+sum);
		double ratio = 1000000/sum;
		System.out.println("ratio: "+ratio);
		System.out.println("This ratio approximates pi");
	}
}