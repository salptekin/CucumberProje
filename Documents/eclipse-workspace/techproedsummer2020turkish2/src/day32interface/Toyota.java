package day32interface;

public class Toyota implements Car, Klima {

	public static void main(String[] args) {

	}

	@Override
	public void motor() {
		System.out.println("1.0 VTEC diesel");		
	}

	@Override
	public void direksiyon() {
		System.out.println("Plastik");		
	}

	@Override
	public void teker() {
		System.out.println("14 inch demir jant");	
	}

	@Override
	public void isitma() {
		System.out.println("Isinma icin kalorifer kullan");		
	}

	@Override
	public void antiBakteri() {
		System.out.println("Kader...");		
	}

	@Override
	public void fiyat() {
		// TODO Auto-generated method stub
		
	}

}
