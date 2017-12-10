/*
 * Homework 9 Question 2
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 */
public class Chpt9Ques3 {
	
	static final int ROWS = 5;
	static final int COLS = 10;
	public static void main(String[] args){
		// initialize array
		int[][] fivebyten = new int[ROWS][COLS];
		// assign values
		for (int row=0; row<5; row++){
			for(int column=0; column<10; column++){
				fivebyten[row][column]=row;
			}
		}
		
		for(int row=0; row<ROWS; row++){
			for(int col=0; col<COLS; col++){
				System.out.print(" "+fivebyten[row][col]);
			}
			System.out.println("");
		}
	}
}