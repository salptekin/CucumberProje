package day12forloopdt;

public class ForLoop02 {

	public static void main(String[] args) {
		// Print your name 20 times on the console
		for(int i=1; i<21; i++) {	
			System.out.println("Suleyman");	
		}
		
		//Print the integers from 3 to 20 on the same line with a space between them
		//3 4 5 ... 19 20 
		for(int i=3; i<=20; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Print the integers from 20 to 3 on the same line with a space between them
		//20 19 18 ... 4 3 
		for(int i=20; i>=3; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Print the even integers from 12 to 32 on the same line with a space between them
		//1. Way by using if statement
		for(int i=12; i<=32; i++) {		
			if(i%2==0) {
				System.out.print(i + " ");
			}	
		}
		
		System.out.println();
		
		//2. Way by changing increment part
		for(int i=12; i<=32; i=i+2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Print odd integers from 12 to 32 on the same line with a space between them
		//1. Way by using if statement
		for(int i=12; i<=32; i++) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		
		//2. Way by changing increment part
		for(int i=13; i<32; i=i+2) {
			System.out.print(i + " ");
		}

	}

}
