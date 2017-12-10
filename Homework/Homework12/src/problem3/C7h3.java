package problem3;

/*
 * Homework 12 Problem 3a
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 */

public class C7h3 {

	public static void main(String[] args) {

		// new C1 object
		C1 c1 = new C1();
		// new C1 object-copy of c1
		C1 c2 = new C1(c1);
		// set value of x for c1 as 11
		c1.setX(11);
		// display values referenced by c1 and c2
		System.out.println("c1: "+c1.getX());
		System.out.println("c2: "+c2.getX());
	}
}