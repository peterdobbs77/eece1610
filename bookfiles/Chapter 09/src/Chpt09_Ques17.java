
public class Chpt09_Ques17 {

	//column
	private static final int D1 = 3;
	//row
	private static final int D2 = 3;
	//section
	private static final int D3 = 3;
	
	public static void main(String[] args) {

		int[][][] threedimensionalarray = new int[D1][D2][D3];
		
		for (int d1=0; d1<D1; d1++){
			for (int d2=0; d2<D2; d2++){
				for (int d3=0; d3<D3; d3++){
					threedimensionalarray[d1][d2][d3]=(d1+d2+d3);
				}
			}
		}
		
		for (int d3=0; d3<D1; d3++){
			System.out.println("Section "+(d3+1)+":");
			for (int d2=0; d2<D2; d2++){
				for (int d1=0; d1<D3; d1++){
					System.out.print(threedimensionalarray[d1][d2][d3]+" ");
				}
				System.out.println();
			}
		}
	}
}
