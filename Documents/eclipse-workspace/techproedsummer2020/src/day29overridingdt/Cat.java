package day29overridingdt;

public class Cat extends Animal {

	/*
	 * The overriding methods(methods inside the child class) cannot use more
	 * restricted access modifiers than overridden methods(methods inside the parent
	 * class). The access modifiers of overriding methods can be same or wider than
	 * overridden methods For example; if overridden method's access modifier is
	 * "default" then overriding's access modifier can be "default", "protected",
	 * and "public".
	 */
	public static void main(String[] args) {

		/*
		 * The return type of overriding methods(methods inside the child class) must
		 * be: 1)same with the return type of overridden(methods inside the parent
		 * class)methods. 2)the child of the return type of overridden(methods inside
		 * the parent class)methods
		 */

	}

	public void sound() {
		System.out.println("Cats meow");
	}

	public void eat() {
		System.out.println("Eat cheese");
	}

	@Override // Override annotation
	public Animal drink() {
		return new Animal();
	}

	// If the return type of overridden method is primitve then
	// the return type of overriding method must be same with
	// the return type of overridden method. Because there must be
	// "IS-A" relationship between the return type in overriding
	// and "IS-A" relationship can be between the classes but primitives
	// are not classes so we cannot talk about an "IS-A" relationtship
	// between primitives
	@Override
	public int add() {
		return 5;
	}

	//default methods can be accessed from other classes if 
	//you are "in the same package" so from the same package you can override
	//default methods. But if you are in a different package you cannot access
	//to the default methods because of that you cannot override
	@Override
	void m2() {

	}
	
	//public and protected methods can be overridden without any issue

}