package inheritanceExercise1;

public class Circle extends Shape {

	public double radius;
	//---------------------
	public Circle(){
		
		radius = 1.0;
	}
	//---------------------
	public Circle(double r){
		radius = new Double(r);
	}
	//---------------------
	public Circle(double r, String c, boolean f){
		radius = new Double(r);
		color = new String(c);
		filled = new Boolean(filled);
	}
	//--------------------
	public double getRadius(){
		
		return radius;
	}
	//---------------------
	public void setRadius(double r){
		
		radius = new Double(r);
	}
	//---------------------
	public double getArea(){
		return (Math.PI*(Math.pow(radius,2)));
	}
	//---------------------
	public double getPerimeter(){
		return (2*Math.PI*radius);
	}
	//---------------------
	public String toString(){
		return "A Circle with radius "+radius+
				", which is a subclass of "+super.toString();
	}
}
