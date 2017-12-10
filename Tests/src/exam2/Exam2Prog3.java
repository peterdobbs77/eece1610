package exam2;

public class Exam2Prog3 {

	public static void main(String[] args) {

		int sum=0;
		
		for (int i=1; i<=50; i++)
			if (i%2==0)
				sum=sum+i;
		
		System.out.println("sum = "+sum+" = ");
		
		for (int i=1; i<=50; i++){
			if (i%2==0&&i!=50)
				System.out.print(i+" + ");
			if (i==50)
				System.out.print("50");
		}
	}

}
