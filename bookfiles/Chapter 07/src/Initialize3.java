/*
 * Taken from An Introduction to Programming Using Java, Anthony J Dos Reis, pg 146
 */
class Initialize3
{
	private int x, y;
	//----------------------------
	public Initialize3(int xx, int yy)
	{
		x = xx;		// init instance variable x with parameter xx
		y = yy;		// init instance variable y with parameter yy
	}
	//----------------------------
	public void displaySum()
	{
		System.out.println(x + y);
	}
}
