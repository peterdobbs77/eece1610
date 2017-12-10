package problem3;

/*
 * Homework 12 Problem 3d
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 */

public class C3 {

	private int x;
	//-----------------------
	public C3(){
		// parameterless constructor
		x = 7;
	}
	//--------------------
	public C3(C3 original){ 
		// copy constructor
		x = new Integer(original.x);
	}
	//-----------------------
	public void setX(int xx){
		// setter sets x as parameter
		x = new Integer(xx);
	}
	//-----------------------
	public int getX(){
		// getter returns value of x
		return x;
	}
}
