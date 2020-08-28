package day28inheritancedt;

public class Mammal extends Animal {
	
	public Mammal() {
		super("Jhonny");
		System.out.println("M");
	}
	
	public Mammal(String name) {
		
		System.out.println("M with P");
	}

	/*
	 If you try to use non-existing constructor you will get 
	 Compile Time Error
	*/
	public static void main(String[] args) {
         Mammal mammal = new Mammal();
	}

}
