package day06ifstatement;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf" yazdirin
		 Bu character kucuk harf ise "Kucuk Harf" yazdirin
		 Bu character harf degil ise "Harf Degil" yazdirin
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir character giriniz");
		char ch = scan.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			System.out.println("Buyuk Harf");
		}
		if(ch>='a' && ch<='z') {
			System.out.println("Kucuk Harf");
		}
		if(!(ch>='A' && ch<='Z') && !(ch>='a' && ch<='z')) {
			System.out.println("Harf degil");
		}
		
		scan.close();
		
		/*
			 Logical Operator (Mantik Islemleri)
			 
			 1) And Islemi: Sembolu & veya && dir. && sembolu daha hizli calisir. Bu yuzden genellikle && kullaniriz
			                true && true = true
			                true && false = false
			                false && true = false
			                false && false = false
			 2) Or Islemi: Sembolu || dur.
			                true || false = true  
			                false || true = true
			                true || true = true 
			                false || false = false      
			 3) Not Islemi: Sembolu ! dur. ! ==> Exclamation Mark
			                !true = false   
			                !false = true                   
		 */

	}

}
