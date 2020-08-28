package day09forloopnt;

public class ForLoop05 {

	public static void main(String[] args) {
		// Print the counting numbers which are less than 100 and divisible by 3
		// on the console. 3,6,9,..,99
		
		//1. Way
		for(int i=3; i<=99; i=i+3) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//2. Way
		for(int i=1; i<100; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		/*
		 Print first 70 counting numbers which are divisible by 4 and 6
		*/
		int count = 0;
		
		for(int i=1; count<=70; i++) {
			
			if(i%4==0 && i%6==0) {
				System.out.print(i + " ");
				count++;
			}	
		}
	
	}
}
