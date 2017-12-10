package april202015b;

public class Cup extends Bow {

	private int z;
	
	public Cup(int zz){
		
		super(20);
		z = zz;
	}
	
	public void display(){
		
		System.out.println("("+super.getX()+", "+super.getY()+", "+z+")");
	}
	
}
