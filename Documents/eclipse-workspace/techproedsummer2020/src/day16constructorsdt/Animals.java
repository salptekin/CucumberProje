package day16constructorsdt;

public class Animals {
	
	int height = 50;
	String name = "Rabbit";
	boolean mammal = true;
	
    Animals () {
		
	}
    Animals(int height) {
		this.height = height;
	}

	public static void main(String[] args) {
		/*
		 Create 2 constructors one is with parameters, the other one is without parameter.
		 By using that constructors create at least 2 objects then print their features
		 on the console.
		 */
		
		Animals an1 = new Animals();
		System.out.println(an1.height);//50
		System.out.println(an1.mammal);//true
		System.out.println(an1.name);//Rabbit
		
		System.out.println("=================");
		
		Animals an2 = new Animals(60);
		System.out.println(an2.height);//60
		System.out.println(an2.mammal);//true
		System.out.println(an2.name);//Rabbit

	}

}
