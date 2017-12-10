
public class January232015b {

	public static void main(String[] args) {
		/*
		 * int x, y;
		 * x = 1;
		 * y = ++x;					causes x and y to change!
		 * System.out.println(...);
		 * x = 1;
		 * y = x+1;
		 * System.out.println(...);
		 * 
		 * x = 1;
		 * y = x + x++;				avoid writing confusing statements!
		 * System.out.println(x);
		 * System.out.println(y);
		 * x = 1;
		 * y = x++ + x;				avoid writing confusing statements!
		 * System.out.println(x);
		 * System.out.println(y);
		 */
		
		String a = "summer", b = "winter";
		System.out.print(a.replace("ummer", "pring"));
		System.out.print(", "+a);
		System.out.print(", "+b.replace("winter", "fall"));
		System.out.print(", and "+b);

	}

}
