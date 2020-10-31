package day33abstractclass;

public abstract class Honda {
	/*
	 1)Bazen child class'lar parent class'daki methodlarin body'lerini
	   hepdegistirerek kullanirlar. Bu tip durumlarda parent class'daki
	   methoda body koymak manasiz olur cunku parent class'daki method
	   body hic kullanilmaz.Bu manasizligi gidermek icin Java bize 
	   body'siz method uretme imkani verir. Body'siz methodlara
	   abstarcta method denir.
	 2)Parent class'daki body'siz methodlari(abstract method)  
	   child class'lar override etmek zorundadirlar. 
	   Biz bir application olustururken child class'lari parent class'daki bazi methodlari override
	   etmek zorunda birakmak istersek o methodlari abstract method yapariz. 
	 3)abstract method olusturmak icin a)"{}" kismini yazmayin b)access modifier'dan sonra "abstract"
	                                                             keywordunu kullanin 
	 4)abstract method'lar sadece abstract class'lar icinde olusturulabilir.
	 5)abstract class olusturmak icin access modifier'dan sonra "abstract" keyword'unu kullanin 
	 6)"abstract" keyword'u ile method body birarada kullanilamaz. 
	 7)abstract class icinde hem abstract hem de abstract olmayan(concrete) methodlar kullanilabilir.
	 8)Bir concrete class abstract class'a extend ettiginde, abstract class icindeki tum abstract
	   methodlari override etmek zorundadir. Aksi takdirde Java Compile Time Error verir.Fakat concrete
	   methodlari override etmek zorunda degildir. Concrete methodlarin override edilmesi istege baglidir. 
	 9)Bir abstract class baska bir abstract class'a extend ettiginde herhangi bir methodu override
	   etmek zorunda degildir. Isterse override eder istemezse etmez.   
	 10)final class'larin child class'i olamaz. abstract class'lar child class'lara talimat vermek
	    icin olusturulurlar. Eger bir class'i final yaparsaniz o class'in cchild class'i olamayacagindan 
	    abstract olmasi mantikli degildir.Bu yuzden Java abstract class'larin final olmasina musaade etmez. 
	 11)abstract method uretmemizin sebebi child class'larin kullanabilmesidir.Eger methodu "final" yaparsak
	    bu o method override edilemez demektir yani; child class'lar kullanamaz demektir. Bu celiskiden dolayi
	    Java abstract methodlarin "final" olmasina musaade etmez. 
	 12)Abstract method'lar "private" olamazlar cunku abstract method'lar baska class'lar tarafindan 
	    kullanilmak icin uretilir. Halbuki "private" methodlar baska class'lar tarafindan kullanilamazlar. 
	 13)Abstract method'lar static olamazlar. Cunku static methodlar override edilemezler halbuki biz 
	   abstract methodlari override etmek icin uretiriz.
	   
	      !!! ABSTRACT CLASSLARDAN OBJECT URETILEMEZ...
	                                                                  
	*/
	
	public abstract void motor();
	
	public void deri() {
		System.out.println("Koltuklar deri olsun");
	}
	
}
