package day16constructorsdt;

public class Car {
	
	int price = 20000;
	int year = 2015;
	String make = "Honda";
	String type = "Civic";
	
	//Create a constructor without parameters
	Car(){
		
	}	
	//Create a constructor with 1 parameter
	Car(int price){
		this.price = price;
	}	
	//Create a constructor with 2 parameter
	Car(String make, int year){
		
	}
	//Create a constructor with 4 parameters
	Car(String make, int price, int year, String type){
		this.make=make;
		this.price=price;
		this.year=year;
		this.type=type;		
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1.price);//20000
		System.out.println(c1.year);//2015
		System.out.println(c1.make);//Honda
		System.out.println(c1.type);//Civic
		
		System.out.println("==================");
		
		Car c2 = new Car(10000);
		System.out.println(c2.price);//10000
		System.out.println(c2.year);//2015
		System.out.println(c2.make);//Honda
		System.out.println(c2.type);//Civic
		
		System.out.println("==================");
		
		//Create a car whose make is Infinity, type is Q50, year is 2018, price is 24000
		//then print all features on the console
		Car c3 = new Car("Infinity", 24000, 2018, "Q50");
		System.out.println(c3.make);//Infinity
		System.out.println(c3.price);//24000
		System.out.println(c3.year);//2018
		System.out.println(c3.type);//Q50

	}

}
