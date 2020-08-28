package day09forloopnt;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		 Write a program to calculate the sum of first 10 counting number.
		 Counting numbers start from 1.
		 */
		
		//Create a sum variable assign it 0
		int sum = 0;
		
		//Create for loop and type sum = sum + i; inside the for loop
		for(int i=1; i<=10; i++ ) {
			sum = sum + i;
		}
		
		//Type System.out.println(sum); after the for loop not inside the for loop
		System.out.println(sum);

	}

}
