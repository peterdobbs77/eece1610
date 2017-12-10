
public class January302015a {

	public static void main(String[] args) {
		
		String a = "Introduction to Java: 1610";				//declare String a
		System.out.print("Character at 1: "+a.charAt(1));
		System.out.print(", Character at 5: "+a.charAt(5));
		System.out.print(", Character at 10: "+a.charAt(10));
		System.out.print(", Character at 15: "+a.charAt(15));
		System.out.println(", Character at 22: "+a.charAt(22));
		int i1, i2, i3, i4, i5;									//declare integer
		i1 = (int)a.charAt(1);
		System.out.print("Integer at 1: "+i1);
		i2 = (int)a.charAt(5);
		System.out.print(", Integer at 5: "+i2);
		i3 = (int)a.charAt(10);
		System.out.print(", Integer at 10: "+i3);
		i4 = (int)a.charAt(15);
		System.out.print(", Integer at 15: "+i4);
		i5 = (int)a.charAt(22);
		System.out.print(", Integer at 22: "+i5);

	}

}
