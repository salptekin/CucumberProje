package day15dowhileloopdt;

public class DoWhile01 {

	public static void main(String[] args) {
		// What is the difference between do-while and while ?
		int i = 1;
		
		//In while loop, the loop body runs after checking the condition.
		//If the condition is false then the loop body will not run any time
		while(i>1) {
			System.out.println("I am while loop");
		}
		
		//In do-while loop, the loop body runs without checking the condition first
		//After running once the condititon is checked. Because of that, do-while body
		//runs at least one
		do {
			System.out.println("I am do-while loop");
		}while(i>1);
		
	}

}
