/*
 * 
 */
public class MyRectangle {
	
	private double x;
	private double y;
	private double width;
	private double height;
	//--------------------------------
	public MyRectangle(double newX, double newY, double newWidth, double newHeight){
		
		this.x=newX;
		this.y=newY;
		this.width=newWidth;
		this.height=newHeight;
	}
	//-----------------------------------
	public MyRectangle(MyRectangle r){
		
		r.x=x;
		r.y=y;
		r.width=width;
		r.height=height;
	}
	//-----------------------------------------------
	public void set(double newX, double newY, double newWidth, double newHeight){
		
		this.x=newX;
		this.y=newY;
		this.width=newWidth;
		this.height=newHeight;
	}
	//----------------------------------------
	public String toString(){
		
		return "x = "+x+", y = "+y+", width = "+width+", height = "+height;
	}
	//--------------------------------------
	public double area(){
		
		return (width*height);
	}
	//-------------------------------
	public void move(double xChange, double yChange){
		
		x+=xChange;
		y+=yChange;
	}

}
