package day15arraysnt;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		//How to check if an array has a specific element or not
		
		int num[] = {4, 2, 8, 6};
		
		//Chick if 2 is an element or not
		
		Arrays.sort(num);//[2,4,6,8]
		//Before using binarySearch() you have to use sort() otherwise
		//sometimes the result will be true sometimes the result will be false 
		System.out.println(Arrays.binarySearch(num, 2));//it returns 1 because the index of 2 is 1
		//binarySearch() returns the index of the element which you are looking for.
		//If the return is 0 or positive number it means the element is exist
		
		char ch[] = {'a', 'd', 'b', 'c'};
		
		//Check if 'e' is the element of ch array
		Arrays.sort(ch);//[a, b, c, d]
		System.out.println(Arrays.binarySearch(ch, 'e'));
		//it returns -5 ==> - means not exist ==> 5 means; if 'e' is exist it would be 5th element
		//After using binarySearch() if you get negative numbers, it means the element
		//is absent in the array

	}

}
