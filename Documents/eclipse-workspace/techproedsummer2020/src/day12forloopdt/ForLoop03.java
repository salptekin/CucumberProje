package day12forloopdt;

public class ForLoop03 {

	public static void main(String[] args) {
		// Print the integers which are divisible by 3 from 1 to 70
		// on the same line
		for(int i=1; i<=70; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
			}				
		}
		
		//Find the sum of first 10 counting numbers and print the sum on the console
		int sum = 0;
		for(int i=1; i<=10; i++) {	
			sum = sum + i;
		}
		//To see final sum on the console you must put System.out.println(sum);
		//out of the for-loop. 
		System.out.println(sum);//55
		
		//If you put System.out.println(sum); inside the for-loop you will print the sum
		//on the console for every loop
		int sum2 = 0;
		for(int i=1; i<=10; i++) {	
			sum2 = sum2 + i;
			System.out.println(sum2);
		}

	}

}
