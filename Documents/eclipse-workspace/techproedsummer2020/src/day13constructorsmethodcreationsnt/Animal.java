package day13constructorsmethodcreationsnt;

public class Animal {

	int age = 7;
	String name = "Dog";
	boolean mammal; //If you do not assign any value for a boolean default value is "false"
	
	Animal(){
		this("Rabbit");
		System.out.println("I am a constructor without parameters");
	}	
	Animal(boolean mammal){
		this();//Constructor call (this()) must be in first line inside the constructor
		       //I mean; only the first line gets constructor call
		       //Do not try to use more than one constructor call inside a constructor
		System.out.println("I am a constructor with boolean parameter");		
	}	
	Animal(String name){
		this(5, "Cat");
		System.out.println("I am a constructor with String parameter");
	}	
	Animal(int age, String name){
		System.out.println("I am a constructor with two parameters");
	}	
	public static void main(String[] args) {
		//Animal a1 = new Animal(true);
		//Animal a2 = new Animal("Snake");
		//Animal a3 = new Animal();
	}

}
