package day19encapsulationnt;

public class Mammal extends Animal {
	
	boolean breathe = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	protected void feed(String name) {
		System.out.println(name + " can feed its baby");
	}

}
