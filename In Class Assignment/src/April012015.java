import java.util.Random;
public class April012015 {
	public static void main(String[] args){
		
		Random r = new Random();
		int[][] ia = new int[100][2];
		
		// assigning values into array
		for (int i=0; i<ia.length; i++){
			ia[i][0] = r.nextInt(100)+1;
		}
		
//		for (int i=0; i<ia.length; i++){
//			System.out.print("{");
//			System.out.print(" "+ia[i]+" ");
//			System.out.print("}");
//		}
//		System.out.println();
		
		// index, number, repeat
		int[] count = new int[100];
		for (int i=0; i<100; i++){
			count[i]=1;
		}
		for (int i=0; i<100; i++){
			for (int j=i+1; j<100; j++){
				if (ia[i]==ia[j]){
					count[i]++;
				}
			}
		}
		int max = count[0];
		for (int i=0; i<100; i++){
			if (count[0]>max){
				
			}
		}
		
		// reversing order of the elements
		for (int i=0; i<ia.length; i++){
			ia[i]=ia[99-i];
		}

//		for (int i=0; i<ia.length; i++){
//			System.out.print("{");
//			System.out.print(" "+ia[i]+" ");
//			System.out.print("}");
//		}
//		System.out.println();
	}
}