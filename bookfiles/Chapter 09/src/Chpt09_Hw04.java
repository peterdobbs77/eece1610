import java.util.Scanner;
public class Chpt09_Hw04 {

	private static final int STUDENTS = 5;
	private static final int TESTS = 3;
	//---------------------------------
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int[][] grades = new int[STUDENTS][TESTS];
		System.out.println("Enter three scores for five students");
		
		for (int rows=0; rows<STUDENTS; rows++){
			System.out.print("Student "+(rows+1)+": ");
			for (int cols=0; cols<TESTS; cols++){
				grades[rows][cols] = kb.nextInt();
			}
		}
		System.out.println();
		
		for (int rows=0; rows<STUDENTS; rows++){
			System.out.print("Student "+(rows+1)+": ");
			for (int cols=0; cols<TESTS; cols++){
				System.out.print(grades[rows][cols]+" ");
			}
			System.out.println();
		}
		
		// student average
		for(int rows=0; rows<STUDENTS; rows++){
			int studentGrade=0, studentAverage=0;
			for (int cols=0; cols<TESTS; cols++){
				studentGrade = studentGrade+grades[rows][cols];
			}
			studentAverage = studentGrade/3;
			System.out.println("Student "+(rows+1)+" average: "+studentAverage);
		}
		
		// test average
		for(int cols=0; cols<TESTS; cols++){
			int testGrade=0, testAverage=0;
			for (int rows=0; rows<STUDENTS; rows++){
				testGrade = testGrade+grades[rows][cols];
			}
			testAverage = testGrade/5;
			System.out.println("Test "+(cols+1)+" average: "+testAverage);
		}
		
		kb.close();
	}
}
