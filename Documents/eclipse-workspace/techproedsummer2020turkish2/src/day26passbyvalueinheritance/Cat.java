package day26passbyvalueinheritance;

public class Cat extends Mammal {

	public static void main(String[] args) {
        Cat oc = new Cat();
        oc.clean();
        oc.drink();
        oc.eat();
        oc.feed();
        oc.meow();
	}
	
	public void meow() {
		System.out.println("Miyavlarlar"); 
	}
	
	public void clean() {
		System.out.println("Temizlenirler");
	}

}
