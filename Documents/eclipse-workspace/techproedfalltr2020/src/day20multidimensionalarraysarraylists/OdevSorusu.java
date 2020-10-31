package day20multidimensionalarraysarraylists;

import java.util.Arrays;

public class OdevSorusu {

	public static void main(String[] args) {
		/*
		 4)Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların toplamını birer birer bulan
           ve herbir sonucu yeni bir array’in elemanı yapan ve yeni array’i ekrana yazdıran bir program yazınız 
           Ornegin; { {1,2,3}, {4,5}, {6,7} }  ==> 1+2+3=6  4+5=9  6+7=13  ==>  output: {6, 9, 13}
		 */
		
		int arr[][] = { {10,20,30}, {4}, {6,7,20}, {12, 3} };
		
		int sum = 0;		
		int sonuc[] = new int[arr.length];		
		for(int i=0; i<arr.length; i++) {			
			for(int k=0; k<arr[i].length; k++) {				
				sum = sum + arr[i][k];				
			}
			sonuc[i] = sum;
			sum=0;
		}		
		System.out.println(Arrays.toString(sonuc));
	}
}
