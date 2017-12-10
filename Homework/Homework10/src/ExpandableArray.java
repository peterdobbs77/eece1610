/*
 * Homework 10 Problem 2a
 * References: Introduction to Programming Using Java, Anthony J. Dos Reis
 * 
 * @author Peter Dobbs
 */
public class ExpandableArray {

	private int currentCapacity = 2;
	private int[] ia = new int[currentCapacity];
	private int size=0;
	private int i=0;
	//-------------------
	public ExpandableArray(){
		//
	}
	//----------------
	public void add(int input){
		size++;
		while(i>=currentCapacity){
			currentCapacity*=2;
			int[] ia2 = new int[currentCapacity];
			for (int i=0; i<ia.length; i++){
				ia2[i]=ia[i];
			}
			ia = ia2;
		}
		ia[i]=input;
		i++;
	}
	//---------------------------------
	public void add(int index, int input) {
		size++;
		int[] ia2 = new int[currentCapacity];
		for (int i=0; i<index; i++){
			ia2[i]=ia[i];
		}
		ia2[index]=input;
		for (int i=index; i<size; i++){
			ia2[i+1]=ia[i];
		}
		ia=ia2;
	}
	//------------------------
	public void remove(int index){
		size--;
		int[] ia2 = new int[currentCapacity];
		for (int i=0; i<index; i++){
			ia2[i]=ia[i];
		}
		for (int i=index; i<size; i++){
			ia2[i]=ia[i+1];
		}
		ia=ia2;
	}
	//-----------------
	public int get(int index) {
		return ia[index];
	}
	//-----------------
	public void set(int index, int input) {
		ia[index] = input;
	}
	//-----------------
	public int size() {
		// returns the net number of integers added
		return size;
	}
}
