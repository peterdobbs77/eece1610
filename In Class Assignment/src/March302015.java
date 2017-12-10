/*
 * In Class Assignment 23
 */
public class March302015 {
	
	public static void main(String[] args){
		
		double[] z = new double[100];
		z[0]=1;
		z[1]=1;
		
		for(int i=2; i<z.length; i++)
		{
			z[i]=z[i-1]+z[i-2];
		}
		for(double x:z)
			System.out.println(x);
	}
}