/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 119
 */
class OOP3
{
	private int x;
	//-------------------------
	public OOP3(int xx)
	{
		x = xx;
	}
	//-------------------------
	public void divide(int y)
	{
		x = x/y;	// translated as if this.x = this.x/y
		display();	// passes its this parameter
	}
	//--------------------------
	private void display()
	{
		System.out.println(x);	// x translated as if this.x
	}
}
//========================================
class TestOOP3 
{
	public static void main(String[] args)
	{
		OOP3 r1 = new OOP3(10);
		OOP3 r2 = new OOP3(20);
		r1.divide(2);			// r1 and 2 passed
		r2.divide(5);			// r2 and 5 passed
	}
}
