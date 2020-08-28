package day17constructorsmethodcreationdt;

public class MethodCreation01 {

	public static void main(String[] args) {
		add();
		subtract(5,3);//If your method has parameters, when you call the method
		              //you have to use values for the parameters.
		              //Values for parameters are called "arguments" in Java
		              //In subtract(int x, int y) ==> "int x" and "int y" are parameters
		              //In subtract(5,3) ==> "5" and "3" are arguments
		
		//If the method is not printing the result on the console, you have to put
		//method call inside the System.out.println()
		System.out.println(multiply(2,3));//6
	}
	
	public static void add() {
		System.out.println("Addition");
	}
	public static void subtract(int x, int y) {
		System.out.println(x-y);
	}
	//If you use return type different from "void" you have to use "return"
	//keyword in the last line of the method body.
	//If you do not use "return" you will get Compile Time Error
	public static int multiply(int x, int y) {
		return x*y;
	}

}
