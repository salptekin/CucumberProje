package day26passbyvalueinheritance;

public class Mammal extends Animal {

	public static void main(String[] args) {
		
		Mammal om = new Mammal();
		om.drink();
		om.eat();
		om.feed();

	}
	
	public void feed() {
		System.out.println("Yavrularini beslerler");
	}

}
