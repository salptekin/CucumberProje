package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		
		//Multidimesional array'ler nasil olusturulur?
		int ma[][] = new int[3][2];
		
		//Multidimesional array'ler nasil ekrana yazdirilir?
		System.out.println(Arrays.deepToString(ma));// [ [0, 0], [0, 0], [0, 0] ]
		
		//Multidimesional array'lere eleman ekleme nasil yapilir?
		ma[0][0] = 33;
		System.out.println(Arrays.deepToString(ma));// [ [33, 0], [0, 0], [0, 0] ]
		ma[1][1] = 24;
		System.out.println(Arrays.deepToString(ma));// [ [33, 0], [0, 24], [0, 0] ]
		ma[0][1] = 32;
		System.out.println(Arrays.deepToString(ma));// [[33, 32], [0, 24], [0, 0]]
		ma[1][0] = 23;
		System.out.println(Arrays.deepToString(ma));// [[33, 32], [23, 24], [0, 0]] 
		ma[2][0] = 13;
		System.out.println(Arrays.deepToString(ma));// [[33, 32], [23, 24], [13, 0]]
		ma[2][1] = 11;
		System.out.println(Arrays.deepToString(ma));// [[33, 32], [23, 24], [13, 11]]
		
		//ic array'ler nasil ekrana yazdirilir?
		//[23, 24] array'ini ekrana yazdiriniz
		System.out.println(Arrays.toString(ma[1]));//[23, 24]
		
		//Multidimensional array'lerde istenen bir eleman yazdirilir?
		System.out.println(ma[2][0]);//13
		System.out.println(ma[1][1]);//24
		
	}

}
