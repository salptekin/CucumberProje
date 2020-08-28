package day22overridingnt;

public class Animal {

	public static void main(String[] args) {

	}
	/*
	 Note: Child class can use the overridden method with the 
	       same access modifier or wider access modifier.
	       For example; if the method in parent class has default access
	       modifier, the method inside the child class can have default,
	       protected, public access modifiers 
	 Note: In Java, after overriding, the method inside the parent class is called
	       "Overridden Method"; the method inside the child class is called "Overriding Method" 
	 Note:       
	              
	*/
	public void sound() {
		System.out.println("Animals make sound");
	}
	
	public Animal move() {
		System.out.println("Animals move");
		return new Animal();
	}
	
	//Private methods cannot be overridden because they are not accessible from other classes
	private void drink() {
		System.out.println("Animals drink water");
	}
	//If you use "final" keyword in a method, it means the body of the method is in its
	//final situation. The body of the method cannot be modified so final methods cannot 
	//be overridden
	public final void eat() {
		System.out.println("Animals eat");
	}
	//Static methods are common for all child classes. If a child class updates the body
	//of the static method it will affect all other child classes. It can cause problem for 
	//the other child classes because of that Java does not let to override the static methods.
	//You can create the same method inside the child class but it does not mean "overriding"
	//it means you created a new method.
	public static void breathe() {
		System.out.println("Animals breathe");
	}
	
	/*
	 In Animal class I have sound() method and I have sound() in Cat and Dog class as well but
	 their body part is different from each other. It means sound() is used in different forms.
	 It means sound() has multiple forms, multiple forms means "ploymorphism" in java.
	 
	 If you make any mistake in "Overriding" you will get Run Time Error because of that
	 Overriding is called "Run Time Polymorphism"
	 
	 Polymorphism = Overloading + Overriding
	 Overloading ==> Compile Time Polymorphism (Static Polymorhism)
	 Overriding ==> Run Time Polymorphism (Dynamic Polymorphism)
	*/

}
