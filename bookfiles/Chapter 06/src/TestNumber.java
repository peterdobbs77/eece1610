/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 125
 */
class Number
{
	private int x;
	//---------------------------
	public Number(int xx)
	{
		x = xx;
	}
	//----------------------------
	public Number add(Number r)
	{
		return new Number(x + r.x);
	}
	//----------------------------
	public String toString()
	{
		return "" + x;		// return value in x as String
	}
}
//===============================================
public class TestNumber 
{
	public static void main(String[] args)
	{
		Number n1 = new Number(10);
		Number n2 = new Number(20);
		Number n3 = n1.add(n2);
		System.out.println("n3 = " + n3.toString());
	}
}