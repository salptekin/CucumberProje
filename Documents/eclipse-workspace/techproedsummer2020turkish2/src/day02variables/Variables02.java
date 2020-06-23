package day02variables;

public class Variables02 {

	public static void main(String[] args) {
		
		int fiyat = 500;
		System.out.println(fiyat);//500
		System.out.println("fiyat");//fiyat
		
		//Iki tane tamsayi variable olusturun ve onlarin toplamini ekrana yazdirin.
		int ekmek = 3;
		int peynir = 21;
		System.out.println(ekmek + peynir);//24
		
		//Bir tane boolean bir tane de char variable olusturun, deger atamasi yapin
		//ve degerlerini ekrana yazdirin
		boolean yasli = true;
		System.out.println(yasli);//true
		
		char ilkHarf = 'S';
		System.out.println(ilkHarf);//S
		
		//Asagida verilen data type'lerinde variable'lar olusturunuz
		//1 byte -128 den 127 e kadar
		byte yas = 83; //-128'den kucuk ve 127'den buyuk sayilar kullanirsaniz
		               // kirmizi alt cizgi uyarisi alirsiniz
		System.out.println(yas);//83
		
		//2 short
		short nufusKoy = 23000;
		System.out.println(nufusKoy);//23000
		
		//3 int
		int hazinePara = 32345678;
		System.out.println(hazinePara);
		
		//4 long
		long hazinePara2 = 123456789;
		System.out.println(hazinePara2);
		
		//5 float
		float borc = 12.53f;//floatlarda son tarafa 'f' veya 'F' koymazsaniz hata verir.
		
		//6 double
		double borc2 = 12.53;//double'larda son tarafa 'd' veya 'D' yazma zorunlulugu yoktur.

	}
}
