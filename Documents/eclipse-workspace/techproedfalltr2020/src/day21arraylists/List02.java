package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		// Iki tane integer list olusturunuz. [1, 3, 1, 2]    [3, 2, 4, 4, 5]
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(3);
		list1.add(1);
		list1.add(2);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(2);
		list2.add(4);
		list2.add(4);
		list2.add(5);
		System.out.println(list2);
		
		//Bir list'i bir baska list'in sonuna eklemek
		list1.addAll(list2);
		System.out.println(list1);//[1, 3, 1, 2, 3, 2, 4, 4, 5]
			
		//Bir list'i bir baska list'in istenen index'ine eklemek
		list1.addAll(1, list2);
		System.out.println(list1);//[1, 3, 2, 4, 4, 5, 3, 1, 2, 3, 2, 4, 4, 5]
		
		//Bir list'ten toplu eleman silmek
		list1.removeAll(list2); //[1, 3, 2, 4, 4, 5, 3, 1, 2, 3, 2, 4, 4, 5]
		System.out.println(list1);//[1, 1]
		System.out.println(list2);//[3, 2, 4, 4, 5]
		
		//Bir list'in bir baska liste esit olup olmadigini kontrol etmek
		System.out.println(list1.equals(list2));//false
		
		System.out.println(list2.containsAll(list1));//false
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(3);
		list3.add(2);
		System.out.println(list3);//[3, 2]
		
		System.out.println(list2.containsAll(list3));//true
		
		//get() methodu index'i verilen elemani return eder
		System.out.println(list2.get(1));//2
		
		//indexOf() methodu verilen elemanin ilk gorunumunun index'ini return eder.
		System.out.println(list2.indexOf(4));//2
		
		//lastIndexOf() methodu verilen elemanin son gorunumunun index'ini return eder.
		System.out.println(list2.lastIndexOf(4));//3
		
		
		//subList(index1, index2) methodu list'in index1 den index2'ye kadar olan bolumunu return eder.
		//index1 dahil, index2 harictir.
		System.out.println(list2.subList(1, 3));//[2, 4]

	}
}
