package day08stringmethodsnt;

public class StringMethods03 {

	public static void main(String[] args) {
		// 14. substring() method extract a part of a String. It returns String
		
		String str = "Learn Java";
		
		System.out.println(str.substring(6));//Java
		
		//Get "earn Java" from the String
		System.out.println(str.substring(1));//earn Java
		
		//Get just "earn"
		// substring(a,b) ==> a is inclusive, b is exclusive
		System.out.println(str.substring(1, 5));//earn
		System.out.println(str.substring(6, 7));//J
		System.out.println(str.substring(3, 3));//Nothing on the console
		//System.out.println(str.substring(6, 3));//Do not make beginning index
		                                        //greater than ending index
		
		//While you type code, if you get red underline it is Compile Time Error
		//If you get some red messages on the console after running your code
		//it is Run Time Error.

	}

}
