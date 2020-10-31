package day12forloop;

public class ForLoop04 {

	public static void main(String[] args) {
		/*
		 5'den 12'e kadar tum tamsayilarin toplamini hesaplayip ekrana yazdiran programi yaziniz.
		*/
		
		int toplam = 0;

		for(int i=4; i<=14; i++) {	
			toplam = toplam + i;
		}
		System.out.println("Toplam: " + toplam);
	}
}
