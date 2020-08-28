package day27inheritance;

public class Car extends Vehicle {
	
	/*
	 super() ile parent'dan constructor cagirirken parametrelere dikkat edin.
	 Parent class'da olmayan bir constructor'i super() ile cagirisaniz CTE alirsiniz.
	 
	 this() class icindeki constructor'lari parametrelere gore cagirmak icin kullanilir.
	*/
	
	public Car() {
		super(2);
		System.out.println("Car");
	}
	
	public Car(String name) {
		this();
		System.out.println("Car");
	}

	public static void main(String[] args) {		
		Car car = new Car("Honda");
	}

}
