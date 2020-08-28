package day31exceptionsdt;

public class E02 {
	/*
	 1)If when you type code,you do not get any red underline, but after running you get
	   red messages on the console, it means you are getting "Run Time Exceptions"
	 2)ArithmeticException is an example of  "Run Time Exceptions", If you do something wrong
	   according to math rules, Java throws ArithmeticException
	 3)If Java finds a problem, stops execution(does not run the next lines) and throws exception. 
	 4)For Compile Time Exceptions you have to handle exceptions but for Run Time Exceptions no need to 
	 handle. Java will throw exception even you did not handle, it is optional. 
	 */

	public static void main(String[] args) {		
		int x = 12;
		int y = 0;
		System.out.println("Good");
		System.out.println(x / y);
	}

}
