package day22overridingnt;

public class Dog extends Mammal {
	
	/*
	  What is "Overriding"?
	  Declaring a method in child class which is present in parent class
	  is called "method overriding"
	  
	  Why do we need "Overriding"?
	  Sometimes we need to use method from parent class in a child class
	  with different implementation. For example; sound() in Animal class
	  can have some general information about the sounds of animals, but
	  when I talk about cats, giving general information may not be enough 
	  I may need to give some detailed information about cats. For that; I have 
	  to update the body of the sound method, this is method overriding.
	  
	  Note: Overriding is just for methods
	  Note: When we do overriding we do not change the method signature.
	        If you touch method name or parameters, it means you are not overriding
	        you are creating a different method.
	  Note: Overriding can be used just between parents and childs. If there is no 
	        parent-child relationship, there is no overriding. 
	  Note: If the return type of a method is primitive when you override it 
	        the return type of "overriding method" must be same with the return type
	        of the "overridden method". Because there is no parent-child relationship between 
	        primitive data types.            
	 */

	public static void main(String[] args) {
         Dog d = new Dog();
         d.sound();
	}

	//Override sound() method and use the sound() method from parent class as well
	@Override // <== Annotation
	public void sound() {
		//If you use super.sound(), it means you are calling
		//all sound() methods from all parent classes if they are
		//using super.sound() as well
		super.sound();
		System.out.println("Dogs bark!");
	}

}
