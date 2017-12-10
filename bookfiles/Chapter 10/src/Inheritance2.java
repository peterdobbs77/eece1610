/*
 * Taken from An Introduction to Programming Using Java,
 * 					Anthony J Dos Reis, pg 245-6
 */

class A2{
	
	private int x;
	//-------------------------
	public A2(){
		x=1;
	}
	//---------------------
	public void xDisplay(){
		System.out.println("x = "+x);
	}
}
//=======================================
class B2 extends A2{
	
	private int y;
	//--------------------
	public B2(){
		y=2;
	}
	//---------------------
	public B2(int yy){
		super();
		y=yy;
	}
	public void xyDisplay(){
		xDisplay();
		System.out.println("y = "+y);
	}
}
//=======================================
class C extends B2{
	
	private int z=4;
	//---------------------
	public void xyzDisplay(){
		xyDisplay();
		System.out.println("z = "+z);
	}
}
//=======================================
public class Inheritance2 {

	public static void main(String[] args){
		
		B2 b = new B2();
		b.xyDisplay();		// displays x = 1 y = 2
		b = new B2(3);
		b.xyDisplay();		// displays x = 1 y = 3
		C c = new C();
		c.xyzDisplay();		// displays x = 1 y = 2 z = 4
	}
}
