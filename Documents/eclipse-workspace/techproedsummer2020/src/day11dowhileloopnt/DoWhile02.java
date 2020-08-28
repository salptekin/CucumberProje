package day11dowhileloopnt;

public class DoWhile02 {

	public static void main(String[] args) {
		// Print first 10 counting numbers on the console by using do-while loop
		int i=1;
		
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=10);
		
		System.out.println();
		
		//Print first 5 even counting numbers on the console by using do-while loop
		int j = 1;
		
		do {
			if(j%2==0) {
				System.out.print(j + " ");
			}
			j++;
		}while(j<=10);
		
		System.out.println();
		
		//Print the counting numbers which are divisible by 3 and less than 100
		//by using do-while loop
		int k=1;
		
		do {
			if(k%3==0) {
				System.out.print(k + " ");
			}
			k++;
		}while(k<100);

	}

}
