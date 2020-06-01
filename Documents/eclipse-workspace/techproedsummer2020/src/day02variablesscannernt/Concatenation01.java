package day02variablesscannernt;

public class Concatenation01 {

	public static void main(String[] args) {
		//Concatenation: To join Strings
		
		String str1 = "Learn"; 
		String str2 = "Java";
		int num1 = 2;
		int num2 = 3;
		System.out.println(str1 + str2);// + sign for Strings is concatenation
		                               // LearnJava
		System.out.println(str1 + " " + str2);//Learn  Java
		System.out.println(str1 + str2);//Learn Java
		System.out.println(str1 + str2);//Learn Java
		
		System.out.println(str1 + num1 + num2);//Learn23
		System.out.println(num1 + num2 + str1);//5Learn
		System.out.println(num1 + str1 + num2);//2Learn3
		System.out.println(str1 + (num1 + num2));//Learn5
		
		//How can you print Learn6Java-1 on the console
		System.out.println(str1+(num1*num2)+str2+(num1-num2));//Learn6Java-1
	}
}
