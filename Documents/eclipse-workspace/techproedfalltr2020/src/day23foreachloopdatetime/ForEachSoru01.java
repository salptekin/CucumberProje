package day23foreachloopdatetime;

public class ForEachSoru01 {

	public static void main(String[] args) {
		
		/*
		 Asagida verilen multidimesional array'in elemanlari carpimini bulunuz
		*/
		int arr[][] = { {2, 3}, {4, 10}, {6, 7}, {10, 10, 10} };
		
		int carpim = 1;
		for(int[] w : arr) {
			for(int t : w) {
				carpim = carpim * t;	
			}	
		}
		System.out.println(carpim);

	}

}
