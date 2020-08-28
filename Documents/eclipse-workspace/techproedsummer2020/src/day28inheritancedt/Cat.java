package day28inheritancedt;

public class Cat extends Mammal {
	
	public Cat() {
		super("Body");
		System.out.println("C");
	}

	public static void main(String[] args) {
         Cat cat = new Cat();
	}

	/*
	 When you use super() keyword Java looks for the 
	 constructor from parent not from grand-parent
	 or grand-grand-parent...
	*/
}
