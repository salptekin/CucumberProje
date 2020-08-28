package day32interface;

public interface Klima {
	
	int i = 15;
	
	void isitma();
	
	void antiBakteri();
	
	void fiyat();
	
	/* 1)interface icinde body'si olan bir method uretmek isterseniz 
	   ya "default" veya "static" keyword'lerden birini kullanmaniz gerekir
	   2) "default" veya "static" keyword'lerden birini kullanirsaniz mutlaka
	   method body'si kullanmaniz gerekir aksi takdirde Compile Time Error
	   alirsiniz. public default void m1(); ==> olmaz
	              public static void m2(); ==> olmaz
	   3) "default" veya "static" keyword'lerden birini kullanarak olusturdugunuz
	      body'li methodlari child classlarin override etme zorunlulugu yoktur.           
	*/
	
	public default void sogutma(){
		System.out.println("Iyi sogutur");
	}
	
	public static void fresh(){
		System.out.println("Iyi sogutur");
	}

}
