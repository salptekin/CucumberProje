package day25abstractionnt;

public class Cat extends Animal {

	public static void main(String[] args) {
          Cat cat = new Cat();
          cat.breathe();
          cat.drink();
          cat.eat();
          cat.feed();

	}

	@Override
	public void eat() {
		System.out.println("Cats eat");
		
	}

	@Override
	public void drink() {
		System.out.println("Cats drink");
		
	}

	@Override
	public void breathe() {
		System.out.println("Cats breathe");
		
	}

	@Override
	public void feed() {
	    System.out.println("Cats feed their babies");
	}

}
