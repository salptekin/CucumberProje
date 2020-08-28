package day14statickeywordarraysnt;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {

		//Create an integer array whose length is 11
		int arr[] = new int[11];
		
		//Use for-loop to assign consecutive values starting from 10 to the elements
		int idx = 10;
		for(int i=0; i<arr.length; i++) {
			arr[i]=idx;
			idx++;
		}
		//Print the array on the console
		System.out.println(Arrays.toString(arr));
		
		//Print the array elements one by one on the console by using do-while loop
		int k=0;
		do {
			System.out.print(arr[k] + " ");
			k++;
		}while(k<arr.length);
		
		System.out.println();
		
		//Use while-loop to find the sum of all array elements
		int m = 0;
		int sum = 0;
		while(m<arr.length) {
			sum = sum + arr[m];
			m++;
		}
		System.out.println(sum);

	}

}
