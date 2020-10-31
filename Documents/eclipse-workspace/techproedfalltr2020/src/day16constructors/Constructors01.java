package day16constructors;


public class Constructors01 {
	
	/*
	 1)Constructor'in ismi class'in ismi ile ayni olmalidir.
	 2)Constructor olustururken class ismi yazildiktan sonra () konulmalidir.
	 3)Class olusturuldugunda Java bu class'dan object olusturulacagini dusunerek "constructor" olusturur.
	   Bu constructor'a "default constructor" denir.
	 4)Siz kendiniz constructor urettiginizde, Java default constructor'i iptal eder. 
	 5)Constructor ureterek bir class'dan cok farkli object'ler uretebiliriz. 
	 6)Constructor'larda return type yoktur.Bu yuzden constructor'lar method degildirler. 
	   Constructor'lar constructor'dirlar.
	 7)Constructor'larda sadece class ismi isim olarak kullanilabilir, fakat methodlarda isim olarak hersey
	   kullanilabilir.  
	 */
	
	public Constructors01() {
		
	}
	

	public static void main(String[] args) {
		
	   //Class Ismi	   Object Ismi      new Keyword       Constructor
		Constructors01     obj1      =      new         Constructors01();  
		  
	}

}
