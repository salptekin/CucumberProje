package lambda;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda16 {

	public static void main(String[] args) {
		// How to use IntStream.range() which is similar to "for loop"
		System.out.println(IntStream.range(1, 10).sum()); // ==> 45 because 1 is inclusive, 10 is exclusive
		System.out.println(IntStream.rangeClosed(1, 10).sum()); // ==> 55 because 1 and 10 are inclusive
		
		//How to iterate by using IntStream.range()
		//1) Print first 5 odd natural numbers on the console
		IntStream.iterate(1, t -> t + 2).limit(5).forEach(System.out::println); // 1 3 5 7 9
		
		System.out.println("====");
		//2) Print the sum of the first 5 odd natural numbers on the console
		System.out.println(IntStream.iterate(1, t -> t + 2).limit(5).sum()); //1+3+5+7+9=25
		
		System.out.println("====");
		//3) Print the sum of the first 100 even natural numbers on the console
		System.out.println(IntStream.iterate(0, t -> t + 2).limit(100).sum());
		
		System.out.println("====");
		//3) Print the first 5 powers of 2 on the console
		IntStream.iterate(2, t -> t*2).limit(5).forEach(System.out::println);
		
		//4) Print the average value of the first 5 powers of 2 on the console
		System.out.println(IntStream.iterate(2, t -> t*2).limit(5).average());
		
		//5) Print first 10 even numbers on the console as a list
		System.out.println(IntStream.iterate(2, t -> t*2).limit(5).boxed().collect(Collectors.toList()));
		
		//6) Calculate factorial 5
		System.out.println(IntStream.rangeClosed(1, 5).reduce(1, (x,y)->x*y));
		
		//7) Calculate factorial 50 
		//Note: BigInteger class is used for mathematical operation which involves very big integer calculations 
		//that are outside the limit of all available primitive data types.
		System.out.println(IntStream.rangeClosed(1, 50).reduce(1, (x,y)->x*y)); // This will exceed the max value of primitive integer
		System.out.println(IntStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));

	}

}
