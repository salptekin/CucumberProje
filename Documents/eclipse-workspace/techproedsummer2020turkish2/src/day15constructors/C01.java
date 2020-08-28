package day15constructors;

public class C01 {
	
	/*
	 1) Constructor'lar main method'un disinda, class'in icinde olusturulur
	 2) Constructor'in ismi class ismi ile ayni olmalidir 
	 3) Method ile Constructor Farki: a) Method ismi class isminden farkli olabilir
	                                     fakat Constructor ismi class ismi ile ayni olmalidir.
	                                  b) Method'larda return type olmak zorundadir ama
	                                     Constructor'larda return type olmaz. Constructor'a return 
	                                     type eklerseniz artik o constructor degil method'dur. 
	 4) Bir class'da birden fazla constructor olabilir. Ama constructor'larin parametreleri farkli olmalidir.
	    Yani; farkli constructor uretmek icin overloading kurallarini kullanmaliyiz.                                     
	 */
	
	C01(){
      System.out.println("Parametresiz constructor");
	}
	
	C01(int i){
	      System.out.println("Integer parametreli constructor");
	}
	
	C01(String s){
	      System.out.println("String parametreli constructor");
	}
	
	C01(String s, int i){
	      System.out.println("Iki parametreli constructor");
	}
	
	public static void main(String[] args) {
		//Class ismi   Object'e bir isim verin         new keyword kullanin       Constructor
		      C01                obj1               =          new                    C01();
		      C01                obj2               =          new                    C01("Ali");
		      C01                obj3               =          new                    C01(11);
		      C01                obj4               =          new                    C01("", 12);
	}
	
	void toplama() {
		System.out.println("Toplama");
	}

}
