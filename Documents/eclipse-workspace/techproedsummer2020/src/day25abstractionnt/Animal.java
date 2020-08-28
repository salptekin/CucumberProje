package day25abstractionnt;

public abstract class Animal {
	
	/*
	 1)Animal class must have Dog, Cat, and Lion child classes
	 2)Dog, Cat, and Lion child classes must have eat(), drink(), and breathe() methods in their
	   own implementation
	 3)For Dog, Cat, and Lion child classes having run(), and feed() methods will be optional.
	 4)Create an abject from  Dog, Cat, and Lion child classes and call the methods 
	 */

	public static void main(String[] args) {

	}
	
	public abstract void eat();
	public abstract void drink();
	public abstract void breathe();
	
	public void run() {
		System.out.println("Animals run");
	}
	
	public void feed() {
		System.out.println("Animals feed");
	}

}
