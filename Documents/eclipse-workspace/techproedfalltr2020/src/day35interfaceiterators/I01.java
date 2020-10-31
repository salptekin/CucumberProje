package day35interfaceiterators;

public interface I01 {

	/*
	 Method olustururken "default" veya "static" keyword'lerini kullanarak
	 isterseniz interface icinde "concrete method" olusturabilirsiniz.
	*/
	
	/*
	 Onemli Not: Interface icinde concrete method olusturmak icin kullanilan "default"
	 keyword'u access modifier degildir. Asagidaki methodda gordugunuz gibi access modifier
	 public'dir.
	 
	 Not: Interface'lerde "default" keyword'unu kullanarak olusturulan method'lara "default method" denir. 
	*/
	
	/*
	 Asagida gordugunuz gibi interface icinde concrete method olusturmanin iki yolu var;
	 
	 1)"default" keyword'unu kullanmak ==> Baska class'lardan bu methoda ulasmak icin
	                                       object olusturmalisiniz
	 2)"static" keyword'unu kullanmak ==> Baska class'lardan bu methoda ulasmak icin 
	                                      object olusturmaniza gerek yok sadece interface ismi ile
	                                      methoda ulasabilirsiniz.
	 */
	public default int add() {
		return 2;
	}
	
	public static int multiply() {
		return 12;
	}
}
