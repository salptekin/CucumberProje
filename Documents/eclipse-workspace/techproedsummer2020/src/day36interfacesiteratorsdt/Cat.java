package day36interfacesiteratorsdt;

public class Cat implements Animal, Mammal, Carnivorous {

	/*
	 Inside the parent interfaces, you can use same methods with same
	 return type, but you CANNOT use same methods with different
	 return types. Java complains.
	 */
	public static void main(String[] args) {
		
	}

	@Override
	public void eat() {
		System.out.println("Eat and do nothing");	
	}

}
