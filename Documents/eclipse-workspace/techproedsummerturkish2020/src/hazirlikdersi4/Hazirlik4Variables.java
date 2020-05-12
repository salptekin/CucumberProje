package hazirlikdersi4;

public class Hazirlik4Variables {
	
	static int maas;
	static char tekHarf; 
	static char sembol;
	
	public static void main(String[] args) {
		
		System.out.println(maas); //Variable degerini ekrana yazdirmak icin cift tirnak kullanma
		                          //Herhangi bir deger atamasi yapmadigim halde, ekrana 0 yazildi. Default value
		
		System.out.println(tekHarf); // char'larin default value'su space oldugu icin ekranda birsey gozukmez
		
		System.out.println(sembol); // $
		
		int sayi=12;
		System.out.println(sayi);//12
		
		//int sayi1=13;
		//int sayi2=14;
		//int sayi3=15;
		//int sayi4=16;
		
		int sayi1=13, sayi2=14, sayi3=15, sayi4=16;
		
		System.out.println(sayi1 + sayi2 + sayi3 + sayi4);// 58
		System.out.println(sayi1*sayi2*sayi3*sayi4);//43680
		System.out.println((sayi1+sayi2) * (sayi3+sayi4));//837

	}
	//Data
	//Variable
	//Variable olusturma
	//Variable a deger verme
	//Default Value
	//Variable'a deger verirken kisa yol
	//Variable kullanmanin sebebi
	//Variable'i main method icinde veya disinda olusturmanin farki
}
