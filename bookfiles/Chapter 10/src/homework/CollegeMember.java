package homework;

public class CollegeMember {

	protected String name;
	protected String telNumber;
	//-----------------------
	public CollegeMember(){
		
	}
	//-----------------------
	public CollegeMember(String n, String tN){
		name = n;
		telNumber = tN;
	}
	//-----------------------
	public String getName(){
		return name;
	}
	//-----------------------
	public String getTelNumber(){
		return telNumber;
	}
}
