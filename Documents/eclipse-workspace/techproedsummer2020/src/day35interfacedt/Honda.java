package day35interfacedt;

public class Honda implements Gas, AirCondition {
	
	/*
	 1)When you make a concrete class child of an interface
	   use "implements" keyword instead of "extends"
	 2)In parent interfaces you can use variables whose names are same
	   When you call the variables you have to use interface names
	   otherwise you will get CTE.  
	*/

	public static void main(String[] args) {
        Honda hondaCar = new Honda();
        
        hondaCar.seat();
        hondaCar.cold();
        hondaCar.refresh();
        hondaCar.power();
        hondaCar.speed();
        hondaCar.eco();

        System.out.println(Gas.price);//1
        System.out.println(Engine.price);//3
        System.out.println(AirCondition.price);//2
        System.out.println(x);
        System.out.println(Gas.x);
	}
	
	public void seat() {
		System.out.println("Leather seats");
	}

	@Override
	public void cold() {
		System.out.println("Colds well");		
	}

	@Override
	public void refresh() {
		System.out.println("Refreshs well");		
	}

	@Override
	public void speed() {
		System.out.println("Very speed car");		
	}

	@Override
	public void power() {
		System.out.println("It has 215 horse-power");	
	}

	@Override
	public void eco() {
		System.out.println("It is an eco car");
		
	}

}
