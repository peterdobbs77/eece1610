
/* Homework1
 * References: N/A
 * 
 * @author Peter Dobbs
 * @version Created: 1/15/15
*/
public class PeterDobbs {
	public static void main (String[] problem1)
	{
		//problem1
		System.out.println("begin problem 1");			//display problem begin
		System.out.println("+----------------------+");	//display top edge
		System.out.println("|                      |");	//display sides
		System.out.println("|     Peter  Dobbs     |");	//display sides and 'your name'
		System.out.println("|                      |");	//display sides
		System.out.println("+----------------------+");	//display bottom edge
		System.out.println("problem 1 completed");		//display problem solved
		System.out.println("	");						//line break
	
		//problem3
		System.out.println("begin problem 3");							//display problem begin
		System.out.println("\\\"\"\\\\\"\"\"\\\\\\\"\"\"\"\\\\\\\\");	//escape sequence
		System.out.println("problem 3 completed");						//display problem solved
		System.out.println("	");										//line break
		
		//problem7
		System.out.println("begin problem 7");		//display problem begin
		String a, b, c;								//create references a,b,c
		a = new String("UPPER");					//create object
		System.out.println(a);						//display a-string
		b = new String("lower");					//create second object
		System.out.println(b);						//display b-string
		c = new String("MiXeD");					//create third object
		System.out.println(c);						//display c-string
		String x = a.toUpperCase();					//create ref x and object
		System.out.println(x);						//display x-string
		String y = b.toUpperCase();					//create ref y and object
		System.out.println(y);						//display y-string
		String z = c.toUpperCase();					//create ref z and object
		System.out.println(z);						//display z-string
		System.out.println("problem 7 completed");	//display problem solved
		System.out.println("all done");
		System.out.println("	");					//line break
		
		//additional fun
		System.out.println("Extra Stuff");	//display header
		String j = a.toLowerCase();			//create ref j and object
		System.out.println(j);				//display j-string
		String k = b.toLowerCase();			//create ref k and object
		System.out.println(k);				//display k-string
		String l = c.toLowerCase();			//create ref l and object
		System.out.println(l);				//display l-string
	}
}
