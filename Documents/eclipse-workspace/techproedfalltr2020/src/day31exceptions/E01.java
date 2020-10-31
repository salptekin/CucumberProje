package day31exceptions;

public class E01 {

	/*
	 1)ArithmeticException class'i Java'da matematiksel islemler yapilirken olusabilecek hatalarda kullanilir.
	   Mesela; 12 yi 0'a bolersek Java Exception throw eder. Bu Exception ArithmeticException kullanilarak
	   halledilebilir(Handle). Run Time Exception'dir.
	   
	 Note: Java'da iki tip Exception vardir; birisi siz code yazarken kirmizi alt cizgi(CTE) verir, digeri
	       kirmizi alt cizgi vermez.
	       Compile Time Error veren Exception'lara "Compile Time Exception" veya "Checked Exception" denir.
	       Compile Time Error vermeyen Exception'lara "Run Time Exception" veya "Un-checked Exception" denir. 
	       
	 Note: "Compile Time Exception" larda ya "throws" veya "try-catch" kullanmalisiniz aksi takdirde
	       code calismaz. Ama "Run Time Exception" larda isterseniz "throws", isterseniz "try-catch", isterseniz
	       hic birsey kullanmayabilirsiniz. 
	      
	  *** Yani; "Compile Time Exception" lar "handle" edilmelidirler ama "Run Time Exception" lar handle edilmese de olur.
	  
	  2)NullPointerException class'i ornegin; null atamasi yapilan bir String'de length() methodu kullanildiginda olusur. 
	    Run Time Exception'dir. 
	    
	  3)ArrayIndexOutOfBoundsException class'i array'lerde olmayan bir index ile islem yapmaya calisirsak devreye girer. 
	    Run Time Exception'dir.
	  
	  4)NumberFormatException class'i sayi formatinda olmayan bir String'i parseInt() methodu kullanarak integer'a
	    cevirmek istedigimizde devreye girer.Run Time Exception'dir.      
	        
	  5)ClassCastException class'i birbirine donusturulemeyen data type'lar birbirine donusturulmek istenirse devreye girer.
	    Ornegin; Object data type'i String data type'ina donusturulemez. Java ya illa donustur diye israr edersek
	    ClassCastException aliriz.Run Time Exception'dir.  
	    
	  6)IllegalArgumentException class'i kullanilmasini istemedigimiz degerlerde programimizin hata vermesini istiyorsak
	    devreye girer. Mesela; yas icin negatif sayilarin kullanilmasi dogru degildir. Kullanici yas icin negatif sayi 
	    kullandiginda program hata vermelidir. Bunu "throw new IllegalArgumentException()" kodunu yazarak temin edebiliriz.
	    Run Time Exception'dir.
	    
	  Soru: "throw" ile "throws" arasindaki farklar nelerdir?
	        1)"throws" method parantezinin kapanis parantezi ile method body'nin acilis parantezi arasinda kullanilir. 
	          "throw" method body;nin icinde kullanilir. 
	        2)"throws" keywordunden sonra 1'den fazla Exception yazilabilir. Fakat "throw" keywordunden sonra sadece 1 tane 
	          Exception yazilabilir.
	        3)"throws" keywordunden sonra sadece Exception class'inin ismini yazariz fakat "throw" keywordunden sonra
	          Exception class'indan object olustururuz. 
	        4)"throws" keywordu methodun ilk satirinda sadece 1 kere kullanilabilir ama "throw" keywordu method body'si
	          icinde nerede Exception atmak istersek orada istedigimiz kadar kullanabiliriz. 
	          	            
	  Note: catch block'lardan "finally block" kullanilabilir. finally block'in ozelligi Exception olussa da 
	        olusmasa da calismasidir. 
	        finally block cloud'da yapilan islemlerden sonra cloud ile connection'i kesmek icin kullanilir.
	        Cloud ile connection yazdigimiz code basarili bir sekilde calisirsa isimiz bittigi icin kesilmelidir, 
	        yazdigimiz code Exception atarsa cloud ile connection yine kesilmeli ve code tamir edilmelidir. cloud ile 
	        connection kesilmezse fatura pahali olabilir.
	 */
}
