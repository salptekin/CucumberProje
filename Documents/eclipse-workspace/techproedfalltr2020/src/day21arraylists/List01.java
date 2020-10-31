package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<>();
		
		//List'e eleman eklemenin 2 yolu vardir.
		ls.add("B");
		ls.add("M");
		ls.add("A");
		ls.add(1, "K");
		ls.add(0, "S");
		ls.add("T");
		ls.add("M");
		System.out.println(ls);
		
		//List'in icindeki eleman sayisini bulmak
		//Array'lerin eleman sayisindan  bahsederken "Array'in length'i" deyiniz
		//List'lerin eleman sayisindan  bahsederken "List'in size'i" deyiniz
		System.out.println(ls.size());
		
		//Bir list'in bos olup olmadigini kontrol etmek
		System.out.println(ls.isEmpty());//false
		
		//Bir list'ten index kullanarak eleman silmek
		//index ile remove() kullanirsaniz ve ekrana yazdirirsaniz, Java sildigi elemani ekrana yazar
		System.out.println(ls.remove(2)); // K
		System.out.println(ls);//[S, B, M, A, T]
		
		//Bir list'ten eleman ismi ile eleman silmek.
		System.out.println(ls.remove("T"));//true
		System.out.println(ls);//[S, B, M, A]
		
		System.out.println(ls.remove("X"));//false
		System.out.println(ls);//[S, B, M, A]
		
		ls.remove("M");
		System.out.println(ls);//[S, B, A, M]
		
		//Bir list'de istenen elemanin var olup olmadigini kontrol etmek
		System.out.println(ls.contains("B"));//true
		System.out.println(ls.contains("X"));//false
		
		//Bir list'in belli index'indeki elemani degistirmek
		System.out.println(ls.set(1, "Bursa"));//B
		System.out.println(ls);//[S, Bursa, A, M]
		
		//Bir list'teki elemanlari siralamak
		Collections.sort(ls);// <==== Unutmayin!!!
		System.out.println(ls);//[A, Bursa, M, S]
		
		//Bir list'teki tum elemanlari silmek
		ls.clear();
		System.out.println(ls);//[]

	}

}
