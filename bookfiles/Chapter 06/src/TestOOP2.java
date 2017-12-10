/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 116
 */
class OOP2	// No explicit constructor
{
	private int q;
	//--------------------
	public void set(int qq)
	{
		q = qq;
	}
	//--------------------
	public int get()
	{
		return q;
	}
}
//===============================
class TestOOP2 
{
	public static void main(String[] args)
	{
		OOP2 r = new OOP2();
		r.set(10);						// sets q to 10
		System.out.println(r.get());	// displays 10
	}
}
