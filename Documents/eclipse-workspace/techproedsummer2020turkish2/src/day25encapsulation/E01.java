package day25encapsulation;

public class E01 {
	
	/*
	 1)Encapsulation "data saklamak(hiding)" demektir.
	 2)Encapsulation yapmak icin variable'lari "private" yapariz.
	 3)Encapsulation yaptiginiz variable'i a)Okumak b)Degistirmek icin acabilirsiniz.
	 */

	private int sifre = 123456;
	private String isim = "Ali Can";
	private char ch = 'A';

	public static void main(String[] args) {
		
	}	
	//Encapsulation yaptiginiz variable'in baska class'lardan okunabilmesini isterseniz 
	//getter method olusturmaniz gerekir.	
	/*
	 Getter Method olusturmak icin
	 1)Access Modifier public olsun
	 2)Return Type variable'in return type'i ile ayni olsun
	 3)Isim get + variable ismi seklinde olsun
	 4)Method'un icinde "return variable ismi" yazilsin
	*/
	   public int getSifre() {
		  return sifre;
	   }
	   
	   public String getIsim() {
		   return isim;
	   }
	   
	 /*
	  1)Varaiable olusturup encapsulation yapiniz
	  2)Bu variable'in diger class'lardan okunabilmesi icin gerekenleri yapiniz
	  3)Bu variable'i diger class'lardan okuyunuz.  
	  */
	   
	  public char getCh() {
		  return ch;
	  }
	  
	  /*
	   1)Access modifier'i public yapiniz.
	   2)Return type'i her zaman void yapiniz
	   3)Method ismi "set + variable ismi" seklinde yaziniz
	   4)Method parantezi icine variable'i return type'i ile beraber yaziniz
	   5)Method body'si icine "this.ch = ch" gibi yaziniz. (Variable ismi ch ise...)
	   */
	  public void setSifre(int sifre) { 
		  this.sifre = sifre;	  
	  }
	  
	  public void setCh(char ch) {
		  this.ch = ch;
	  }
	  
	  public void setIsim(String isim) {
		  this.isim = isim;
	  }

}
