package day26passbyvalueinheritance;

public class Dog extends Mammal {

	public static void main(String[] args) {
		
		Dog od = new Dog();
		od.bark();
		od.drink();
		od.eat();
		od.feed();
		od.smell();
	
	}
	
	public void bark() {
		System.out.println("Havlarlar");
	}
	
	public void smell() {
		System.out.println("Iyi koku alirlar");
	}

}
