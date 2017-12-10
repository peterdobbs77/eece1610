/*
 * Homework 10 Problem 2b
 * References: Introduction to Programming Using Java, Anthony J. Dos Reis
 * 
 * @author Peter Dobbs
 */
public class Test_ExpandableArray {

	public static void main(String[] args) {

		//create an ExpandableArray object
		ExpandableArray eaObj = new ExpandableArray();
		
		//add 1, 2, 99, 4, 6, 7, 8, 9, 10
		eaObj.add(1);
		eaObj.add(2);
		eaObj.add(99);
		eaObj.add(4);
		eaObj.add(6);
		eaObj.add(7);
		eaObj.add(8);
		eaObj.add(9);
		eaObj.add(10);
		
		//set 99 to 3
		eaObj.set(2, 3);
		
		//insert 5 after the number 4
		eaObj.add(4, 5);
		
		//display the current size
		System.out.println("Current size of array: "+eaObj.size());
		
		//display the integers stored by calling get within a for loop
		display(eaObj);
		
		//testing remove method
		eaObj.remove(2);	// removes element at index 2
		display(eaObj);
	}
	public static void display(ExpandableArray eaObj){
		System.out.println("ExpandableArray now contains ");
		for (int i=0; i<eaObj.size(); i++)
			System.out.print(eaObj.get(i)+" ");
		System.out.println();
	}
}
