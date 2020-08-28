package day04ifstatementnt;

public class IfElseStatement02 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else statement, 
         if the password is “JavaLearner”, output will be “The password is true”. 
         Otherwise, output will be “The password is false”.
		*/		
		String password = "JavaLearner";
		
		if(password.equals("JavaLearner")) {
			System.out.println("Password is true");
		}else {
			System.out.println("Password is false");
		}
	}
}
