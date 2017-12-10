package exam3;
import java.util.*;

public class Exam3Prog1 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the number of students");
		int numStudents = kb.nextInt();
		
		double[] grades = new double[numStudents];
		double grade = 0;
		for (int i=0; i<numStudents; i++){
			System.out.println("Enter the grade of student "+(i+1)+":");
			while(true){
				grade = kb.nextDouble();
				if (grade>100||grade<0) System.out.println("Invalid grade, try again...");
				else{
					grades[i] = grade;
					break;
				}
			}
		}
		
		double sumGrades=0, averageGrade=0;
		
		for (int i=0; i<numStudents; i++){
			sumGrades = sumGrades + grades[i];
		}
		averageGrade = sumGrades/numStudents;
		
		System.out.println("The class average is "+averageGrade);
				
		kb.close();
	}

}
