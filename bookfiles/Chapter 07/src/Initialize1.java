/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 144
 */
class Initialize1 
{
	private int x, y;
	//---------------------------
	public Initialize1()
	{
		x = 0;		// initialize instance variable
		y = 1;
	}
	//---------------------------
	public void displaySum()
	{
		System.out.println(x + y);
	}
}