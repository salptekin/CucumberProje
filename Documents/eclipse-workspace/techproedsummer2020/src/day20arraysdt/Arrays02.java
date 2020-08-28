package day20arraysdt;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// How to check if two arrays are equal to each other
		//If same elements have same indexes then the arrays are equal to each other
		//If arrays have different elements they cannot be equal to each other
		//In the following example arr1 is equal to arr2 but arr3 is different
		int arr1[] = {2, 7, 6};
		int arr2[] = {2, 7, 6};
		int arr3[] = {6, 2, 7};
		
		//1. Way: Using loops to check equality
		int count = 0;
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]==arr2[i]) {
				count++;
			}
		}
		if(count==arr1.length) {
			System.out.println("Arrays are same");
		}else {
			System.out.println("Arrays are not same");
		}
		
		//2. Way: Use equals() in Arrays class to check equality
		System.out.println(Arrays.equals(arr1, arr2)); //true
		System.out.println(Arrays.equals(arr1, arr3)); //false

	}

}
