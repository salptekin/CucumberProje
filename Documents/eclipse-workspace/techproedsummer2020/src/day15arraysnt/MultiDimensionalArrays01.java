package day15arraysnt;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		// Multi dimensional array: The elements of an array will be array as well

		// How to create multidimensional array
		int arr[][] = new int[3][2];

		// How to print a multidimensional array
		System.out.println(Arrays.deepToString(arr));// [ [0, 0], [0, 0], [0, 0] ]

		// How to assign a value to a specific index
		arr[0][0] = 5;
		arr[0][1] = 6;
		arr[1][0] = 8;
		arr[1][1] = 9;
		arr[2][0] = 10;
		arr[2][1] = 11;
		System.out.println(Arrays.deepToString(arr));// [ [5, 6], [8, 9], [10, 11] ]

		// Short way to create a multidimensional array
		int arr1[][] = { { 5, 6, 7 }, { 2, 3 }, { 9 } };
		arr1[2][0] = 11;
		// How to print a specific element
		System.out.println(arr1[1][1]);// 3
		System.out.println(arr1[0][1]);// 6
		System.out.println("==>"+Arrays.toString(arr1[2]));// 6
		// How to print a specific array from outer array
		System.out.println(Arrays.toString(arr1[0]));// [5, 6, 7]
		System.out.println(Arrays.toString(arr1[1]));// [2, 3]
		System.out.println(Arrays.toString(arr1[2]));// [9]

	}

}
