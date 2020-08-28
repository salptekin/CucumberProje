package day18arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {
		
		//Length'i ayni olan iki array olusturunuz bu array'lerin tum elemanlari ayni ise 
		//ekrana "Ayni" yazdirin farkli ise ekrana "Farkli" yazdirin. (loop kullanin)
		char ch1[] = {'a', 'd', 'c', 'k'};
		char ch2[] = {'a', 'd', 'k', 'c'};
		
		//1.Yol
		int z = 0;

		for(int i=0; i<ch1.length; i++) {			
			if(ch1[i] == ch2[i]) {
				z++;
			}	
		}		
		if(z==ch1.length) {
			System.out.println("Ayni");
		}else {
			System.out.println("Ayni degil");
		}
		
		//2. Yol
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Ayni");
		}else {
			System.out.println("Ayni Degil");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
