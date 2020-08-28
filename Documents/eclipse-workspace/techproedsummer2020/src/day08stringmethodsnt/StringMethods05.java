package day08stringmethodsnt;

public class StringMethods05 {

	public static void main(String[] args) {
		// 15. trim() method is used to delete space character from the 
		//     beginning and ending of a String
		
		String str = " Java  ";
		System.out.println(str.length());//7
		System.out.println(str.trim());//Java
		System.out.println(str.trim().length());//4
	}
}
