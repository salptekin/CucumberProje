package day08stringmethodsnt;

public class StringMethods01 {

	public static void main(String[] args) {
		//10. replace() method is used to change a character/characters in String
		
		String str = "Easy, Java is Easy";
		//After using replace(), if you do not make assignment,
		//it means you did not change the original String
		str = str.replace('a', 'x');
		System.out.println(str);//Exsy, Jxvx is Exsy
		
		str = str.replace("Exsy", "Hard");
		System.out.println(str);//Hard, Jxvx is Hard
		
		str = str.replace("x", "");
		System.out.println(str);//Hard, Jv is Hard
		
		str = str.replace("", "/");
		System.out.println(str);// ==> /H/a/r/d/,/ /J/v/ /i/s/ /H/a/r/d/
		
		str = str.replace("/", "");
		System.out.println(str);//Hard, Jv is Hard
		
		str = str.replace(" ", "==>");
		System.out.println(str);//Hard,==>Jv==>is==>Hard
		
		//11. replaceAll() makes the same with replace().
		//    Differences ==> 1) replaceAll() does not accept char as a parameter
	    //                       Just Strings are allowed as a parameter
		//                    2) You can use "regex" in replaceAll() method but
		//                       You cannot use "regex" in replace() method
		
		// regex : Regular expression
		
		String s = "Java 123 ?!@$_";
		//Convert all spaces to *
		System.out.println(s.replaceAll("\\s", "*"));//Java*123*?!@$_
		
		//Convert all characters except white space to &
		System.out.println(s.replaceAll("\\S", "&"));//&&&& &&& &&&&&
		
		//Convert all letters, digits, and under score to *
		//  \\w ==> [a->z  A->Z  0->9  _]
		System.out.println(s.replaceAll("\\w", "*"));//**** *** ?!@$*
		System.out.println(s.replaceAll("\\W", "^"));//Java^123^^^^^_
		
		//Convert just the numbers to asterix
		System.out.println(s.replaceAll("\\d", "*"));//Java *** ?!@$_
		System.out.println(s.replaceAll("\\D", "+"));//+++++123++++++

	}

}
