package inheritanceExercise1;

public class Square extends Rectangle {

	public Square(){
		// constructor
	}
	//------------------
	public Square(double side){
		width = new Double(side);
		length = new Double(side);
	}
	//---------------------
	public Square(double side, String c, boolean f){
		width = new Double(side);
		length = new Double(side);
		color = new String(c);
		filled = new Boolean(f);
	}
	//-------------------
	public double getSide(){
		return width;
	}
	//------------------
	public void setSide(double side){
		width = new Double(side);
		length = new Double(side);
	}
	//-------------------
	public void setWidth(double side){
		super.setWidth(side);
	}
	//--------------------
	public void setLength(double side){
		super.setLength(side);
	}
	//---------------------
	public String toString(){
		return "A Square with side "+width
				+" which is a subclass of "
				+super.toString();
	}
}
