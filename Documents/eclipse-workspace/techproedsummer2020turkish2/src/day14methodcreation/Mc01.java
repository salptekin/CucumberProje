package day14methodcreation;

public class Mc01 {
	//static method'larin icinde kullanilan hersey static olmalidir
	
	public static void main(String[] args) {
		toplama(3, 5);//8
		cikarma(5, 1);//Sonuc: 4
		//Method cagrilirken parantezin icine yazilan degerlere 
		//"argument" denir
		carpma(3, 5);//Sonuc: 12
		carpma(6);

	}
	
	//Method olustururken method parantezinin icine yazdiginiz variable'lara
	//"parametre" denir.
	public static void toplama(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	public static void cikarma(int n1, int n2) {
		System.out.print("Sonuc: ");
		System.out.println(n1 - n2);
	}
	
	//carpma methodu olusturun ve main methodun icinden cagirin
	/*
	 1)Parametre sayisini degistirerek ayni isimli methodlar uretebilirsiniz.
	 2)Parametre sayilari ayni oldugu halde data type'larini degistirerek de
	   ayni isimli methodlar uretebilirsiniz 
	 3)Parametrelerin data type'lari farkli oldugunda parameterelerin yerlerini 
	   degistirerek ayni isimli methodlar uretebilirsiniz  
	   
	 Note: Parametreleri degistirerek 1'den fazla ayni isimli method uretmeye
	       METHOD OVERLOADING denir   
	*/
//	public static void carpma(int n1, int n2) {
//		System.out.println("Birinci carpma methodu");
//	}
	
	public static void carpma(int n1, int n2) {
		System.out.println("Birinci carpma methodu");
	}
	
	public static void carpma(int n1) {
		System.out.println("Ikinci carpma methodu");
	}
	
	public static void carpma(long n1) {
		System.out.println("Ucuncu carpma methodu");
	}
	
	public static void carpma(int n1, double n2) {
		System.out.println("Dorduncu carpma methodu");
	}
	
	public static void carpma(double n1, int n2) {
		System.out.println("Besinci carpma methodu");
	}
	/*
	 1)Return Type'lar degistirilerek method overloading yapilmaz. Yani;
	   ismi ve parametreleri ayni olan iki method return type'lari farkli 
	   bile olsa Java onlari ayni method kabul eder.
	 2)Access Modifier'lar degistirilerek method overloading yapilmaz. Yani;
	   ismi ve parametreleri ayni olan iki method Access Modifier'lari farkli 
	   bile olsa Java onlari ayni method kabul eder.
	 3)Method Body'ler degistirilerek method overloading yapilmaz. Yani;
	   ismi ve parametreleri ayni olan iki method body'leri farkli 
	   bile olsa Java onlari ayni method kabul eder.
	   
	 Note: Method Overloading Compile Time Polymorphism'dir.  
	 */

}
