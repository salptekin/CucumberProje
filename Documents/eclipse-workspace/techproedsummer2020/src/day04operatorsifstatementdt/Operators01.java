package day04operatorsifstatementdt;

public class Operators01 {

	public static void main(String[] args) {
		/*
		 Create two integer variables, name them as a, and b.
		 Calculate the result of a + b * ( a - a % b )
		*/
		
		int a = 20;
		int b = 5;
		System.out.println(a + b * ( a - a % b ));

	}

}
