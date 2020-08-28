package day17foreachloopnt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		// How to convert an array to a list
		
		//Convert the following array to a list by using for-loop
		int arr[] = {3, 4, 5, 6};
		List<Integer> list1 = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			list1.add(arr[i]);
		}
		System.out.println(list1.get(2));
		
		//Convert the following array to a list by using Arrays methods
		String brr[] = {"A", "B", "C"};	
		List<String> list2 = Arrays.asList(brr);
		System.out.println("List: " + list2);
		
		//How to convert a List to an Array
		String crr[] = list2.toArray(new String[0]);
		System.out.println("Array: " + Arrays.toString(crr));//[A, B, C]
		
		//Note:When you convert a list to an array you have to use Wrapper Classes
		//     as data type of array
		Integer drr[] = list1.toArray(new Integer[0]);
		System.out.println("Array: " + Arrays.toString(drr));

	}

}
