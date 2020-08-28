package day14statickeywordarraysnt;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		/* Arrays: 
		   1) Arrays is used to store multiple data
		   2) You can store just one data type in an Array
		   3) Arrays can store just primitive data types and references of the objects
		   4) Before creating an Array you have to declare its max capacity(length)
		   5) If you try to store data more  than length you will get Error
		   6) It is allowed to store data less than length 
		   7) It is allowed not to store any data after creating Array, I mean empty array is fine
		*/
		
		//How to declare an Array
		//Data Type       Name of the Array[]   =    new keyword     Data Type[length]
		      int               arr[]           =        new              int[5];
		      
		System.out.println(arr.toString());//[I@7852e922 is the reference of the array, it is in Stack            
		//To print an array on the console use Arrays.toString(array name) 
		System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0]
		//To add element in an array use the following way
		arr[2] = 11;
		System.out.println(Arrays.toString(arr));//[0, 0, 11, 0, 0]
		arr[4] = 33;
		System.out.println(Arrays.toString(arr));//[0, 0, 11, 0, 33]
		arr[0] = 44;
		arr[1] = 54;
		arr[3] = 44;
		System.out.println(Arrays.toString(arr));//[44, 54, 11, 44, 33]		
		//Accessing the array with an index greater than or equal to the size of the array 
		//leads to “ArrayIndexOutOfBoundsException” it is Run Time Error
		// arr[5] = 22; or arr[6] = 23;
		
		//How to print an array element on the console
		System.out.println(arr[1]);//54		
		//Find the sum of all elements of the array arr
		int sum = 0;	
		for(int i=0; i<arr.length; i++) {//To make our code dynamic we use arr.length instead of 4
			sum = sum + arr[i];
		}
		System.out.println(sum);

	}

}
