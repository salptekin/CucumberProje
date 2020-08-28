package day11stringmethodsforloopdt;

public class ForLoop01 {

	public static void main(String[] args) {
		
		// Ekrana 10 defa "Java" yazdiralim
//		System.out.println("Java"); 
//		System.out.println("Java");
//		System.out.println("Java");
//		System.out.println("Java");
//		System.out.println("Java");
//		System.out.println("Java");
//		System.out.println("Java");
//		System.out.println("Java");
//		System.out.println("Java");
//		System.out.println("Java");
		
		//Yukaridaki isi for-loop kullanarak kisaca yapabiliriz
		
		//  Baslangic Condition  Artirma/Azaltma
		for(int i = 1;  i<=10  ;     i++        ) {
			System.out.println("Java");
		}
		
		//Ekrana 1 den 5 e kadar tamsayilari yazdiriniz
		for(int i = 1; i<=5; i++){
			System.out.println(i);
		}
		
		//Ekrana 4 den 1 e kadar tamsayilari yazdirin
		for(int i=4; i>=1; i--) {		
			System.out.println(i);		
		}
		
		//Ekrana ilk 3 cift sayma sayisini yazdiriniz (2, 4, 6) 		
		//1. Yol
		for(int i=2;   i<=6;    i=i+2) {		
			System.out.println(i);			
		}		
		//2. Yol
		for(int i=1; i<=6; i++){			
			if(i%2==0) {		
				System.out.println(i);				
			}		
		}
		
		//Ekrana ilk 100 cift sayma sayisini yazdiriniz
		//Loop'larin oncesinde bir variable olusturup onu loop'un icinde 
		//kullanirsaniz bu variable'lara "Flag" denir. Asagidaki soruda 
		//sayma variable'i bir flag'dir.
		int sayma = 1;		
		for(int i = 1; sayma<=100; i++) {			
			if(i%2==0) {				
				System.out.print(i + " ");				
				sayma++;				
			}			
		}

	}

}
