package day03scannerincrementdt;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		//How to get String from user
		
		//1. Step
		//Instead of "red underline" tell "Java/it is complaining" or
		//"Compile Time Error"
		Scanner scan = new Scanner(System.in);
		//2. Step
		System.out.println("Please, give me your full name");
		//3. Step
		//If you use next(), Java will return just the first word in the String
		//If you use nextLine(), Java will return all String
		String fullName = scan.nextLine();
		System.out.println(fullName);
		scan.close();
	}
}
