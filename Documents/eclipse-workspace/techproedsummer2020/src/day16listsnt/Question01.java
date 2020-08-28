package day16listsnt;

import java.util.Arrays;

public class Question01 {

	public static void main(String[] args) {
		// Remove element "3" from the given array
		// I mean new array will be {14, 21, 7}
		
		int a[] = {14, 3, 21, 7};	
		int b[] = new int[a.length-1];
		
		int idx = 1; //Index of 3 is 1
		int k =0;
		
		for(int i=0; i<a.length; i++) {
			if(i == idx) {
				continue;//If you use continue Java will skip the data 
				         //without doing anything
			}
			b[k] = a[i];
			k++;
		}
		System.out.println("Old Array: " + Arrays.toString(a));
		System.out.println("New Array: " + Arrays.toString(b));

	}

}
