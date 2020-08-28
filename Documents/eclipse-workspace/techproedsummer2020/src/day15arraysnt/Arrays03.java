package day15arraysnt;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays03 {

	public static void main(String[] args) {
		// One more String method which is split()
		
		String str = "What about Java, did you like it?";

		String arr[] = str.split(" ");//[What, about, Java,, did, you, like, it?]
		
		System.out.println(Arrays.toString(arr));
		
		//Ask user to enter a String then count the number of words inside the String
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		
		String arr1[] = s.split(" ");
		System.out.println("The number of words: " + arr1.length);
		
		scan.close();
	}
}
