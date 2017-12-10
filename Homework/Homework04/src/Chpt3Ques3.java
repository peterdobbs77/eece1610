
public class Chpt3Ques3 {

	public static void main(String[] args) {
		
		System.out.println("p	q	!(p&&q)");	//display header line
		System.out.print("false	false	");		//display string output
		System.out.println(!(false));			//display !(p && q)
		System.out.print("false	true	");		//display string output
		System.out.println(!(false));			//display !(p && q)
		System.out.print("true	false	");		//display string output
		System.out.println(!(true&&false));		//display !(p && q)
		System.out.print("true	true	");		//display string output
		System.out.println(!(true&&true));		//display !(p && q)

	}

}
