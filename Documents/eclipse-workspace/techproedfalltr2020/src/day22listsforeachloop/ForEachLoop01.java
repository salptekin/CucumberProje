package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		/*
		 1)for-each loop, for-loop'un gelistirilmis halidir.
		   Yazmasi kolay
		   Okumasi kolay
		   Hata yapma ihtimali daha az
		*/
		
		//Integer list olusturun, elemanlari 1'er 1'er ayni satira aralarina bosluk birakarak yazdirin (for-loop).
		List<Integer> ls = new ArrayList<>();
		ls.add(3);
		ls.add(2);
		ls.add(1);
		ls.add(5);
		ls.add(4);
		
		//for-loop
		for(int i = 0; i<ls.size(); i++) {
			System.out.print(ls.get(i) +" ");
		}
		
		System.out.println();
		
		//for-each loop
		for(Integer w : ls) {
			System.out.print(w + " ");
		}
		
		System.out.println();
		
		//for-each loop kullanarak ls list'indeki tum elemanlarin toplamini bulunuz.
		int toplam = 0;
		
		for(Integer w : ls) {
			toplam = toplam + w;	
		}
		System.out.println(toplam);
		
		//Ilk 2 eleman haric diger elemanlari ekrana yazdiriniz
		for(Integer w : ls.subList(2, ls.size())) {
			System.out.print(w + " ");
		}
		
		System.out.println();
		
		//Index'i 1(dahil) olan eleman'dan index'i 3(dahil) olan elemana kadar tum elemanlari yazdiriniz
		for(Integer w : ls.subList(1, 4)) {
			System.out.print(w + " ");
		}
		
		System.out.println();
		
		//ls listindeki elemanlardan tek sayi olanlari yazdirmayin
		//1.Yol
		for(Integer w : ls) {
			if(w%2==0) {
				System.out.print(w + " ");
			}
		}
		
		System.out.println();
		
		//2.Yol
		for(Integer w : ls) {	
			if(w%2!=0) {
				continue;
			}
			System.out.print(w + " ");
		}
		
		System.out.println();
		
		//ls listindeki elemanlari 5 gorunceye kadar yazdirin, 5 yazilmasin
		for(Integer w : ls) {			
			if(w==5) {	
				break;	
			}			
			System.out.println(w + " ");
		}

		//Not: continue; belli sartlara gore bazi elemanlari islem disi tutmak icin kullanilir.
		//     break; ise belli sartlara gore loop'u kirmak icin kullanilir.
	}

}
