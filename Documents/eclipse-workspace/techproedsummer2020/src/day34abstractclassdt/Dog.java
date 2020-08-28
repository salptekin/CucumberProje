package day34abstractclassdt;

public class Dog extends Animal {

	/*
	 1)Inside a concrete class you cannot create abstract method. 
	   All methods inside a concrete class must be concrete
	 2)You have to override all abstract methods from all parents
	   not just from the first parent  
	 */
	@Override
	public void eat() {
		System.out.println("Dogs eat meat");
	}
	@Override
	public void sound() {
		System.out.println("Dogs bark");		
	}
	@Override
	public void breathe() {
		System.out.println("Dogs breathe");	
	}

}
