
public class ConditionControlled4 {

	public static void main(String[] args) {
		
		int x = 1, square;
		
		square = x*x;					// "priming" statement
		while (square < 5000)
		{
			System.out.println(x + " squared = " + square);
			x++;
			square = x*x;			// compute square once per iteration
		}
		
		

	}

}
