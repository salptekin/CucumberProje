package day10forloopwhileloopnt;

public class WhileLoop04 {

	public static void main(String[] args) {
		/*
		 Create multiplication table for 3 by using while loop
		 3x1 = 3 ==> 3*1
		 3x2 = 6 ==> 3*2
		 3x3 = 9 ==> 3*3
		 .
		 .
		 .
		 3x10 = 30 ==> 3*10
		*/
		
		int i=1;
		while(i<=10) {
			System.out.println("3x" + i + " = " + 3*i);
			i++;
		}

	}

}
