package day27inheritance;

public class Animal {
	
	public int age = 1;
	
	public Animal() {
		super();
		System.out.println("Animal");
	}

	public static void main(String[] args) {	

	}
	
	public void eat() {
		System.out.println("Yemek yerler");
	}
	
	public void drink() {
		System.out.println("Su icerler");
	}

}
