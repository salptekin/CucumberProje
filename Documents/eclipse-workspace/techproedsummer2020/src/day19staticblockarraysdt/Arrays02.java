package day19staticblockarraysdt;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		String arr[] = {"Angie", "Leo", "Brad", "Adam", "Jack"};
		System.out.println(Arrays.toString(arr));//[Angie, Leo, Brad, Adam, Jack]
		
		// How to sort elements in alphabetical order
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//[Adam, Angie, Brad, Jack, Leo]
		
		//For number we use "ascending order", for Strings we use "alphabetical order"
		//"ascending order" and "alphabetical order" both are called "Natural Order"

	}

}
