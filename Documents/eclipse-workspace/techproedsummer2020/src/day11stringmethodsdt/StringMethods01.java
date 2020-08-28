package day11stringmethodsdt;

public class StringMethods01 {

	public static void main(String[] args) {
		// 11) endsWith() method determines whether a String ends with 
		//     a specific character/characters. It returns boolean.
		
		String str = "Friday night plans";
		System.out.println(str.endsWith("s"));//true
		System.out.println(str.endsWith("ans"));//true
		System.out.println(str.endsWith("m"));//false
		//str.endsWith('s'); ==> Do not use single quotes in endsWith()
		
		// 12) substring() method extracts a specific part of a String.
		//                 It returns String
		System.out.println(str.substring(3)); //day night plans
		//The index which you put int substring() is inclusive
		System.out.println(str.substring(7));//night plans
		
		System.out.println(str.substring(18));//You get nothing on the console
		//If you use the index which is equal to length you will get nothing
		
		//str.substring(19);//Java gives error on the console.
		//If you use the index which is greater than length you will get
		//Run Time Error on the console (Exception:StringIndexOutOfBoundsException)
		
		//Compile Time Error: While you type code if you get red underline
		//                    it means you are getting Compile Time Error
		
		//Run Time Error: If you get red messages on the console after running
		//                your code, it is called Run Time Error
		
		String s = "Learn Java";
		System.out.println(s.substring(1, 5));
		//In substring(a,b), a is inclusive, b is exclusive
		
		//Get Ja on the console by using substring(a,b)
		System.out.println(s.substring(6, 8));//Ja
		
		System.out.println(s.substring(3, 3));
		//If the parameters are same you will see nothing on the console
		
		System.out.println(s.substring(6, 3));
		//Run Time Error, you cannot make the beginning index greater than
		//ending index. If you do it, you will get StringIndexOutOfBoundsException

	}

}
