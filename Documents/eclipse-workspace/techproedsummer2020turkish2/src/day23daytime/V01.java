package day23daytime;

public class V01 {
	
	/*
	 Varargs : (Variable Arguments) Varargs normalde bir array'dir. Ama uzunlugu kullanicinin
	           girdigi deger sayisina gore buyur.
	           
	           Not: Varargs dipsiz bir kuyu gibidir icine ne atarsaniz sonsuza kadar kabul eder.
	           
	           1)Varargs'dan sonra baska parametre kullanilamaz.Varargs method parantezi 
	             icerisinde her zaman en son parametre olmalidir.
	           2)Varargs sonda olduktan sonra Varargs'in oncesinde Varargs olmayan parametreler 
	             kullanilabilir.
	           3)Bir method parantezinin icinde sadece bir tane varargs kullanabilirsiniz.               
	 */

	public static void main(String[] args) {
		
		add(3, 5);//8
		add(3, 5, 7);//15
		add(3, 5, 7, 9, 11, 13, 15, 17);//80
		
		product(2, 3);//6
		product(2, 3, 4, 5);//120

	}
	
	public static void add(int s1, int s2) {
		System.out.println(s1 + s2);
	}
	
	public static void add(int s1, int s2, int s3) {
		System.out.println(s1 + s2 + s3);
	}
	
	public static void add(int... x) {
		int sum = 0; 
		for(int w:x) {
			sum = sum + w;
		}
		System.out.println(sum);
	}
	
	//Ne kadar sayi girilirse girilsin ekrana carpimini yazdirin.
	
	public static void product(int... y) {
		int product = 1;
		for(int w : y) {
			product = product * w;
		}
		System.out.println(product);
	}
	
	//Homework: Kelimenin harflerini alip onlari giris sirasina gore birlestirerek ekrana basan 
	//          bir program yaziniz. Varargs kullanmalisiniz.

}
