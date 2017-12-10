
public class TestMyRectangle {

	public static void main(String[] args) {

		// a
		MyRectangle rect1 = new MyRectangle(0,0,0,0);
		// b
		System.out.println("Initial values");
		System.out.println(rect1.toString());
		// c
		rect1.set(2.0, 3.0, 4.5, 5.1);
		// d
		System.out.println("Values after set");
		System.out.println(rect1.toString());
		// e
		System.out.println("area of rect1: "+rect1.area());
		// f
		rect1.move(2.5, 3.0);
		// g
		System.out.println("Values after move");
		System.out.println(rect1.toString());
		// h
		System.out.println("area of rect1: "+rect1.area());
		// i
		MyRectangle rect2 = new MyRectangle(rect1);
		// j
		System.out.println("area of rect2: "+rect2.area());
	}

}
