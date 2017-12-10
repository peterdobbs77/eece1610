package inheritanceExercise1;

public class TestShape {

	public static void main(String[] args){
		
		Shape s1 = new Shape();
		Shape s2 = new Shape(s1);
		
		s2.color = "red";
		
		s2.filled = false;
		
		System.out.println(s1);
		System.out.println(s2);
		//------------------
		Circle c1 = new Circle();
		Circle c2 = new Circle();
	}
}
