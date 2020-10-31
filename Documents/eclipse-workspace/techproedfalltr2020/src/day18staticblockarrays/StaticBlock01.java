package day18staticblockarrays;

public class StaticBlock01 {
	
	static double pi;
	static String s;
	
	/*
	 1) Static Block static variable'lara deger atamasi yapmak(initialize) icin kullanilir.
	 2) Static Block class olusturulurken butun methodlardan(main method dahil) once calistirilir.
	 3) 1'den fazla static block varsa ustteki once calisir.
	*/

	static{
		pi = 3.14;
		System.out.println(pi);
	}

	public static void main(String[] args) {
		
		alanDaire(10);
	}
	
	public static void alanDaire(double r) {
		System.out.println("Dairenin Alani: " + pi * r * r);
	}
	
	static{
		s = "Ali" + pi;
		System.out.println(s);
	}
	

}
