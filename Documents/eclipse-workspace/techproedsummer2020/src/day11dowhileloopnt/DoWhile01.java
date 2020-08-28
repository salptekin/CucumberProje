package day11dowhileloopnt;

public class DoWhile01 {

	public static void main(String[] args) {
		
		int i=1;
		
		//You will get nothing on the console because the condition is false
		while(i>1) {
			System.out.println("While Loop");
			i++;
		}
		
		//You will see Do While Loop on the console once because
		//Java is checking the condition after running the code
		do {		
			System.out.println("Do While Loop");			
		}while(i>1);

	}

}
