package day13constructorsmethodcreationsnt;

public class MethodCreation01 {

	public static void main(String[] args) {
        add();
        //When we call a method we use values for parameters, the values are called
        //arguments
        
        //If the method does not contain System.out.println(); you have to put the method call
        //inside the System.out.println(); to see the result on the console
        System.out.println(subtract(15,10));
	}
	
	public static void add() {
		System.out.println("I am add method");
	}
	
	//If the return type of the method is different from "void" you have to use
	//return keyword in the last line of the method body
	static int subtract(int x, int y) {
		 return x-y;
	}

}
