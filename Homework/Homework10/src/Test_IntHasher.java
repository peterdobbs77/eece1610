/*
 * Homework 10 Problem 3b
 * References: Introduction to Programming Using Java, Anthony J. Dos Reis
 * 
 * @author Peter Dobbs
 */
import java.util.Random;
public class Test_IntHasher {

	public static void main(String[] args){
		
		IntHasher ihObj = new IntHasher();	// IntHash object created
		Random rand = new Random(0);			// Random object created
		
		for (int i=0; i<200; i++){
			// enters randomly generated integers into the IntHash arrays
			ihObj.enter(rand.nextInt());
		}
		for (int i=0; i<1000; i++){
			System.out.println(ihObj.ia[i]);
		}
		
		// resets seed of random number generator
		rand.setSeed(0);
		for (int i=0; i<200; i++){
			System.out.println("Index of int entered "+i+": "+ihObj.getIndex(rand.nextInt()));
		}
		System.out.println("Entry Count: "+ihObj.getEntryCount());
		System.out.println("Average Probe Count per Integer: "+(ihObj.getProbeCount()/ihObj.getEntryCount()));
		System.out.println("Total Probe Count: "+ihObj.getProbeCount());
		ihObj.clear();
		
	}
}
