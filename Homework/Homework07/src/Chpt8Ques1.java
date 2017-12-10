/*
 * Homework 7 Problem 2b
 * References: An Introduction to Programming Using Java, 
 * 		Anthony J Dos Reis
 * 
 * @author Peter Dobbs
 * @version Created: 2/28/15
 * 
 * Write a program that uses your Graph class. It should 
 * generate one million random integers all of which are 0, 1,
 * 2, 3, or 4. For each integer, your program should call 
 * countIt in a Graph object. After all the integers have been 
 * counted, your program should call graphIt
 */
import java.util.Random;
public class Chpt8Ques1 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		Graph graph = new Graph();
		for (int i = 0; i<1000000; i++)
		{
			int n = r.nextInt(5);
			graph.countIt(n);
		}
		graph.graphIt();
	}
}