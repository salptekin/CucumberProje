package day28inheritancedt;

public class Dog extends Mammal {
	
	public Dog() {
		super();//To call parent constructors we use super()
		        //But it is not mandatory, typing super() or not
		        //typing super() is same. It is optional
		
		//If you use super() inside a constructor, it must be 
		//in the first line otherwise you will get Compile Time Error
		System.out.println("D");
		
	}

	public static void main(String[] args) {
		
        Dog dog = new Dog(); // AMD
        
//        Insect insect = new Insect();//AI
//        
//        Cat cat = new Cat();//AMC
//        
//        Mammal mammal = new Mammal();//AM
        
	}

}
