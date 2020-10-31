package day20multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
	
	/*
	 1)List'ler primitive data type'larini kabul etmez. Primitive data type'lari yerine wrapper
	   class'lari kullaniriz.
	 */

	public static void main(String[] args) {
		
		//ArrayList olusturmak
		
		//1.Yol:
		//ArrayList<Integer> list1 = new ArrayList<Integer>();
		//2.Yol:
		//ArrayList<Integer> list2 = new ArrayList<>();
		
		//3.Yol: Recommended
		List<Integer> list3 = new ArrayList<>();
		
		//List'leri console'a yazdirmak
		System.out.println(list3);//[]
		
		//List'e eleman eklemek
		list3.add(12);
		System.out.println(list3);//[12]
		
		list3.add(13);
		System.out.println(list3);//[12, 13]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
