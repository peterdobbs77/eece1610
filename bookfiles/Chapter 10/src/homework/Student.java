package homework;

public class Student extends CollegeMember {

	protected int year; // (1 = first year, 2 = second year, etc.)
	//---------------------
	public Student(){
		
	}
	//---------------------
	public Student(String n, int y, String tN){
		
		name = n;
		year = y;
		telNumber = tN;
	}
	//----------------------
	public int getYear(){
		return year;
	}
}
