package day34interface;

public class Civic extends Honda implements IcDonanim, Lastik {

	/*
	 Class'lari bir class'in parent'i yaparken "extends"
	 keyword kullanilir, "interface"leri bir class'in 
	 parent'i yaparken "implements" keyword kullanilir.
	*/
	@Override
	public void hareket() {
		System.out.println("Hizli ve ekonomik hareket eder");	
	}

	@Override
	public void koltuk() {
		System.out.println("Ortopedik koltuklari var");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Deri hidrolik direksiyon");	
	}

	@Override
	public void ayna() {
		System.out.println("Otomatik kararma ozelligi var");	
	}

	@Override
	public void far() {
		System.out.println("Led far");
		
	}

	@Override
	public void kaporta() {
		System.out.println("Paslanmaz celik");
		
	}

	@Override
	public void garanti() {
		System.out.println("100.000km garanti");
		
	}

	@Override
	public void jant() {
		System.out.println("Celik jant");		
	}

}
