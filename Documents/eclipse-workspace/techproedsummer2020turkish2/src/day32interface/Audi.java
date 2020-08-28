package day32interface;

public class Audi implements Car, Klima {

	public static void main(String[] args) {

	}

	@Override
	public void motor() {
		System.out.println("2.8T Turbo Benzinli");
	}

	@Override
	public void direksiyon() {
       System.out.println("Gercek deri");
		
	}

	@Override
	public void teker() {
		System.out.println("Michelin 24 inch celik jant");
	}

	@Override
	public void isitma() {
		System.out.println("Akilli isitma var");
		
	}

	@Override
	public void antiBakteri() {
		System.out.println("100% bakteri koruma");		
	}

	@Override
	public void fiyat() {
		// TODO Auto-generated method stub
		
	}

}
