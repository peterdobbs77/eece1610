/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 178-9
 */

import java.util.Random;
public class TestRandom {

	public static void main(String[] args)
	{
		Random r1 = new Random(7777777);	// set seed to 7777777
		System.out.println("r1 object");
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextDouble());
		
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt());
		
		System.out.println(r1.nextInt(2));
		System.out.println(r1.nextInt(2));
		
		Random r2 = new Random(7777777);	// set seed to 7777777
		System.out.println("r2 object");
		System.out.println(r2.nextDouble());
		System.out.println(r2.nextDouble());
		
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
		
		System.out.println(r2.nextInt(2));
		System.out.println(r2.nextInt(2));
	}
}