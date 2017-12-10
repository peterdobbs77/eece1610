package problem3;

/*
 * Homework 12 Problem 3c
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 */

public class C2 {

	private C3 r2;
	//-------------------------
	public C2(){
		// parameterless constructor
		r2 = new C3();
	}
	//--------------------------
	public C2(C2 original) { 
		// copy constructor
		r2 = new C3(original.r2);
	}
	//---------------------------
	public void setX(int xx){
		// setter references C3 setter
		// passes parameter from C1
		r2.setX(xx);
	}
	//---------------------------
	public int getX(){
		// getter references C3 getter
		// returns value from C3
		return r2.getX();
	}
}
