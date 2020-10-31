package day03operations;

public class Operations01 {

	public static void main(String[] args) {
		
		//char'lari int data type'inde bir variable'a atarsaniz Java o char'in 
		//ASCII degerini variable'in icine koyar.
		int harf = 'a';
		System.out.println(harf);//97
		int unlem = '!';
		System.out.println(unlem);//33
		
		//Java matematikteki tum islemleri dogru olarak yapar.
		int a = 10;
		int b = 11;
		int c = 47;
		
		System.out.println(a + b);//21
		
		//int'i int'e boldugunuz zaman sonuc int cikar.
		//Java yuvarlama islemi yapmaz, sonucun tam kismini bolme isleminin sonucu olarak ekrana yazar.
		//Ornegin 47 / 10 isleminin sonucu matematikte 4.7 dir ama Java'da 4 tur.
		System.out.println(c / a); //4
		
		/*
		 Islem Onceligi:
		 1)Parantez ici islemler once yapilir
		 2)Carpma ve bolmeler yapilir
		 3)Toplama ve cikarmalar yapilir
		*/
		
		System.out.println(b + a * c);
		System.out.println(b + (c - 2*b)/2 );
		System.out.println(c - a / (b - c) + a*b);
		
		//Farkli data type'lari ile matematiksel islemler yaparsaniz sonuc buyuk data type'inda verilir.
		//byte < short < int < long < float < double
		int d = 12;
		double e = 4;
		float f = 4f;
		System.out.println(d / e);//3.0
		System.out.println(d + e);//16.0
		System.out.println(e / d);//0.3333333333333333
		System.out.println(f / d);//0.33333334
		
		//Modulus Islemi: Iki ondalik olmayan birbirine bolundugunde kalani verir.
		//                Java'da Modulus isleminin sembolu % dir.
		System.out.println(13 % 5);
		System.out.println(245 % 3);
		
		//Cift Sayi(Even): 2'ye bolundugunde 0 kalaini veren sayilardir
		//Tek Sayi(Odd): 2'ye bolundugunde 1 kalanini veren sayilardir.
		
		System.out.println(12432567 % 2);//Sonuc 1 ise tek sayidir, 0 ise cift sayidir.
		
		//Concatenation: String'leri birlestirmek icin kullanilir. Sembolu "+" dir.
		String s1 = "Java";
		String s2 = "kolaydir.";
		System.out.println(s1 + " " + s2);
		
		int g = 2;
		int h = 3;
		String i = "Java";
		
		System.out.println(i + g + h);//Java23
		System.out.println(i + (g + h));//Java5
		System.out.println(g + h + i);//5Java
		
		//g, h, ve i variable'larini kullanarak 61Java-1
		System.out.println((g*h) + "" + (h-g) + i + (g-h)); 
		
	}

}
