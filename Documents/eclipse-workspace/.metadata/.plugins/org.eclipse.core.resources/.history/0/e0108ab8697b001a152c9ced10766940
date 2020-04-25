package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda11 {

	public static void main(String[] args) {
		
		//Supplier: No input, returns something
		Supplier<Integer> randomIntegerSupplierHardCoded = () -> 2; // () is used for "no input" in Lambda
		System.out.println(randomIntegerSupplierHardCoded.get());  //To run Supplier use get()
		
		Random random = new Random();
		Supplier<Integer> randomIntegerSupplier = () -> random.nextInt(10); //random.nextInt(10) returns integer between 0 inclusive and 10 inclusive
		System.out.println(randomIntegerSupplier.get());
		
		//UnaryOperator: It accepts 1 input, returns result
		//               UnaryOperator<T> overloads the Function<T, T>
		UnaryOperator<Integer> unaryOperator = (t) -> 5*t; // "t -> 3*t" works as well
		System.out.println(unaryOperator.apply(8)); //To run UnaryOperator use apply()		

	}

}
