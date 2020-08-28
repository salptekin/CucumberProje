package day22overridingnt;

public class Mammal extends Animal {

	public static void main(String[] args) {
        Mammal m = new Mammal();
        m.sound();
	}

	//Override the method from Animal class
	@Override
	public void sound() {
		super.sound();
		System.out.println("Mammals make more sounds");
	}

	public static void breathe() {
		System.out.println("Mammal can breathe with lungs");
	}

}
