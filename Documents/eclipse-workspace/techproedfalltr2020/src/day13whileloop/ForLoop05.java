package day13whileloop;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir String aliniz ve o String'in tersini(Reverse String) ekrana yazdiriniz
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir String giriniz");
		String s = scan.nextLine();
		
		
		
		for(int i=s.length()-1; i>=0; i--) {
			
			
			System.out.print(s.charAt(i));
			
			
		}
		

		scan.close();
	}

}
