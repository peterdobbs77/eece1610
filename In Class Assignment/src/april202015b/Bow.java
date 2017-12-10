package april202015b;

public class Bow extends Ash {

	private int y;
	
	public Bow(int yy){
		
		super(10);
		y = yy;
	}
	
	public void display(){
		
		System.out.println("("+super.getX()+", "+y+")");
	}
	
	public int getY(){
		
		return y;
	}
}
