
/*
 * Taken from An Introduction to Programming Using Java by Anthony J Dos Reis, pg 87
 */

public class Call1 {

	public static void main(String[] args) {
		
		System.out.println("before call");
		f();
		System.out.println("after call");
	}
	//----------------------------------
	public static void f(){
		System.out.println("in f");
	}

}
