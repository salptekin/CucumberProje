package day32exceptions;

public class E04 {

	public static void main(String[] args) {
		
		try {
			
			hata();
			
		}catch(IllegalArgumentException e) {
			
			System.out.println(e);//java.lang.IllegalArgumentException: Gecerli data giriniz
			
			System.out.println(e.getMessage());//Gecerli data giriniz
			
			e.printStackTrace();//java.lang.IllegalArgumentException: Gecerli data giriniz
			                    //at day32exceptions.E04.hata(E04.java:18)
			                    //at day32exceptions.E04.main(E04.java:8)
		}

	}
	
	public static void hata() {
		throw new IllegalArgumentException("Gecerli data giriniz");
	}
}
