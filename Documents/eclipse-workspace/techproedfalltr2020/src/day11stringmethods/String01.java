package day11stringmethods;

public class String01 {

	public static void main(String[] args) {
		
		//15.substring()
		String s1 = "Java OOP language oldugu icin populerdir.";
		
		System.out.println(s1.substring(3));// a OOP languagedir
		System.out.println(s1.substring(5));//OOP languagedir
		System.out.println(s1.substring(0));//Java OOP languagedir
		//Son harfi ekrana yazdirin
		System.out.println(s1.substring(s1.length()-1));
		//substring(9, 17) ifadesinde index 9 dahil, index 17 haric'tir.
		System.out.println(s1.substring(9, 17));//language
		//substring(0, 1) String'deki ilk harfi verir, charAt(0) gibi
		//substring(0, 1) String return eder, charAt(0) char return eder.
		System.out.println(s1.substring(0, 1));//J
		System.out.println(s1.substring(5, 5));// Index'ler esit ise hicbirsey alirsiniz
		//substring() methodunda baslangic index'i bitis index'inden buyuk olamaz. Buyuk olursa
		//Run Time Error alirsiniz.
		//s1.substring(5, 1);
		
		//16.trim()
		String s2 = "     Java ogrenen diger dilleri cabucak ogrenir         ";
		//trim() methodu bir String'in bas ve sonundaki space'leri siler. 
		//Stringin icindeki space'leri silmez.
		System.out.println("Trim kullanmadan once: " + s2);
		System.out.println("Trim kullandiktan sonra: " + s2.trim());

	}

}
