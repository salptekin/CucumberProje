package day27inheritance;

public class Dog extends Mammal{
	
	/*
	 1) Java'da bir class sadece bir class'a extend edebilir.
	    Java'da bir class'in sadece bir tane parent'i olabilir.
	    Java multiple inheritance'i onaylamaz
	 2) protected ve public method'lar inheritance'a uygundurlar. 
	    private method'lar inheritance'a uygun degildirler.
	    default ayni package'da iseniz inheritance'a uygundur ama fakli package'da
	    iseniz uygun degildir. Kullanmak risklidir bu yuzden inheritance'da default
	    access modifier kullanilmaz.
	 3) Parent Class = Super Class
	    Child Class = Sub Class
	 4) Her constructor'in ilk satirinda (aksi bir hamle yapilmadigi surece) "super()"
	    constructor call'u vardir. super() yazmak istege baglidir, yazsaniz da yazmasaniz da
	    super() otomatik olarak calisiur.      	      
	 */
	
	public boolean loyal = true;
	
	public Dog() {
		super();//Istege bagli yazsaniz da olur yazmasaniz da
		System.out.println("Dog");
	}

	public static void main(String[] args) {
         Dog dog = new Dog();
         dog.smell();
         dog.bark();
         dog.feed();
         dog.drink();
         dog.eat();
         System.out.println("Sadik? " + dog.loyal);
         System.out.println("Dogum? " + dog.dogum);
         System.out.println("Yas? " + dog.age);
	}
	
	public void bark() {
		System.out.println("Havlarlar");
	}
	
	public void smell() {
		System.out.println("Iyi koku alirlar");
	}

}
