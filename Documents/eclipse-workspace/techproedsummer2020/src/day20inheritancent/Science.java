package day20inheritancent;

public class Science extends Math {
	
	public boolean soccer = true;
	//When you create an object from a class which has parent
	//Java runs the parent constructor first then runs the
	//constructors from top to bottom

	public static void main(String[] args) {
		//The things which you can access depend on the 
		//data type of the object. For example; if you create object
        //like ==> Teacher sci = new Science(); then you can access
		//just the Teacher class things. If you create the 
		//object like ==> Science sci = new Science(); then
		//you can access class members of Science class and its parents
		
		
		//You cannot select the constructor from parent and data type from child
		//If you do it like ==> Art art = new Teacher(); then you will get Compile
		//Time Error
		
		// From Child to Parent there is IS-A Relationship
		// From Parent to Child there is HAS-A Relationship

	}
	
	public void talk() {
		System.out.println("They can speak Spanish");
	}
	
	Science(){
		System.out.println("Science constructor");
	}

}
