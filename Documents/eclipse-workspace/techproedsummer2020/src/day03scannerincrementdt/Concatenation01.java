package day03scannerincrementdt;

public class Concatenation01 {

	public static void main(String[] args) {
		//Concatenation: To join Strings
		String str1 = "Learn";
		String str2 = "Java";
		System.out.println(str1 + str2);//LearnJava
		System.out.println(str1 + " " + str2);//Learn Java
		System.out.println("Learn " + "Java");//Learn Java
		System.out.println("Learn" + " Java");//Learn Java
		
		System.out.println(str1 + 2 + 3);//Learn23
		System.out.println(str1 + (2 + 3));//Learn5
		System.out.println(2 + 3 + str2);//5Java
		
		//By using str1, str2, 2, and 3 print 6LearnJava-1 on the console
		System.out.println((2*3) + str1 + str2 + (2-3));//6LearnJava-1
	}
}
