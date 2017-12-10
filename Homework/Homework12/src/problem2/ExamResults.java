package problem2;

/*
 * Homework 12 Problem 2a
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 */

public class ExamResults {

	private int count;
	private int max;
	private int min;
	private double sum;
	private double average;
	private int[] ia;
	//------------------------
	public ExamResults(){
		
		sum = 0;
		count=0;
		ia = new int[100];
	}
	//---------------------------
	public void record(int x){
		
		if (x<=100&x>=0){
			ia[count]=x;
			count++;
		}
		else{
			System.out.println("error reading input:");
			System.out.println("	score "+x+"% out of bounds");
		}
	}
	//---------------------------
	public double average(){
		
		for (int j=0; j<=count; j++){
			sum = sum + ia[j];
		}
		average = sum/count;
		return average;
	}
	//-----------------------
	public int max(){
		
		for (int k=0; k<count; k++){
			for (int l=100; l>0; l--){
				if (ia[k]==l){
					max = l;
				}
			}
		}
		return max;
	}
	//------------------------------
	public int min(){
		
		for (int k=0; k<count; k++){
			for (int l=0; l<=100; l++){
				if (ia[k]==l){
					min = l;
					return min;
				}
			}
		}
		return min;
	}
	//---------------------------
	public int count(){
		return count;
	}
}
