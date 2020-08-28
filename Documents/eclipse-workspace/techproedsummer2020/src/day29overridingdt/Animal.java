package day29overridingdt;

public class Animal {

	public static void main(String[] args) {
	}

	public void sound() {
		System.out.println("Animals make sound");
	}

	public void eat() {
		System.out.println("Eat all");
	}

	// In the following method; return type is Animal.
	// We can use class names as return type in methods.
	// Whe you use return type different from "void", you have to use return
	// keyword.
	/*
	 * After the return keyword, you must type something whose data is matching with
	 * the return type of the method.
	 */
	//To create an object, we can use "new keyword and constructor. But sometimes
	//Java gives us different ways to create an object from a class like String str = "Ali";
	public Animal drink() {
		return new Animal();
	}
	
	public int add() {
		return 4;
	}
	
	//If a method is "final" it means you cannot update its body
	//If you cannot update body of a method it means overriding is not
	//meaningful because of that Java does not allow to override final methods.
	public final void product() {
		System.out.println("Multiplication");
	}
	
	//Java does not allow to override static methods because
	//static methods are shared by all objects so 1)no need to override
	//2)if a class updates the body it will affect all other classes this can 
	//  cause some problems.
	public static void division() {
		System.out.println("Division");
	}
	
	//You cannot access to private methods from other classes so you
	//cannot override private methods.
	private void m1() {
		System.out.println("Method one");
	}
	
	void m2() {
		System.out.println("Method 2");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
