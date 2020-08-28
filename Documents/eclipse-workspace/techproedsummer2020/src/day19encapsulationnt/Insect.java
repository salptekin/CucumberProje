package day19encapsulationnt;

public class Insect extends Animal {

	boolean poison = true;

	public static void main(String[] args) {
		Insect ins = new Insect();
		System.out.println("Is it poisonous? " + ins.poison);
		System.out.println("What is the weight in gram: " + ins.weight);
		ins.move("Mosquito");
		ins.hurt("Mosquito");

	}	
	protected void hurt(String name) {
		System.out.println(name + " hurts badly");
	}
}
