/*
 * Homework 9 Question 3b
 * References: An Introduction to Programming Using Java, Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 */
public class TestInformation {

	public static void main(String[] args) {
		String[] name = {"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"};
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] birthstone = {"Garnet", "Amethyst", "Aquamarine", "Diamond", 
				"Emerald", "Alexandrite", "Ruby", "Peridot", "Sapphires", "Opal",
				"Topaz", "Blue Zircon"};
		
		// call Information display
		Information stuff = new Information();
		for (int i=0; i<12; i++){
			System.out.println(stuff.display(name[i], days[i], birthstone[i]));
		}
	}
}