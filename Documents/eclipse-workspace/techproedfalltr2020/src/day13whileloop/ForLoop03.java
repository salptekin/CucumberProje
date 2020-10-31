package day13whileloop;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		 For loop kullanarak asagida verilen sekli olusturunuz, satir sayisini kullanicidan aliniz.
		 			 *
		 			* *
		 		   * * *
		 		  * * * *
		 		 * * * * *
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Olusturulacak ucgenin satir sayisini giriniz");
		int s = scan.nextInt();
		
		for(int i=1; i<=s; i++) {//==> Satirlar icin loop
			
			//Space'ler icin loop
			for(int k=s-1; k>=i; k--) {
				System.out.print(" ");
			}
			//*'ler icin loop
			for(int m=1; m<=i; m++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		scan.close();

	}

}
