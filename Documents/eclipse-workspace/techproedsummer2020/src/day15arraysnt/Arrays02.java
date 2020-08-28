package day15arraysnt;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// How to check if two arrays are same
		
		//If two arrays are same then 1)all elements must be same 
		//                            2)Same elements must be in same index
		//So a and b arrays are same, c has same elements with a and b arrays but 
		//the indexes are different
		int a[] = {2, 5, 3, 7, 4};
		int b[] = {2, 5, 3, 7, 4};
		int c[] = {2, 5, 7, 4, 3};
		
		//We can use loops to check if the elements are same or not
		int count = 0;
		
		for(int i=0; i<a.length; i++) {			
			if(a[i] != c[i]) {
				count++;
				System.out.println("Arrays are not same");
				break;
			}			
		}
		
		if(count==0) {
			System.out.println("Arrays are same");
		}
		
		//To check if two arrays are same we have a method in Arrays class
		//If you use equals() you will get false for non-equal arrays, you will get 
		//true for equal arrays
		System.out.println(Arrays.equals(a, c));//false
		System.out.println(Arrays.equals(a, b));//true

	}

}
