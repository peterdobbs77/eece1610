import java.util.ArrayList;
public class example4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ial = new ArrayList<Integer>();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		if (i1 == i2)
			System.out.println("identical references");
		else
			System.out.println("different references");
		ial.add(i1);
		ial.add(i2);
		System.out.println("find index of i1: "+ial.indexOf(i1));
		i1 = 2;
		ial.add(i1);
		
		for(int z:ial)
			System.out.println(z);

	}

}
