package day20arraysdt;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethodSplit {

	public static void main(String[] args) {
		// How to split a String by using character/characters
		String s = "I like to move it move it";
		String t[] = s.split("move");
		//If you use "move" to split, "move" will be disappear from the String
		//Be careful about the spaces when you split
		System.out.println(Arrays.toString(t));//[I like to , it , it] 
		
		//How to count the number of words in a String
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String w = scan.nextLine();
		
		String y[] = w.split(" ");
		System.out.println(Arrays.toString(y));
		System.out.println(y.length);
		
		scan.close();

	}

}
