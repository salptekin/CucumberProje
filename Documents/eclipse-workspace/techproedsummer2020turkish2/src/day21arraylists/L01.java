package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class L01 {
	
	/*
	 1) Array'lerin uzunluklari en basta belirlenir ve bir daha degistirilemez.
	    List(ArrayList)'lerde ise list olustururken uzunluk belirlemeye gerek
	    yoktur cinku list'ler eleman eklendikce kendilerini buyuturler, eleman silindikce
	    kendilerini kuculturler.
	 2) List'ler cok kullanisli method'lara sahiptir. Bu yuzden array'lere tercih edilir. 
	 3) Array'ler primitive ve reference'lari eleman olarak kabul ederler. 
	    Ama List'ler sadece non-primitive'leri eleman olarak kabul eder. 
	*/

	public static void main(String[] args) {
		
		//List olusturma nasil yapilir?
		 //1. Yol:
		 ArrayList<String> sl1 = new ArrayList<String>();
		 
		 //2. Yol:
		 ArrayList<String> sl2 = new ArrayList<>();
		 
		 //3. Yol: Bunu kullaniniz
		 List<String> sl3 = new ArrayList<>();
		 System.out.println(sl3);//[]
		 
		 //List'e eleman ekleme nasil yapilir?
		 sl3.add("A");
		 System.out.println(sl3);//[A]
		 
		 sl3.add("B");//add() her zaman yeni elemani en saga ekler
		 System.out.println(sl3);//[A,B]
		 
		 sl3.add("C");
		 System.out.println(sl3);//[A, B, C]
		 
		 //Herhangi bir index'e eleman ekleme nasil yapilir?
		 sl3.add(1, "X");
		 System.out.println(sl3);//[A, X, B, C]
		 
		 sl3.add(0, "Mustafa");
		 System.out.println(sl3);//[Mustafa, A, X, B, C]
		 
		 //List'lerde eleman sayisini bulma nasil yapilir?
		 System.out.println(sl3.size());//5
		 
		 //Bir list'in bos olup olmadigin nasil anlariz?
		 System.out.println(sl3.isEmpty());//isEmpty() ==> bos ise true, dolu ise false verir
		 
		 //Bir list'den istenen elemani silme nasil yapilir?
		 
		 //1. Yol: index ile silme yapabilirsiniz.
		 System.out.println(sl3.remove(0));
		 System.out.println(sl3);//[A, X, B, C]
		 
		 //2. Yol: Eleman secip sil
		 sl3.remove("X");
		 System.out.println(sl3);//[A, B, C]
		 
		 sl3.add("B");//[A, B, C, B]
		 System.out.println(sl3.remove("B"));//true
		 //Ayni elemandan 1 den fazla varsa ilkini siler
		 System.out.println(sl3);//[A, C, B]
		 
		 
		 System.out.println(sl3.remove("W"));//false
		 //Java'dan olmayan bir elemani remove etmesini isterseniz
		 //remove edemez ve list'i aynen oldugu gibi birakir.
		 System.out.println(sl3);//[A, C, B]
		 
		 //remove(index) ne return eder?
		 // sl3 ==> [A, C, B]
		 System.out.println(sl3.remove(1));//C
		 System.out.println(sl3);//[A, B]
		 
		//remove(eleman) ne return eder?
		// sl3 ==> [A, B] 
		 System.out.println(sl3.remove("A"));//true

	}

}
