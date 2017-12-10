package homework;

public class Professor extends CollegeMember {

	protected int rank;
	//----------------------
	public Professor(){
		
	}
	//----------------------
	public Professor(String n, int r, String tN){
		
		name = n;
		rank = r;
		telNumber = tN;
	}
	//------------------------
	public int getRank(){
		return rank;
	}
}
