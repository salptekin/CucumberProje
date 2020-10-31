package day21arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		
		//Array'i List'e cevirmek
		
		String arr[] = {"Aliye", "Veli", "Canan", "Kemal"};		
		//Array'i list'e cevirmek icin Arrays class'indan asList() methodunu kullaniriz.
		List<String> l1 = Arrays.asList(arr);
		System.out.println(l1);//[Aliye, Veli, Canan, Kemal]
		//Array'den uretilen list'lerde size'i degistiren method'lar kullanilamaz.
		//Ornegin; add(), remove(), clear() gibi...
		//Kullanirsaniz Java Run Time Error verir (UnsupportedOperationException)
		//l1.add("Yahya");
		//System.out.println(l1);
		
		//List'i Array'e cevirmek
		String arrayFromList[] = l1.toArray(new String[0]);
		System.out.println(Arrays.toString(arrayFromList));//[Aliye, Veli, Canan, Kemal]
		
		//NOT:remove() methodu integer list'lerde kullanilirken remove() methodunun icine konulan deger her zaman index 
		//olarak alinir. Eleman olarak dusunulmez.
		List<Integer> l2 = new ArrayList<>();
		l2.add(5);
		l2.add(2);
		l2.add(4);
		l2.add(3);
		l2.add(1);
		System.out.println(l2);	
		System.out.println(l2.remove(4));
		System.out.println(l2);

	}

}
