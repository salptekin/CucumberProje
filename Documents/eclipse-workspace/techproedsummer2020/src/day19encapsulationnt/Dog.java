package day19encapsulationnt;

public class Dog extends Mammal {
	
	public boolean bark = true;

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("Can a dog bark? "+ dog.bark);
		System.out.println("Can a dog breathe? " + dog.breathe);
		System.out.println("What is the weight in kg? " + dog.weight);
		dog.feed("Dog");
		dog.goodSmell("Dog");
		dog.move("Dog");
	}
	
	protected void goodSmell(String name) {
		System.out.println(name + " smells well");
	}

}
