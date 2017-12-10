package exam3;

public class Exam3Ques2 {

	public static void main(String[] args) {

		int [][][] x = new int [2][][];
		int i, j;
		x[0] = new int[4][];
		x[1] = new int[2][];
		for (i=0; i<x.length; i++){
			for (j=0; j<x[i].length; j++){
				x[i][j] = new int[i+j+1];
				System.out.println("size = "+x[i][j].length);
			}
		}
	}

}
