package day38collectionsmaps;

import java.util.HashMap;

public class HashMap01 {

	/*
	 1)Map'ler key-value yapisini kullanirlar. 
	 2)Key'ler tekrarli deger kabul etmez. (Unique olmalidirlar/Kimlik numaralari gibi)
	 3)Value'lar tekrarli olabilirler.(Isimler gibi)
	 4)Uc farkli Map vardir:
	   a)HashMap:En cok kullanilani, en hizlilaridir. 
	             Hizli olabilmek icin siralamayi rastgele yapar.
	             Hizli olabilmek icin synchronize olmazlar ve thread-safe degildirler.
	             Bir tane key null olabilir, birden fazla value null olabilir. 
	             
	   b)HashTable
	   c)TreeMap
	*/

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		
		hm1.put(101, "Ali Han");
		hm1.put(102, "Veli Can");
		hm1.put(103, "Ayse Tan");
		System.out.println(hm1); //{101=Ali Han, 102=Veli Can, 103=Ayse Tan}
		
		//Ayni key kullanildiginda ustune yazar.
		hm1.put(101, "Kemal Yildiz");
		System.out.println(hm1); //{101=Kemal Yildiz, 102=Veli Can, 103=Ayse Tan}
		
		//Ayni value'yu farkli key ile yolladiginizda map'e ekler
		hm1.put(104, "Veli Can");
		System.out.println(hm1); //{101=Kemal Yildiz, 102=Veli Can, 103=Ayse Tan, 104=Veli Can}
		
		hm1.put(null, "Ayse Ay");
		System.out.println(hm1); //{null=Ayse Ay, 101=Kemal Yildiz, 102=Veli Can, 103=Ayse Tan, 104=Veli Can}
		
		hm1.put(105, null);
		hm1.put(106, null);
		hm1.put(107, null);
		System.out.println(hm1); //{null=Ayse Ay, 101=Kemal Yildiz, 102=Veli Can, 103=Ayse Tan, 104=Veli Can, 105=null, 106=null, 107=null}
		
		System.out.println(hm1.get(102));//Veli Can
		
		System.out.println(hm1.values());//[Ayse Ay, Kemal Yildiz, Veli Can, Ayse Tan, Veli Can, null, null, null]
		
		System.out.println(hm1.keySet());//[null, 101, 102, 103, 104, 105, 106, 107]
		
		System.out.println(hm1.getOrDefault(101, "Uzgunum bu key icin bir deger yok"));//Kemal Yildiz
		
		System.out.println(hm1.getOrDefault(111, "Uzgunum bu key icin bir deger yok"));//Uzgunum bu key icin bir deger yok
		
		hm1.putIfAbsent(108, "Merve Tahsin");
		System.out.println(hm1);//{null=Ayse Ay, 101=Kemal Yildiz, 102=Veli Can, 103=Ayse Tan, 104=Veli Can, 105=null, 106=null, 107=null, 108=Merve Tahsin}

		//Burada Yildiz Yil'i 103 key'sine eklemez, cunku 103'de value var. putIfAbsent() methodu yoksa ekler.
		hm1.putIfAbsent(103, "Yildiz Yil");
		System.out.println(hm1);
		
		//Value null ise Java deger yokmus gibi davranir ve Yildiz Yil'i ekler.
		hm1.putIfAbsent(105, "Yildiz Yil");
		System.out.println(hm1);
		
		//Key kullanarak eleman silmek
		hm1.remove(106);
		System.out.println(hm1);
		
		//key ve value ortusurse siler.
		hm1.remove(103, "Veli Can");
		System.out.println(hm1);
		
		//Value update etmek icin kullanilir.
		hm1.replace(104, "Asiye Can");
		System.out.println(hm1);
		//Olmayan bir key ile replace methodunu kullanirsaniz map degismez.
		hm1.replace(112, "AAA BBBB");
		System.out.println(hm1);
		
		hm1.replace(104, "Asiye Can", "Ramazan Meydan");
		System.out.println(hm1);
		
		//Eleman sayisini verir
		System.out.println(hm1.size());
		
		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(201, "Cat");
		hm2.put(202, "Dog");
		
		//bir map'e baska bir map eklemek icin kullanilir.
		//putAll() methodu kullandiginizda iki map'deki key ve value'larin data type'lari
		//ortusmeli.
		hm1.putAll(hm2);
		System.out.println(hm1);

	}

}
