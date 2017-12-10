/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 147-8
 */
class SideEffect
{
	private int x = 1;
	//--------------------------
	public void xSet(int xx)
	{
		x = xx;
	}
	//--------------------------
	public int xGet()
	{
		return x;
	}
}
//===============================================
class TestSideEffect
{
	public static void main(String[] args)
	{
		int p = 1;							// p is 1 here
		change(p);
		System.out.println(p);				// p is still 1
		
		SideEffect r = new SideEffect();	// x is 1 here
		change(r);
		System.out.println(r.xGet());		// x is 2 here
	}
	//---------------------------------------
	public static void change(int q)
	{
		q = 2;								// does not affect p
	}
	//---------------------------------------
	public static void change(SideEffect t)
	{
		t.xSet(2);							// assigns 2 to x
	}
}