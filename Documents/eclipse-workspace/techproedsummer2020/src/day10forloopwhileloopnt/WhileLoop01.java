package day10forloopwhileloopnt;

public class WhileLoop01 {

	public static void main(String[] args) {
		// Print "Hello" 7 times on the console	
		int i = 1;
		while(i<=7) {
			System.out.println("Hello");
			i++;
		}
		
		//Print first 10 counting numbers on the console
		int j=1;
		while(j<=10) {
			System.out.print(j + " ");
			j++;
		}
		
		System.out.println();
		
		//Print first 20 even counting numbers on the console
		int k = 1;
		while(k<=20) {
			System.out.print(2*k + " ");
			k++;
		}
		
		System.out.println();
		
		int m=1;
		int n=1;
		while(m<=20) {
			if(n%2==0) {
				System.out.print(n + " ");
				m++;
			}
			n++;
		}
	}
}
