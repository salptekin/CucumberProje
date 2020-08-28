package day09forloopnt;

public class ForLoop04 {

	public static void main(String[] args) {
		/*
		 Write a program to calculate the product of the first 10
		 counting numbers
		 I mean; 1x2x3x4x5x6x7x8x9x10 = ?
		 */
		
		/*
		 That question is very common interview question
		 They ask that question like that;
	      Find 10 factorial (10!)? (1x2x3x4x5x6x7x8x9x10)
		 */
		
		int product = 1;
		
		for(int i=1; i<=10; i++) {
			product = product * i;
		}
		
		System.out.println(product);
		
	}

}
