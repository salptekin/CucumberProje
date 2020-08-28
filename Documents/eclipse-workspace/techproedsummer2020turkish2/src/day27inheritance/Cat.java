package day27inheritance;

public class Cat extends Mammal {
	
	public boolean biyik = true;
	
	public Cat() {
		System.out.println("Cat");
	}

	public static void main(String[] args) {

	}
	
	public void meow() {
		System.out.println("Miyavlarlar");
	}
	
	public void clean() {
		System.out.println("Kendilerini temizlerler");
	}

}
