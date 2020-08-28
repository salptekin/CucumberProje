package day07switchstatementnt;

public class StringMethods01 {

	public static void main(String[] args) {
// 1) equals() ==> To compare Strings ==> Returns boolean
// 2) length() ==> To get the number of characters ==> Returns integer
// 3) contains() ==> To check if a specific character is exist in String ==> Returns boolean
// 4) toLowerCase() ==> To convert all characters to lower case ==> Returns String
// 5) toUpperCase() ==> To convert all characters to upper case ==> Returns String
// 6) charAt() ==> To get a specific character from String by using index ==> Returns char
// 7) equalsIgnoreCase() ==> To compare Strings without looking at to be upper or lower cases ==> Returns boolean
		String str1 = "JAVA";
		String str2 = "java";
		System.out.println(str1.equals(str2));//returns false
		System.out.println(str1.equalsIgnoreCase(str2)); //returns true
// 8) indexOf() ==> To get the index of the first occurrence of a specific character ==> Returns integer
		
		String str3 = "Hello World";
		
		System.out.println(str3.indexOf('l'));//2
		System.out.println(str3.indexOf('W'));//6
		System.out.println(str3.indexOf(' '));//5
		
		System.out.println(str3.indexOf('x'));//-1 ==> If you get -1 it means 'x' is not exist in the String
		System.out.println(str3.indexOf('h'));//-1 ==> If you get -1 it means 'h' is not exist in the String
		//Do not put just '' into the indexOf(), you get compile time error. You have to put a character
		//between single quotes.
		
		//You can use String for indexOf() as well.
		System.out.println(str3.indexOf("lo"));//3 is the index of first character of "lo"
		System.out.println(str3.indexOf("Wor"));//6
		
		//You can use indexOf() with parameters like indexOf(a,b)
		System.out.println(str3.indexOf('l', 5)); //I am looking for 'l' after the index 5 so the result will be 9
		
//9)lastIndexOf() ==> To get the index of last occurrence of a specific character
		
		String str4 = "Missisippi";
		System.out.println(str4.lastIndexOf('s'));//5
		System.out.println(str4.lastIndexOf("si"));//5
		System.out.println(str4.lastIndexOf('i', 4));//4
	}

}
