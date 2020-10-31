package day03operations;

public class Comparators {

	public static void main(String[] args) {
		//Comparator: Karsilastirma islemleri. 
		//Java'da iki variable'in degeri karsilastirildiginda Java sonuc olarak boolean return eder.
		//Yani; karsilatirma yaptiginizda Java size ya true veya false der.
		System.out.println(5 > 3);//true
		System.out.println(5 < 3);//false
		//Matematikte esittir demek icin bir tane "=" yeter ama Java'da esittir demek icin "==" yazmak gerekir.
		System.out.println(5 == 3);//false
		System.out.println(5 <= 5);//true
		System.out.println(5 >= 3);//true
		System.out.println(5 != 3);//true
		
	}

}
