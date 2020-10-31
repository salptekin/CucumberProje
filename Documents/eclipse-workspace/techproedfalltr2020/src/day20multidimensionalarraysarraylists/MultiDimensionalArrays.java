package day20multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		int ma[][] = { {11, 5}, {7, 11}, {21, 17, 28}, {10,10} };
		
		System.out.println(Arrays.deepToString(ma));//[[11, 5], [7], [21, 17, 28]]
		
		System.out.println(Arrays.toString(ma[2]));//[21, 17, 28]
		
		System.out.println(ma[2][1]);//17
		
		//ma multidimensional array'inin tum elemanlarini ayni satirda aralarina bosluk birakarak yazdiriniz
		for(int i=0; i<ma.length; i++) {		
			for(int k=0; k<ma[i].length; k++) {
				System.out.print(ma[i][k] + " ");
			}			
		}
		
		System.out.println();
		
		//ma multidimensional array'inin tum elemanlarinin toplamini ekrana yazdiran programi yaziniz
		int sum = 0;
		
		for(int i=0; i<ma.length; i++) {	
			for(int k=0; k<ma[i].length; k++) {
				sum = sum + ma[i][k];
			}
		}
		System.out.println("Toplam: " + sum);
		
		//ma multidimensional array'inin tum elemanlarinin carpimini ekrana yazdiran programi yaziniz (Odev)
		
		//ma multidimensional array'inin tum elemanlarindan cift olanlarinin karesini ekrana yazdiriniz
		for(int i=0; i<ma.length; i++) {
			
			for(int j=0; j<ma[i].length; j++) {
				
				if(ma[i][j]%2==0) {
					System.out.print(ma[i][j]*ma[i][j] + " ");
				}
				
			}			
		}
	}
}
