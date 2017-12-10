package labExercises;

public class C13e10 {

	public static void main(String[] args) {

		int i=10, j=20;
		System.out.printf("i = %d		j = %d%n", i, j);
		
		System.out.println("--------------------");
		
		i=1; j=2;
		double x=1.23456789;
		System.out.printf("%d%d%f%n", i, j, x);
		System.out.printf("%d	%d	%f%n", i, j, x);
		System.out.printf("%9d%9d%9f%n", i, j, x);	// 9 field width
		System.out.printf("%-5d%-5d%n", i, j);
		System.out.printf("%f%n", x);
		System.out.printf("%5.1f%n", x);
		System.out.printf("%10.5f%n", x);
	}

}
