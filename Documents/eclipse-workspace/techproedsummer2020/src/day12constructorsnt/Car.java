package day12constructorsnt;

public class Car {
	
	int price = 9000;
	String make = "Honda";
	int year = 2017;
	String type = "Civic";
	
	//I need a car which is Honda Civic but its year is 2020
	//and its price is 11000
    Car(int price, int year){  	
		this.price = price;
		this.year = year;
	}   
    Car(){
    	
    }
    Car(String make, int price, String type){
    	this.make = make;
    	this.price = price;
    	this.type = type;
    }
	public static void main(String[] args) {
	   //If you want to create an object you must type the code 
	   //inside the main method		
	  //Class name	Object name    new keyword   Default Constructor
		   Car         car01     =    new              Car();
		   System.out.println(car01.year);//2017
		   System.out.println(car01.make);//Honda
		   System.out.println(car01.price);//9000
		   System.out.println(car01.type);//Civic
		   
		   Car car02 = new Car(11000, 2020);
		   System.out.println(car02.make);//Honda
		   System.out.println(car02.type);//Civic
		   System.out.println(car02.price);//11000
		   System.out.println(car02.year);//2020
		   
		   //Create a constructor to update the make, price and type.
		   //Then create an object by using that constructor
		   //Then print all features of the car on the console
		   Car car03 = new Car("Infinity", 24000, "Q50");
		   System.out.println(car03.make);//Infinity
		   System.out.println(car03.price);//24000
		   System.out.println(car03.type);//Q50
		   System.out.println(car03.year);//2017
		   
		   //Java selects the constructor by looking at the data types of parameters
		   //and the number of parameters.
		   
	}

}
