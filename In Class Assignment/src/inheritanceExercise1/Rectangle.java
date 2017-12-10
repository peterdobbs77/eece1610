package inheritanceExercise1;

public class Rectangle extends Shape {

	public double width;
	public double length;
	//-------------------
	public Rectangle(){
		
		width = 1.0;
		length = 1.0;
	}
	//--------------------
	public Rectangle(double w, double l){
		
		width = new Double(w);
		length = new Double(l);
	}
	//---------------------
	public Rectangle(double w, double l, String c, boolean f){
		
		width = new Double(w);
		length = new Double(l);
		color = new String(c);
		filled = new Boolean(f);
	}
	//-----------------------------
	public double getWidth(){
		return width;
	}
	//-----------------------
	public void setWidth(double w){
		width = w;
	}
	//------------------------
	public double getLength(){
		return length;
	}
	//-----------------------
	public void setLength(double l){
		length = l;
	}
	//-----------------------------
	public double getArea(){
		return (length*width);
	}
	//--------------------------
	public double getPerimeter(){
		return (length+length+width+width);
	}
	//---------------------------
	public String toString(){
		return "A Rectangle with width "+width+
				" and length "+length+", which "
				+"is a subclass of "+super.toString();
	}
}


