package day20arraysdt;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		int arr[][] = { {2, 5}, {1, 7, 9, 11}, {3} };
		//What are the outputs?
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		System.out.println(arr[1][2]);
		System.out.println(Arrays.deepToString(arr));

	}

}
