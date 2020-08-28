package day10forloopwhileloopnt;

public class Question01 {

	public static void main(String[] args) {
		/*
		 Write a program to print counting numbers which are less than 200 and 
		 divisible by 5 on the console by using for-loop. 
		*/
		
		for(int i=1; i<200; i++) {
			if(i%5==0) {
				System.out.print(i + " ");
			}
		}		
	}
}
