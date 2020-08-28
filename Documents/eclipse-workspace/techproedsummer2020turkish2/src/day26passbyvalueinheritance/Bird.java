package day26passbyvalueinheritance;

public class Bird extends Animal {

	public static void main(String[] args) {
		
		Bird ob = new Bird();
		ob.drink();
		ob.eat();
		ob.fly();
		
	}
	
	public void fly() {
		System.out.println("Ucarlar");
	}

}
