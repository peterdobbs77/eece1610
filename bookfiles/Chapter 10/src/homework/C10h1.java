package homework;

public class C10h1 {

	public static void main(String[] args){
		
		Student s = new Student("Bert", 2, "555-5555");
		System.out.println("name = "+s.getName());
		System.out.println("year = "+s.getYear());
		System.out.println("telephone = "+s.getTelNumber());
		Professor p = new Professor("Jane", 1, "555-9999");
		System.out.println("name = "+p.getName());
		System.out.println("rank = "+p.getRank());
		System.out.println("telephone = "+p.getTelNumber());
	}
}
