package exam3;

public class Exam3Ques3 {

	public static void main(String[] args) {

		int[] a = {0,2,4,1,3};
		for (int i=0; i<a.length; i++)
			a[i] = a[(a[i]+3)%5];
		// a[0] = a[3] = 1
		// a[1] = a[0] = 1
		
		System.out.println(a[1]);
	}

}
