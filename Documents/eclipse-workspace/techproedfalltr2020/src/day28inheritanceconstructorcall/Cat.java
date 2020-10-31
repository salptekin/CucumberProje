package day28inheritanceconstructorcall;

public class Cat extends Mammal {
	
	public int c = 2;
	public int d = 5;

	public Cat() {
		System.out.println("Parametresiz Cat");	
	}
	public Cat(String s) {
		this();
		/*
		 Parent Class'dan variable veya method
		 secmek icin "super" keywordunu kullanabilirsiniz.
		 */
		System.out.println(super.c);//4
		System.out.println("Parametreli Cat");
	}
	public void mC() {
		System.out.println("Cat");
	}
}
