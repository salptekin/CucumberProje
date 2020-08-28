package day15arraysnt;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 Take a String from user
		 Print it in reverse
		 For example; Germany  ==>  ynamreG
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
				
		for(int i = str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
		
		scan.close();
	}
}
