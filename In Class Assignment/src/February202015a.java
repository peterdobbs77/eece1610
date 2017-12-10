import java.util.Scanner;
public class February202015a {

	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		int x1 = 3;
		int x2 = 5;
		int x3 = 1;
		Max3Int(x1, x2, x3);
		double y1 = 1;
		double y2 = 2;
		double y3 = 3;
		Max3Double(y1, y2, y3);
		a.close();
	}
	public static void Max3Int(int x, int y, int z)
	{
		if (x==Math.max(x, y)&&x==Math.max(x, z))
			System.out.println(x);
		if (y==Math.max(y, x)&&y==Math.max(y, z))
			System.out.println(y);
		if (z==Math.max(z, x)&&z==Math.max(z, y))
			System.out.println(z);
	}
	public static void Max3Double(double x, double y, double z)
	{
		if (x==Math.max(x, y)&&x==Math.max(x, z))
			System.out.println(x);
		if (y==Math.max(y, x)&&y==Math.max(y, z))
			System.out.println(y);
		if (z==Math.max(z, x)&&z==Math.max(z, y))
			System.out.println(z);
	}
}

