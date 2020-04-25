package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda15 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		list.stream().forEach(System.out::println);
		System.out.println("==========");
		//How to create stream by using stream.of() method
		Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).forEach(System.out::println);
		
		System.out.println("==========");
		//How to use stream() for Arrays
		int[] arr = {12, 9, 13, 4, 6, 2, 4, 12, 15};
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println("Min value: " + Arrays.stream(arr).min());
		System.out.println("Average value: " + Arrays.stream(arr).average());
		System.out.println("Sum: " + Arrays.stream(arr).sum());
		
	}

}
