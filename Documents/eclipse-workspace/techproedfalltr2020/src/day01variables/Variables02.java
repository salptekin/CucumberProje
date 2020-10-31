package day01variables;

public class Variables02 {

	public static void main(String[] args) {
		
		//Variable olusturmak
		//1)Data Type yaz 	2)Variable Ismi yaz 	3)"=" koy 	4)Variable'a bir deger atamasi yapin	5)";" koyun
		
		//1.Yol: Makbul(Recommended)
		int age = 23; //age=yas
		int salary = 5000; //salary = maas
		System.out.println(age);//23
		System.out.println(salary);//5000
		
		//2.Yol:
		int length;//Variable olusturuldu ==> Declaration
		length = 12;//Variable'a deger atamasi yapildi ==> Assignment
		System.out.println(length);
		
		//3.Yol:
		//int width = 22;
		//int height = 32;
		//int money = 42;
		int width = 22, height = 32, money = 42;
		System.out.println(width + height + money);//96
		
		//Bir class'da ayni isimle sadece bir tane variable olusturulabilir.
		
		/*
		 Java'da temelde 2 farkli data type vardir
		 1)Primitive(Ilkel) Data Type: Sekiz tanedir
		 
		   a)boolean:true(dogru) veya false(yanlis) durumlarinda kullanilir.
		             boolean'lar sadece 2 farkli deger alabildigi icin memory'de az yer kaplar.
		             bir boolean variable memory'de 1 bit'lik yer kaplar.
		   b)char: 1 character'li ifadeler icin char data type kullanilir. S, ?, 3, * ==> char olabilir
		           Bir char memory'de 16 bit yer kaplar.
		           char data type'inde variable olustururken deger mutlaka tek tirnak icine konulmalidir.
		           char'larla matematiksel islemler yaparsaniz char'larin ASCII Table'daki degerlerini kullanir.
		   c)byte: -128'den 127'e kadar tum tam sayilari icerir.
		           byte'lar memory'de 8 bit'lik yer kaplar
		   d)short:-32768'den 32767'e kadar tum tamsayilari icerir.
		           short'lar memory'de 16 bit yer kaplar.
		   e)int: -2,147,483,648'den 2,147,483,647'e kadar tum tamsayilari icerir.
		          int'ler memory'de 32 bit yer kaplar
		   f)long: -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'e kadar tum tamsayi degerlerini alir.
		           long memory'de 64 bit yer kaplar. 
		   g)float:Ondalikli sayilar icin kullanilan data type'laridir.
		           float memory'de 32 bit kullanir.
		           float'lar ondalik kisimlarinda en fazla 7 rakam barindirirlar.
		           0.1234567
		           Bir ondalikli sayinin float oldugunu belirlemek icin en sona 'f' veya 'F' yazmak gerekir.
		           2.23f veya 2.23F yazmaliyiz. Sonuna 'f' veya 'F' konulmayan ondalik sayilari Java otomatik olarak
		           double kabul eder.
		   h)double:Ondalikli sayilar icin kullanilan data type'laridir.
		            double memory'de 64 bit kullanir.
		            double'lar ondalik kisimlarinda en fazla 16 rakam barindirirlar
		            0.1234567890123456
		 
		 2)Non-Primitive Data Type: 
		      String:Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusur.
		 */
		
		//bit: Memory'nin en kucuk yapi tasina bit denir.
		//byte:8 bit bir byte olarak adlandirilir
		
		boolean emekli = false;
		boolean engelli = true;
		System.out.println(emekli);//false
		System.out.println(engelli);//true
		
		char initial = 'S';
		char ch1 = '?';
		char ch2 = 'a';
		char ch3 = ' ';//space bir character'dir ve char olarak kullanilabilir.
		//char ch4 = ''; ==> char olustururken tek tirnak arasinda mutlaka 1 character olmalidir. 
		//Sifir character veya 1 den fazla character kabul edilmez
		char ch5 = 'A';
		
		System.out.println(initial);//S
		System.out.println(ch1 + ch2);//63 + 97 = 160
		System.out.println(ch5 > ch2);//Karsilastirma islemlerinin sonucu ya true ya da false olur; yani boolean olur
		                              //Buyuk harflerin ASCII degerleri kucuk harflerden kucuktur.
		//Herhangi bir char'in ASCII degerini kod yazarak bulmak
		System.out.println(ch3 + 0);
		
		byte b1 = 12;
		byte b2 = -125;
		System.out.println(b1 * b2);//-1500
		
		float f1 = 2.23f;
		float f2 = 0.1234F;
		
		double d1 = 2.23;
		
		//Primitive data type'larinin buyukten kucuge siralayalim
		//byte < short < int < long < float < double
		
		String str1 = "";
		String str2 = "A";
		String str3 = "Ali Can okula gitti. Eve daha gelmedi.";
		
		/*
		 Primitive Data Type ile Non-Primitive Data Type arasindaki farklar nelerdir?
		 1)primitive data type isimlerinde tum harfler kucuk harf olmalidir, non-primitive data type'lerinde
		   ilk harf buyuk yazilmalidir.
		 2)primitive data type'lerini Java olusturmustur, biz primitive data type olusturamayiz. Ama, non-primitive
		   data type'leri Java programcilari tarafindan istenildigi kadar olusturulabilir.
		 3)Primitive Data Type'larin memory'de kapladigi yer data type'ina gore degisir.Ama non-primitive data 
		   type'larinin memory'de kapladigi yer her zaman aynidir type'a gore degismez. 
		 4)Primitive Data Type'larinin memory'de ayirdigi alanda sadece o primitive data'nin degeri vardir. 
		   Ama, non-primitive'lerin memory'de ayirdigi alanda o non-primitive data'nin degeri yaninda
		   kullanima hazir cok faydali onlarca method vardir.    

		 */

	}

}
