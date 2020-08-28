package day30exceptions;

public class E02 {
	
	/*
	 1)IllegalArgumentException bir Run Time Exception'dir istedigimiz sartlara uygun argument'ler kullanilmadigi zaman
	   bu exception devreye girer.
	   
	 2) throw ile throws farki nedir?  
	    a) throw method body'si icinde kullanilir. throws ise method parantezi ile curly brace arasinda kullanilir. 
	       '==> ) throws IOException {  <=='
	    b) throw method body'si icinde istedigimiz yerde istedigimiz kadar kullanabiliriz. throws ise sadece
	       method parantezi ile curly brace arasinda sadece bir kere kullanilabilir.
	    c) 1 throw sadece 1 tane exception üretir, 1 throws ile birden çok 
           exception üretebilirsiniz yani " ) throws NullPointerException, ArithmeticException { " mümkündur.
        d) throws'dan sonra sadece exception class'inin ismi yazilir  ==> throws IOException gibi
           throw'dan sonra ise 'new' ve constructor yazilir. ==> throw new IllegalArgumentException() gibi
      
	 */

	public static void main(String[] args) {
		
		countEgg(8);
		division(15, 3);

	}
	
	public static void countEgg(int numOfEgg){		
		try {
			if(numOfEgg<0) {		
				throw new IllegalArgumentException();	
			}else {		
				System.out.println(numOfEgg);		
			}
		}catch(IllegalArgumentException e) {
			System.out.println("Yumurta sayisi negatif olamaz");
		}	
	}
	
	public static void division(int a, int b) {
		try {
			if(b%2!=0) {
				throw new ArithmeticException();
			}else {
				System.out.println(a/b);
			}
		}catch(ArithmeticException e) {
			System.out.println("Tek sayilara bolme demedik mi?");
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
