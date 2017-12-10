package inheritanceExercise1;

public class Shape {

	public Circle circle;
	public Rectangle rect;
	public String color;
	public boolean filled;
	//-----------------------
	public Shape(){
		
		circle = new Circle();
		rect = new Rectangle();
		color = new String("green");
		filled = new Boolean(true);
	}
	//-----------------
	public Shape(Shape r){
		
		color = new String(r.color);
		filled = new Boolean(r.filled);
	}
	//---------------------
	public String getColor(){
		return color;
	}
	//------------------
	public void setColor(String c){
		color = new String(c);
	}
	public boolean isFilled(){
		return filled;
	}
	//----------------------
	public String toString(){
		return "A Shape with color of "+color+" and "+filled+".";
	}
}
