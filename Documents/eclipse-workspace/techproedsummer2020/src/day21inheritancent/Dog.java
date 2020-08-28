package day21inheritancent;

public class Dog extends Animal {
	
	int height = 30;
	
	Dog(){
		System.out.println(super.height);//20
		System.out.println("D1");
	}
	Dog(int age){
		System.out.println(this.height);//30
		System.out.println(super.height);//20
		System.out.println("D2");
	}
	Dog(String name){
		this(4);
		System.out.println("D3");
	}
	Dog(boolean old){
		super(7);
		System.out.println("D4");
	}

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();//A1 20 D1		
		Dog dog2 = new Dog(5);//A1 30 D2 ==> Every time the constructor without parameter
		                      //          runs from parent class if you do not call
		                      //          different one
		Dog dog3 = new Dog("Boby");// A1 D2 D3		
		//Dog dog4 = new Dog(false);//A2 D4

	}

}
