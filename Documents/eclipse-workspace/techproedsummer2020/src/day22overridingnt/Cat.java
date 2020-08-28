package day22overridingnt;

public class Cat extends Mammal {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.sound();//Animals make sound
		          //Cats meoww

	}
	
	//If you want to use method in parent class use "super." like the example below
	public void sound() {
		super.sound();
		System.out.println("Cats meoww");	
	}

	//Override move() method
	/*
	 The return type of the "overriding method"(method inside the child)
	 can be same with the "overridden method" (method inside the parent) or
	 can be narrower than the "overridden method" (method inside the parent).
	 For the following example; you can use Animal, Mammal Cat as return type.
	 */
	@Override
	public Cat move() {
		return new Cat();
	}

}
