package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {
		
		//Multidimensional array nasil olusturulur?
		int mda[][] = new int[3][2];
		
		//Multidimensional array'e deger atamasi nasil yapilir?
		mda[1][0] = 7;
		
		//Multidimensional array'ler nasil console'a yazdirilir?
		System.out.println(Arrays.deepToString(mda));//[  [0, 0], [7, 0], [0, 0]  ]
		
		mda[2][0] = 11;
		System.out.println(Arrays.deepToString(mda));//[  [0, 0], [7, 0], [11, 0]  ]
		
		mda[0][1] = 23;
		System.out.println(Arrays.deepToString(mda));//[  [0, 23], [7, 0], [11, 0]  ]
		
		mda[0][0] = 10;
		mda[1][1] = 12;
		mda[2][1] = 55;
		System.out.println(Arrays.deepToString(mda));//[  [10, 23], [7, 12], [11, 55]  ]
		
		//Multidimensional array'lerde istenen bir elemani yazdirmak
		System.out.println(Arrays.toString(mda[0]));//[10, 23]
		System.out.println(Arrays.toString(mda[1]));//[7, 12]
		System.out.println(Arrays.toString(mda[2]));//[11, 55]
		
		System.out.println(mda[0][0]);//10
		System.out.println(mda[1][1]);//12
		System.out.println(mda[2][0]);//11
		
		
		//Multidimensional array olusturmanin kisa yolu nedir?
		char mdac[][] = { {'a', 'b', 'c'}, {'d'}, {'e', 'f'}, {'g', 'h', 'i', 'k'} };
		
		System.out.println(Arrays.deepToString(mdac));//[ [a, b, c], [d], [e, f], [g, h, i, k] ]
		
		//Soru: Yukaridaki multidimensional array'deki ilk arrayin elemanlarinin ASCII degerleri
		//toplamini ekrana yazdiriniz		
		//1. Yol:
		System.out.println(mdac[0][0] + mdac[0][1] + mdac[0][2]);//294		
		//2. Yol for-loop ile		
		int sum = 0;		
		for(int i=0; i<mdac[0].length; i++) {			
			sum = sum + mdac[0][i];			
		}		
		System.out.println(sum);//294

	}

}
