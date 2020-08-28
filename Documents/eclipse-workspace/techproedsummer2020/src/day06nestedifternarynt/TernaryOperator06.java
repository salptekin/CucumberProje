package day06nestedifternarynt;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer. If the number has 3 digits, output will be  
         “This number has 3 digits.” 
         Otherwise, output will be “This number has no 3 digits”
                 How can you decide the number of digits of an integer?
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		String str = scan.next();
		
		String result = str.length()==3 ? "This number has 3 digits" : "This number has no 3 digits";
		System.out.println(result);
		
		scan.close();		
	}

}
