package day32interface;

public interface Car {

	/*
	 1)Interface bir class degildir, interface interface'dir.
	 2)Abstract class'larin icine concrete method'lar koyabilirdik ama interface'lerin icine 
	  (bazi ozel durumlar haric) concrete method koyamayiz. Yani; interface'ler sadece abstract method icerebilir.
	  Bu yuzden interface kullanimi "full abstraction" olarak adlandirilir. Abstract class kulanimina 
	  "partial abstraction" denir.
	 3)interface'ler iclerindeki method'lari default olarak "abstract" kabul ederler. Bu yuzden method olustururken 
	   abstract keyword kullanmak istege baglidir.Asagidaki motor() methodunda abstract keyword kullanmadik problem olmadi
	   direksiyon() methodunda abstract keyword kullandik yine problem olmadi.
	 4)interface icine concrete method koyarsaniz Compile Time Error verir.  
	 5)interface'lerdeki method'larin access modifierlari default olarak "public" olur, 
	   protected, private ve default olamaz.
	   
	 6)interface'lerde variable'lar default olarak "final" olurlar. 
	 7)interface'lerde variable'larin access modifier'lari default olarak "public" olur.
	 8)interface'lerde variable'lar default olarak "static" olurlar.
	 9)interface'lerde variable olusturdugunuzda mutlaka deger atamasi(initialize) yapmalisiniz.
	 10)interface'lerden obje uretilemez.
	 */
	
	//int i = 12; == public final static int i= 12;
	int i = 12;

	
	public void motor();
	
	public abstract void direksiyon();
	
	//teker() hem public'dir hem de abstract'tir.
	//void teker(); = public void teker(); == abstract void teker(); == public abstract void teker();
	void teker();
	
	void fiyat();
	
}
