/*
 * In Class Assignment 6
 * Peter Dobbs
 */
public class January282015a {

	public static void main(String[] args) {
		/* initial position = 0
		 * initial velocity = 1 m/s
		 * falling time = 10 seconds
		 * gravity = 9.8 m/sec^2
		 */
		double position1=0, velocity=1, gravity=9.8, time=10;
		double a = position1 + (time*velocity) + (.5)*(Math.pow(time,2))*(gravity);
		System.out.println("final position = "+a);
		

	}

}
