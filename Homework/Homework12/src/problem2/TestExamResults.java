package problem2;

/*
 * Homework 12 Problem 2b
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 */

public class TestExamResults {

	public static void main(String[] args){
		
		ExamResults grade = new ExamResults();
		
		// test record method
		grade.record(10);
		grade.record(75);
		grade.record(90);
		grade.record(63);
		grade.record(42);
		grade.record(92);
		grade.record(101);
		grade.record(100);
		grade.record(69);
		grade.record(72);
		grade.record(-5);
		grade.record(90);
		// test average method
		System.out.println("average: "+grade.average());
		// test max method
		System.out.println("maximum: "+grade.max());
		// test min method
		System.out.println("minimum: "+grade.min());
		// test count method
		System.out.println("count: "+grade.count());
	}
}