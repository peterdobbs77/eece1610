package problem3;

/*
 * Homework 12 Problem 3b
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 */

public class C1 {

	private C2 r1;
	//---------------------------
	public C1(){ 
		// parameterless constructor
		r1 = new C2();
	}
	//---------------------------
	public C1(C1 original){	
		// copy constructor
		r1 = new C2(original.r1);
	}
	//--------------------------
	public void setX(int xx){
		// setter references C2 setter
		// passes parameter from main
		r1.setX(xx);
	}
	//------------------------
	public int getX(){
		// getter references C2 getter
		// returns value from C2
		return r1.getX();
	}
}
