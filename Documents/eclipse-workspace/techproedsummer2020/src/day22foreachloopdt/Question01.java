package day22foreachloopdt;

import java.util.Arrays;

public class Question01 {

	public static void main(String[] args) {
		/*
		 Write a Java program to remove a specific element from an array.
		*/	
		int a[] = {12, 11, 23, 7};		
		int b[] = new int[a.length-1];		
		int idx = 2;
		int k = 0;		
		for(int i = 0; i<a.length; i++) {			
			if(i==idx) {
				continue;//skip the element
			}			
			b[k] = a[i];
			k++;			
		}		
		System.out.println(Arrays.toString(b));//[12, 23, 7]
	}
}
