package day32lambdant;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class L03 {

	public static void main(String[] args) {
		
		//Arrays cannot be used in Lambda directly but after converting list you can use it
		int a[] = {12, 9, 13, 5, 8};		
		List<int[]> al = Arrays.asList(a);		
		al.stream()
		  .forEach(t->System.out.println(Arrays.toString(t)));
		
		//How to print integers from 3 to 10 on the console
		IntStream.range(3,11)
		         .forEach(t->System.out.print(t + " "));//3 4 5 6 7 8 9 10
		
		System.out.println();
		
		//How to find sum of the integers from 3 to 10
		System.out.println(IntStream.range(3, 11)
				                    .sum());//52
		
		//How to find 9 factorial
		System.out.println(IntStream.range(1, 10)
				                    .reduce(1, (t,u)->t*u));//362880
		
		//How to find the sum of odd integers from 6 to 100
		System.out.println(IntStream.range(6, 101)
				                    .filter(t->t%2!=0)
				                    .sum());//2491
		
		//How to find the multiplication of first 5 even counting numbers
		//1. Way: Not recommended
		System.out.println(IntStream.range(1, 11)
		                            .filter(t->t%2==0)
		                            .reduce(1, (t,u)->t*u));//3840
		
		//2. Way:
		System.out.println(IntStream.iterate(2, t->t+2)
		                            .limit(5)
		                            .reduce(1, (t,u)->t*u));//3840
		
		//How to find the multiplication of 6 odd integers greater than 4 
		System.out.println(IntStream.iterate(5, t->t+2)
		                            .limit(6)
		                            .reduce(1, (t,u)->t*u));//675675

	}

}
