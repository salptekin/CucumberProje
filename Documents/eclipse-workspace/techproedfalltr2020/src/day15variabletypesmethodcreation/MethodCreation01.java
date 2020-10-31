package day15variabletypesmethodcreation;

public class MethodCreation01 {
	
	/*
	 Static method'un icinde kullanilan hersey static olmalidir.
	*/
	
	/*
	 Method olustururken ayni method isimlerini kullanabilirsiniz ama parametreler farkli olmalidir.
	 Parametreleri farkli yapmanin 3 yontemi var;
	 1)Parametre sayilarini farkli yapabilirsiniz. 
	 2)Parametrelerin data type'larini degistirebilirsiniz.
	 3)Data type'lari farkli ise parametrelerin yerlerini degistirebilirsiniz.
	 */

	public static void main(String[] args) {
		
		toplama(3, 5);
		toplama(6.3, 1.2);
		
		carpma(2, 3);
		carpma(2.3, 3.4);
		carpma(2, 3.5);
		carpma(4, 5, 6);
		
	}
	
	public static void toplama(double a, double b) {
		System.out.println(a+b);
	}
	
	//Iki double'i carpan carpma methodu create edin.Bu methodu main method
	//icinden cagirarak calistirin.
	public static void carpma(double a, double b) {
		System.out.println(a * b);
	}
	
	public static void carpma(int a, double b) {
		System.out.println(a * b);
	}
	
	public static void carpma(int b, int a) {
		System.out.println(a * b);
	}
	
	//Uc double'i carpan bir carpma methodu olusturun ve bu methodu main method icinden
	//cagirarak calistirin.
	public static void carpma(double a, double b, double c) {
		System.out.println(a * b * c);
	}

}
