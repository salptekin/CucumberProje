package day10stringmethodsdt;

public class StringMethods01 {

	public static void main(String[] args) {
		/*
		 1) length() ==> To get the number of characters in a String
		                 Returns integer
		 2) equals() ==> To check if two Strings are same or not
		                 Returns boolean
		 3) toUpperCase() ==> To convert all characters to upper case in a String 
		                      Returns String
		 4) toLowerCase() ==> To convert all characters to lower case in a String 
		                      Returns String  
		 5) contains() ==> To check if a specific character exists in a String 
		                   Returns boolean
		 6) equalsIgnoreCase() ==> To check if two Strings are same with ignoring cases
		                           Returns boolean
		 7) charAt() ==> To get a character from String by using index
		                 Returns char                                                                                                                 
		 */
		
		// 8) replace() ==> To change a character/characters in a String
		//                  Returns String(updated)
		String str = "Easy, Java is Easy";
		System.out.println(str.replace('a', 'x'));//Exsy, Jxvx is Exsy
		//If you do not make assignment, original String does not change
		//str = str.replace('a', 'x');
		System.out.println(str);//Easy, Java is Easy
		
		//In replace() we can use both char and String as parameters
		System.out.println(str.replace("a", "&"));//E&sy, J&v& is E&sy
		
		//In replace() we can use more than one character as parameter
		System.out.println(str.replace("Easy", "Hard"));//Hard, Java is Hard
		System.out.println(str.replace("Easy", "?"));// ?, Java is ?
		
		System.out.println(str.replace("", "/"));// ==> /E/a/s/y/,/ /J/a/v/a/ /i/s/ /E/a/s/y/  
		System.out.println(str.replace(" ", "/")); // ==> Easy,/Java/is/Easy
		
		//To delete something in a String you can use the following 
		System.out.println(str.replace("a", ""));// ==> Esy, Jv is Esy
		
		// 9)replaceAll() makes the same thing with the replace()
		//                There are two differences between them
		//                1) replaceAll() does not accept char as parameters
		//                2) replaceAll() accepts "regex" as parameter but replace() do not
		
		System.out.println(str.replaceAll("J", "L"));// Easy, Lava is Easy
		//str.replaceAll('J', 'L'); ==> Do not use char parameters in replaceAll()
		
		//"regex" stands for "Regular Expressions"
		String m = "Java 123 ?!@$_";
		
		// ==> \\w means a->z and A->Z and 0->9 and _
		System.out.println(m.replaceAll("\\w", "*"));// **** *** ?!@$*
		//In regex upper case means negative meaning
		// ==> \\W means characters EXCEPT a->z and A->Z and 0->9 and _
		System.out.println(m.replaceAll("\\W", "*"));// Java*123*****_
		
		// ==> \\d means 0->9
		System.out.println(m.replaceAll("\\d", "*"));// Java *** ?!@$_
		System.out.println(m.replaceAll("\\D", "*"));// *****123******
		
		// ==> \\s is for white space
		System.out.println(m.replaceAll("\\s", "==>"));// Java==>123==>?!@$_
		System.out.println(m.replaceAll("\\S", "^"));//^^^^ ^^^ ^^^^

	}

}
