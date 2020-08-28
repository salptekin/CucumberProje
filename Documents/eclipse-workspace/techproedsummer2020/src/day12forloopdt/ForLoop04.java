package day12forloopdt;

public class ForLoop04 {

	public static void main(String[] args) {
		// Find the product(multiplication) of first 5 counting numbers and print the
		// product on the console		
		int product = 1;
		
		for(int i=1; i<=5; i++) {		
			product = product * i;		
		}
		//If you want to see just the final result on the console, you must
		//put System.out.println(product); out of the for-loop
		System.out.println(product);

	}

}
