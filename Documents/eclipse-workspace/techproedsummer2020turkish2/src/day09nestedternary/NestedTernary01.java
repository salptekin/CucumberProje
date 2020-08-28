package day09nestedternary;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 Sayi pozitif ise 9 dan buyuk mu diye kontrol edin
		 9 dan buyuk ise "Sayi" degilse "Rakam" yazdirin
		 Sayi pozitif degilse 0 mi diye kontrol edin
		 0 ise "Rakam" degilse "Negatif sayi" yazdirin
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int s = scan.nextInt();
		
        String result = s>0 ? s>9 ? "Sayi" : "Rakam" : 
        	            s==0 ? "Rakam" : "Negatif sayi";

        System.out.println(result);
        
        scan.close();

	}

}
