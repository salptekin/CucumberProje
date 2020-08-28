package day13constructorsmethodcreationsnt;

public class MethodCreation03 {

	public static void main(String[] args) {
		/*
	     Create a method with parameters outside of the main method
		 Method should calculate the sum of two numbers and print them on the console
		 Call the method from inside main method with arguments
		*/
		addNums(12,5);//17
		addNums(1,2,3);//6
		addNums("a", 12);//a12

	}
	//1. If you change the name, the methods will be different methods. But sometimes we need some
	//   methods which have same names because of that do not make the names different

	public static void addNums(int x, int y) {
		System.out.println(x+y);
	}
	
	//2. If you change the data type of parameters, you can keep the method names same. Java will accept
	//   the methods which have same names as different methods.
	public static void addNums(String x, int y) {
		System.out.println(x+y);
	}
	
	//3. If you change the number of parameters, you can keep the method names same. Java will accept
	//   the methods which have same names as different methods.
	public static void addNums(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	//3. If you change the order of parameters, you can keep the method names same. Java will accept
	//   the methods which have same names as different methods.You can use that way if the data types
	//   of parameters are different
	public static void addNums(int y, String x) {
		System.out.println(x+y);
	}
	
	//If you create a method which has the same name with the existing one and different parameter, 
	//it means you are doing "method overloading"
	
	//When you make a mistake in overloading you are getting Compile Time Error because of that 
	//Overloading is a Compile Time Polymorphism

}
