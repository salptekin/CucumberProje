package day10stringmethodsdt;

public class StringMethods02 {

	public static void main(String[] args) {
		// 10) startsWith() ==> To check the initial
		//                      Returns boolean
		String str = "Thursday night plans";
		System.out.println(str.startsWith("T"));//true
		System.out.println(str.startsWith("M"));//false
		// str.startsWith('T'); Do not use char as  parameter in startsWith()
		
		//If you want to check a specific index has a specific character, you can 
		//use startsWith() method like the following
		System.out.println(str.startsWith("r", 3));//true
		System.out.println(str.startsWith("d", 6));//false
		System.out.println(str.startsWith("day", 5));//true
	}
}
