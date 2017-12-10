/*
 * In Class Assignment 22
 */
// Data type for elementary or composite particles
class Particle
{
	private String name;
	private double mass;
	private double charge;
	private double spin;
	//-----------------------------------
	public Particle(String n, double m, double c, double s)
	{
		name = n;
		mass = m;
		charge = c;
		spin = s;
	}
	public void organize()
	{
		System.out.println(name+" "+mass+" "+charge+" "+spin);
	}
}
//================================
class March232015a 
{
	public static void main(String[] args)
	{
		Particle electron = new Particle("electron", 0.0, 0.0, 0.0);
		electron.organize();
		Particle proton = new Particle("proton", 0.0, 0.0, 0.0);
		proton.organize();
	}
}
