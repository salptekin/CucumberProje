package day44lambdadt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class L02 {

	public static void main(String[] args) {
		
		//We cannot use arrays in Lambda, but if you want to use arrays in Lambda convert it to a list the you can use
		//But for a list which is converted from an array, some methods will be disabled.
		int a[] = {12, 9, 13, 5, 8};		
		List<int[]> al = Arrays.asList(a);
		al.stream()
		  .sorted()
		  .forEach(t->System.out.print(Arrays.toString(t) + " "));
		
		System.out.println();
		
		//Instead of loops we can use IntStream ...
		IntStream.range(3,8)//3 is inclusive, 8 is exclusive
		         .forEach(t->System.out.print(t + " "));
		
		System.out.println();
		
		IntStream.rangeClosed(3, 8)//3 and 8 are inclusive
		         .forEach(t->System.out.print(t + " "));
		
		System.out.println();
		
		//Find the sum of the integers from 3 to 8
		int sum1 = IntStream.rangeClosed(3, 8)
		                    .sum();
		System.out.println(sum1);//33
		
		
		//Find the sum of the even integers from 3 to 8
		int sum2 = IntStream.rangeClosed(3, 8)
		                    .filter(t->t%2==0)
		                    .sum();
		System.out.println(sum2);//4 + 6 + 8 = 18
		
		//Find the multiplication of the integers from 3 to 8
		int prod1 = IntStream.rangeClosed(3, 8)
		                     .reduce(1, (t,u)->t*u);
		System.out.println(prod1);//20160
		
		//7 factorial ==> 7! = 7x6x5x4x3x2x1
		//Get the value from user and calculate its factorial
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to calculate its factorial");
		int num = scan.nextInt();
		int prod2 = IntStream.rangeClosed(1, num)
		                     .reduce(1, (t,u)->t*u);
		System.out.println(num + "! = " + prod2);
		
		//Find the multiplication of first 7 even counting numbers (2,4,6,8,10,12,14)
		//1. Way: Not recommended
		int prod3 = IntStream.rangeClosed(1, 14)
		                     .filter(t->t%2==0)
		                     .reduce(1, (t,u)->t*u);
		System.out.println(prod3);//645120
		
		//2. Way: Recommended
		int prod4 = IntStream.iterate(2, t->t+2)
				             .limit(7)
				             .reduce(1, (t,u)->t*u);
		System.out.println(prod4);//645120
		
		//Find the multiplication of first 9 odd counting numbers ( Use iterator() and limit() )
		int prod5 = IntStream.iterate(1, t->t+2)
	                         .limit(9)
	                         .reduce(1,  (t, u)->t*u);
        System.out.println(prod5);//34459425
		
        //Find the multiplication of first 5 odd counting numbers which are greater than 6 ( Use iterator() and limit() )
        int prod6 = IntStream.iterate(7, t->t+2)
				             .limit(5)
				             .reduce(1, (t, u) -> t * u );
		System.out.println(prod6);//135135
	}

}
