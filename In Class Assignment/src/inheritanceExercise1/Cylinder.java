package inheritanceExercise1;

public class Cylinder extends Circle {

	public double height;
	//---------------------
	public Cylinder(){
		height = 1.0;
	}
	//---------------------
	public Cylinder(double h, double r){
		height = new Double(h);
		radius = new Double(r);
	}
	//----------------------
	public Cylinder(double h, double r, String c, boolean f){
		height = new Double(h);
		radius = new Double(r);
		color = new String(c);
		filled = new Boolean(f);
	}
	//----------------------
	public double getHeight(){
		return height;
	}
	//------------------------
	public void setHeight(double h){
		height = h;
	}
	//----------------------
	public double getArea(){
		return super.getArea()+(super.getPerimeter()*height);
	}
	//-------------------------
	public String toString(){
		
		return "A cylinder with a radius "+radius
				+" and height "+height+" is a subclass of "
				+super.toString();
	}
}
