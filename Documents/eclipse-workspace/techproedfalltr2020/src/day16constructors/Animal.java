package day16constructors;

public class Animal {
	
	int age;
	String name;
	int numOfLegs;
	boolean isMammal;
	
	public Animal() {
		System.out.println("Parametresiz");
	}	
	public Animal(String name) {
		this();
		System.out.println("Name parametreli");
	}
	public Animal(int age) {
		System.out.println("Age parametreli");
	}
	public Animal(String name, int age) {
		System.out.println("Name ve Age parametreli");
	}

	public static void main(String[] args) {
		
		Animal a1 = new Animal("Cat");
		
	}

}
