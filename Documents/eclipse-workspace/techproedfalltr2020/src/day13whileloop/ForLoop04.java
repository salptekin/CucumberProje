package day13whileloop;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		/*
		 Satir sayisini kullanicidan alarak asagidaki gibi sekil olusturunuz
		           * * * * *
		            * * * *
		             * * *
		              * *
		               *
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Satir sayisini giriniz");
		int s = scan.nextInt();
		
		for(int i=0; i<s; i++) {
			
			for(int m=0; m<i; m++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<2*(s-i); k++) {
				System.out.print("*");
			}

			System.out.println();
	
		}
		
		scan.close();

	}

}
