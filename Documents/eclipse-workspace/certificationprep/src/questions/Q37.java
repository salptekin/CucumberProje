package questions;

public class Q37 {

	public static void main(String[] args) {
		int a[][] = { {1, 2, 3}, {4, 5}, {6} };
		
		for(int i=0; i<2; i++) {
			
			for(int k=1; k<2; k++) {
				System.out.print(a[i][k] + " ");//?
			}
			
		}
		
		System.out.println();
		
		for(int i=0; i<2; ++i) {
			
			for(int k=1; k<2; ++k) {
				System.out.print(a[i][k] + " ");//?
			}
			
		}
		
		System.out.println();
		
		for(int[] w : a) {
			for(int m : w) {
				System.out.print(m);//?
			}
		}

	}

}
