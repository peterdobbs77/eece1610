/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 149-50
 */
class Con1
{
	private int x;
	//-----------------------------
	public Con1(int xx)			// first constructor
	{
		x = xx;
	}
	//------------------------------
	public Con1(Con1 original)	// copy constructor
	{
		x = original.x;
	}
}
//============================================
class TestCon1 {

	public static void main(String[] args)
	{
		Con1 c1 = new Con1(5);	// calls first constructor
		Con1 c2 = new Con1(c1);	// calls second constructor
		/*not from book:*/System.out.println(c2);
	}
}