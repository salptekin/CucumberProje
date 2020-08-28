package day09forloopnt;

public class ForLoop02 {

	public static void main(String[] args) {
		// Write a program to print first 15 counting numbers
		// on the console side by side with a space between them		
		for(int i=1; i<=15; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Write a program to print first 15 counting numbers
		// on the console side by side with a space between them, but start to print
		// form 15 like ==> 15 14 13 ... 2 1
		for(int i=15; i>=1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Write a program to print first 15 even counting numbers
		// on the console side by side with a space between them	
		for(int i=1; i<=15; i++) { 
			System.out.print(2*i + " ");
		}
		
		System.out.println();
		
		for(int i=2; i<=30; i=i+2) {
			System.out.print(i + " ");
		}
		 
		System.out.println();
		
		// Write a program to print first 15 odd counting numbers
		// on the console side by side with a space between them
		for(int i=1; i<=15; i++) {           
			System.out.print(2*i-1 + " ");
		}
		
		System.out.println();
		
		for(int i=1; i<=29; i=i+2) {
			System.out.print(i + " ");
		}

	}

}
