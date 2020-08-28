package day26abstractioninterfacent;

public class Cat implements Animal, Mammal, Carnivorous {

	public static void main(String[] args) {
		Cat cat = new Cat();	
		System.out.println(Animal.x);//5
		System.out.println(Mammal.x);//7
		cat.eat();

	}

	/*
	 1)If the interfaces which you implemented have methods whose
	   signatures and return types are same Java will override just
	   one of them and it will be okay.
	 2)If the interfaces which you implemented have methods whose
	   signatures are same but return types are different you will get compile time error.
	   Because Java cannot decide which one will be overridden. If Java overrides all then
	   it will be problem in the concrete class because inside the concrete class you will
	   two methods whose signatures are same. 
	 3)If the interfaces which you implemented have variables whose names are same
	   you have to use interface names to select the variables. Otherwise Java will complain.   
	*/
	
	@Override
	public void eat() {
		System.out.println("Cats like cheese");
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}
	
}
