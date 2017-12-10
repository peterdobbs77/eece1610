
//example of a count-controlled while loop from pg. 69 of Intro book.

public class CountControlled1 {

	public static void main(String[] args) {
		
		int count = 1;						
		//this variable counts the number of times the loop executes
		while (count <= 3)	//"count <= 3" indicates a limit on the number of repeats
		{
			System.out.println("star");
			System.out.println("moon");
			count++;		//adds one to the count, when it reaches 3 the loop ends
		}
		System.out.println("good night");

	}

}
