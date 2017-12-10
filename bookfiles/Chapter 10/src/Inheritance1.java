/*
 * Taken from An Introduction to Programming Using Java,
 * 					Anthony J Dos Reis, pg 241-2
 */

class A{				// this is the superclass
	
	private int x=1;
	//------------------
	public int xGet(){
		return x;
	}
	//---------------
	public String toString(){
		return ("x = "+x);
	}
}

/*=======================================
 * B is a subclass of A. B inherits x, xGet, and toString from A.
 * toString defined in B overrides toString inherited from A.
 */
class B extends A{
	
	int y=7;
	//------------------
	public int yGet(){
		return y;
	}
	//------------------
	public String toString(){
		return "x = "+xGet()+" y = "+y;
	}
}
//==========================================
class Inheritance1 {

	public static void main(String[] args) {
		
		A a = new A();						// create A object
		System.out.println(a.xGet());		// get and display x
		System.out.println(a.toString());	// displays x = 1;
		B b = new B();						// create B object
		System.out.println(b.yGet());		// get and display y
		System.out.println(b.xGet());		// get and display x
		System.out.println(b.toString());	// displays x = 1 y = y
	}

}
