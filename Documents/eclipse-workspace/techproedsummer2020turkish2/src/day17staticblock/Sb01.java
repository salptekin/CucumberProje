package day17staticblock;

public class Sb01 {
	/*
	 Farzedin ki bu class dairenin cevre ve alanini hesaplayacak.
	         Alan = pi * r * r      Cevre = 2 * pi * r
	 Bu class'da pi sayisi her zaman kullanilacaktir. pi sayisina class uretirken 
     deger atamasini yapmak faydalidir. Eger class uretilirken bazi variable'lara
     deger atamasi yapilmasini isterseniz static block kullanmalisiniz.
	*/
	
	/*
	 static block icinde kullanilan hersey static olmalidir.
	 Bu yuzden asagidaki ornekte "pi" variable'ini static yapmak zorundayiz.
	*/
	
	/*
	 static block main method'dan, diger butun methodlardan, 
	 butun constructor'lardan once calisir.
	 
	 static block class olusturulurken calisir.
	*/
	
	static double pi;
	
	Sb01(){
		System.out.println("Constructor");
	}
	
	static {
		pi = 3.14;
		System.out.println("Static block Ali");
	}

	public static void main(String[] args) {
		
		 Sb01 obj1 = new Sb01();
		
         System.out.println("Main method");
         
         Sb01 obj2 = new Sb01();
	}
	
	static {
		pi = 3.14;
		System.out.println("Static block Veli");
	}

}
