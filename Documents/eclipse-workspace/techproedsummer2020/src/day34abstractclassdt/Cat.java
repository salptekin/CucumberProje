package day34abstractclassdt;

public class Cat extends Animal {
	
	/*
	 1) If the child class is "concrete" it is must to override
	    abstract methods but if the child class is "abstract" overriding
	    abstract methods is optional
	 2) If any parent overrides an abstract method then it is optional 
	    for the concrete child class to override.    
	 */

	public static void main(String[] args) {

	}	
	@Override
	public void eat() {
		System.out.println("Cats eat cheese");
	}
	@Override
	public void sound() {
		System.out.println("Cats meow");	
	}
	@Override
	public void drink() {
        System.out.println("Cats drink water and milk");
	}

}
