package day32exceptions;

public class E01 {
	/*
	 1)Garbage Collector surekli memory'i kontrol eder. Silinmesi gereken herhangi bir data varsa
	   memory'i temiz tutmak icin o data'yi siler. Ama data'yi silmeden once "finalize" eder.
	   finalize etmek icin finalize() method'unu kullanir. Bu method'un ne zaman calisacagina Java karar verir.
	   Siz kod yazarken isterseniz finalize() methodunu cagirabilirsiniz ama siz cagirsaniz da 
	   ne zaman calisacagina Java karar verir.
	 2) "final", "finally" ve "finalize" aciklar misiniz? 
	   final(keyword): ==> final method override edilemez
	                   ==> final variable degeri degistirilemez
	                   ==> final class child class sahibi olamaz.
	   finally(code block): ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.
	   finalize(method):    ==> Garbage Collector bir data'yi imha etmeden once calistirir.          
	 */

	public static void main(String[] args) {
		

	}

}
