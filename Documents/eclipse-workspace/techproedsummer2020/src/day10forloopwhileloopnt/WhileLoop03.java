package day10forloopwhileloopnt;

public class WhileLoop03 {

	public static void main(String[] args) {
		/*
		 Find 9 factorial (9! = 1x2x3x4x5x6x7x8x9) by using while loop
		*/
		
		int i=1;
		int product=1;
		while(i<=9) {
			product = product*i;
			i++;
		}
		System.out.println("9!= " + product);
		
	}

}
