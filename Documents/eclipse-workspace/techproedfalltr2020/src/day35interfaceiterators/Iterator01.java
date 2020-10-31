package day35interfaceiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Iterator01 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("B");
		list1.add("C");
		list1.add("A");
		list1.add("D");
		System.out.println(list1);//[B, C, A, D]
		
		//List elemanlarini for loop kullanarak yazdiriniz.
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}		
		System.out.println();
		//List elemanlarini for-each loop kullanarak yazdiriniz.
		for(String w : list1) {
			System.out.print(w + " ");
		}
		
		//list1'deki elemanlarin sonuna for loop kullanarak "!" isareti ekleyiniz.
		//list1 i yazdiriniz.
		for(int i=0; i<list1.size(); i++) {
			list1.set(i, list1.get(i) + "!");
		}
		System.out.println(list1);//[B!, C!, A!, D!]
		
		//list1'deki elemanlarin sonuna for-each loop kullanarak "!" isareti ekleyiniz.
		//list1 i yazdiriniz.
		//Gordugunuz gibi set() methodunu kullanabilmek icin index lazim ama for-each loop
		//index kullanmaz.Bu yuzden for-each loop kullanarak list'ler update edilemezler.
		
		/*
		 for loop kullanarak list'leri update etmek istemiyorum, for-each loop da list'leri
		 update edemiyor. Bu durumda for loop kullanmadan list'leri update edebilmek icin 
		 iterator'lari kullaniriz.
		*/
		
		List<String> list2 = new ArrayList<>();
		list2.add("U");
		list2.add("V");
		list2.add("Y");
		list2.add("Z");
		System.out.println(list2);//[U, V, Y, Z]
		
		Iterator<String> it2 = list2.iterator();	
		while(it2.hasNext()) {
			it2.next();
		    it2.remove();	
		}
		System.out.println(list2);//[]
		
		
		List<String> list3 = new ArrayList<>();
		list3.add("K");
		list3.add("L");
		list3.add("M");
		System.out.println(list3);//[K, L, M]
		
		ListIterator<String> it3 = list3.listIterator();	
		while(it3.hasNext()) {
			String el = it3.next();
			it3.set(el + "!");//list elemanlarini update eder	
			it3.add(el);//list'e eleman ekler
		}
		System.out.println(list3);//[K!, K, L!, L, M!, M]
		
		
		List<String> list4 = new ArrayList<>();
		list4.add("e");
		list4.add("f");
		list4.add("g");
		System.out.println(list4);//[e, f, g]
		
		ListIterator<String> it4 = list4.listIterator();
		
		/*
		 Not: hasPrevious() ve previous() methodlarini kullanmadan once 
		      hasNext() ve next() methodlarini kullanarak pointer'i an saga yollamaliyiz.
		*/
		
		/*
		 Sadece son elemanin basina "*" koyunuz ve list elemanlrini sondan basa 
		 dogru yazdiriniz.
		*/
		int counter = 0;
		
		while(it4.hasNext()) {
			String el = it4.next();
			if(counter==2) {
				it4.set("*" + el);	
			}
			counter++;	
		}
		
		while(it4.hasPrevious()) {
			String el = it4.previous();
			System.out.print(el + " ");	
		}
		
		/*
		 "iterator" ile "listiterator" in farklari nelerdir?
		 1)"iterator" sadece hasNext(), next() ve "remove()" methodlarini icerir. 
		   "listiterator" ise hasNext(), next(), "remove()", "hasPrevious()", "previous()",
		   "add()", "set()" methodlari vardir.
		 2)"listiterator" adin da anlasilacagi gibi sadece list'ler icin kullanilir.
		   "iterator" ise list, map, set gibi diger collection'lar icin de kullanilir.  
		 3)"iterator" kullanarak sadece bastan sona dogru seyahat edebilirsiniz, ama 
		   "listiterator" kullanirsaniz cift yonlu seyahat edebilirsiniz. 
		*/

	}

}
