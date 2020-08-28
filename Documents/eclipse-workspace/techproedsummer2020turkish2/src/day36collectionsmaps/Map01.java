package day36collectionsmaps;

import java.util.HashMap;

public class Map01 {

	public static void main(String[] args) {
		
		/*
		 1)HashMap'ler rastgele siralama yapar
		 2)Map'lerde "key" degerleri "unique" olmak zorundadir, "value" kismi tekrarli olabilir.
		 */
		
		HashMap<Integer, String> hm01 = new HashMap<>();
		hm01.put(100, "Ali");
		hm01.put(101, "Emine");
		hm01.put(102, "Veli");
		hm01.put(103, "Ayse");
		
		//Ayni key degeri ile ikinci defa "put()" kullanirsaniz ustune yazar
		hm01.put(102, "XXXX");
		
		//Ayni value ama key farkli ise ekleme yapar, ayni value tekrarli olarak kullanilabilir
		hm01.put(104,"XXXX");
		
		//"key" null kabul eder mi? Cevap: Kabul eder ama sadece 1 tane null kabul eder, Ikinci defa null 
		//"key" kullanirsaniz ustune yazar
		hm01.put(null, "YYYY");
		hm01.put(null, "ZZZZ");
		
		//HashMap value olarak "null" kabul eder mi? Cevap: HashMap value olarak 1'den fazla "null" kabul eder.
		hm01.put(105, null);
		hm01.put(106, null);
		hm01.put(107, null);
		
		System.out.println(hm01.containsKey(102));//true
		System.out.println(hm01.containsKey(12));//false
		
		System.out.println(hm01.containsValue("Ayse"));//true
		System.out.println(hm01.containsValue("Ramazan"));//false
		
		//Map'lerde herhangi bir elemanin "value" sunu almak icin "get()" methodu "key" parametresi ile kullanilir.
		System.out.println(hm01.get(101));//Emine
		
		//"key" varsa o "key"e ait value'yu return eder, "key" yok ise ikinci parametrede
		//ne yaziyorsa ("Oyle bir isim yok") onu return eder
		System.out.println(hm01.getOrDefault(11, "Oyle bir isim yok"));//Emine
		
		//Tum "key" leri bir arada gormek isterseniz keySet() methodunu kullanin
		System.out.println(hm01.keySet());//[null, 100, 101, 102, 103, 104, 105, 106, 107] ==> Collection'lardaki "Set" tipi
		
		//Tum "value" lari bir arada gormek isterseniz values() methodunu kullanin
		System.out.println(hm01.values());//[ZZZZ, Ali, Emine, XXXX, Ayse, XXXX, null, null, null]
		
		//putIfAbsent(108, "Kemal") methodu map'e bakar; map'de key olarak 108 yoksa "Kemal" i ekler
		//108 varsa "Kemal" i eklemez
		System.out.println(hm01.putIfAbsent(108, "Kemal"));
		System.out.println(hm01);
		
		System.out.println(hm01.putIfAbsent(108, "Muharrem"));
		System.out.println(hm01);
		
		//Asagidaki kod "key"si 'null' olan elemani siler
		hm01.remove(null);
		System.out.println(hm01);
		
		//Iki sarta gore silme yapar, key 103 ve value Ayse ise siler
		hm01.remove(103, "Ayse");
		System.out.println(hm01);
		
		//102'de value Vahid ise siler, degilse silmez, error falan da vermez
		hm01.remove(102, "Vahid");
		System.out.println(hm01);
		
		//replace(102, "Mustafa") ile put(102, "Mustafa") ayni seyi yapar
		hm01.replace(102, "Mustafa");
		System.out.println(hm01);
		
		hm01.replace(105, null, "Jackson");
		System.out.println(hm01);
		
		System.out.println(hm01.size());//8
	}
}
