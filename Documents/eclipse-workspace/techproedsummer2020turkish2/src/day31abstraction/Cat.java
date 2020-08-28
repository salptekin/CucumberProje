package day31abstraction;

public class Cat extends Mammal {
	
	/*
	 1)Concrete class'lar parent'lari olan abstract class'lardaki tum abstract methodlari
	   override etmek zorundadirlar. Aksi takdirde Compile Time Error olusur.
	 2)Concrete class'lar parent'lari olan abstract class'lardaki concrete methodlari override etmek zorunda degildirler.
	   Concrete methodlarin override edilmesi istege baglidir.
	 3)Concrete class'lar TUM abstract parent'larindaki TUM abstract methodlari
	   override etmek zorundadirlar. Aksi takdirde Compile Time Error olusur.   
	*/

	public static void main(String[] args) {

	}

	@Override
	public void asi() {
		System.out.println("Ey kedi igne ol");		
	}

	@Override
	public void drink() {
		System.out.println("Su ic");
		
	}

	@Override
	public void feed() {
		System.out.println("Yavrularini besle");
		
	}


}
