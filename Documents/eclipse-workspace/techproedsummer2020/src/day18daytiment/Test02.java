package day18daytiment;

public class Test02 {

	public static void main(String[] args) {
		System.out.println(m1(true, false, true));
		
		m2(1, 2, 3, 4);
		m2(1, 2, 3, 4, 5);
		m2(1, 2);
		
		m3("Result: ", 2, 3, 4);
		m3("Result: ", 2);
		m3("Result: ");
	}
	
	public static int m1(boolean b1, boolean... b2) {
	       return b2.length;
	} 
	
	public static void m2(int i, int j, int... k) {
	      System.out.println(k.length);
	}
	
	public static void m3(String x, int... y) {
		int p = 1;
		for(int w: y) {
			p = p * w;
		}
		System.out.print(x);
		System.out.println(p);
	}

}
