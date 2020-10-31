package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		// split() methodu
		
		String s = "Calis bakalim zor mu?";
		
		String words1[] = s.split(" ");
		System.out.println(Arrays.toString(words1));//[[Calis, bakalim, zor, mu?]
		System.out.println("Kelime sayisi: " + words1.length);
		
		//"s" String'inde kac character kullanilmistir, split() kullanarak yapiniz.
		String words2[] = s.split("");
		System.out.println(Arrays.toString(words2));
		System.out.println("Character Sayısı: " + words2.length);
		
		//"s" String'inde bosluk haric kac character kullanilmistir, split() kullanarak yapiniz.
		String words3[] = s.replace(" ", "").split("");
		System.out.println(Arrays.toString(words3));
		System.out.println("Bosluk haric character Sayısı: " + words3.length);
		
		//"s" String'inde kac tane "a" characteri var?
		String words4[] = s.split("");
		
		int counter = 0;
		
		for(int i=0; i<words4.length; i++) {
			
			if(words4[i].equals("a")) {				
				counter++;		
			}
			
		}
		System.out.println("Sorulan character'in sayisi: " + counter);
		
		//Bir String'de kullanilan tum harflerin sayisini gosteren kodu yaziniz.
		//Ornegin; Alaaddin ==> A=1, l=1, a=3, d=2, i=1, n=1

	}

}
