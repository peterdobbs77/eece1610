import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Number> v = new Vector<Number>(3, 2);
		System.out.println("Initial size: "+v.size());
		System.out.println("Initial capacity: "+v.capacity());
		
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("Capacity after four additions: "+v.capacity());
		
		v.addElement(new Double(5.45));
		System.out.println("Current capcity: "+v.capacity());
		v.addElement(new Double(6.08));
		System.out.println("Current capacity: "+v.capacity());
		v.addElement(new Integer(7));
		System.out.println("Current capacity: "+v.capacity());
		
		//etc...
		
	}

}
