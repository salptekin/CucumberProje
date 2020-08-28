package day11stringmethodsforloopdt;

public class StringMethods01 {

	public static void main(String[] args) {
		// 11. startsWith() methodu ilk characteri kontrol eder.
		String a = "Hadi gidelim bu diyardan!"; 
		
		System.out.println(a.startsWith("H"));//true
		System.out.println(a.startsWith(""));//true
		System.out.println(a.startsWith("Hadi"));//true
		
		System.out.println(a.startsWith("g", 5));//true
		System.out.println(a.startsWith("i", 7));//false
		System.out.println(a.startsWith("", 6));//true
		
		//12. indexOf() methodu ilk gorunumun indexini verir.
		// indexOf() methodunda hem String hem de char da kullanilabilir.
		System.out.println(a.indexOf("i"));//3
		System.out.println(a.indexOf('d'));//2
		//Birden fazla character kullanirsaniz Java ilk harfin index'ini return eder
		a.indexOf("deli");//7
		//Olmayan bir character icin indexOf() kullanirsaniz Java "-1" return eder
		System.out.println(a.indexOf("x"));//-1
		System.out.println(a.indexOf("diyer"));//-1
		System.out.println(a.indexOf('w'));//-1	
		
		System.out.println(a.indexOf("d", 4));//7
		System.out.println(a.indexOf("a", 9));//19
		System.out.println(a.indexOf('e', 8));//8
		
		//13. lastIndexOf() methodu son gorunumun index'ini verir
		String b = "Java ah Java!";	
		System.out.println(b.lastIndexOf("v"));//10
		//Birden fazla character kullanirsaniz son gorunumu bulur onun icindeki
		//character'lerden ilkinin index'ini return eder.
		System.out.println(b.lastIndexOf("av"));//9
		
		//14. substring() bir String'in belli bir bolumunu kesip almaya yarar (ONEMLI)
		String c = "Karakartal";
		//Sadece kartal kelimesini ekrana yazdirin
		System.out.println(c.substring(4));//kartal
		//Ekrana "arakartal" yazdirin
		System.out.println(c.substring(1));//arakartal
		//Ekrana "kar" yazdirin
		//substring() methodunda iki sayi kullanirsaniz ilk sayi dahil ikinci sayi haric olur
		System.out.println(c.substring(4, 7));//kar
		//substring() methodu ile ilk harfi almak icin substring(0, 1) yazariz
		System.out.println(c.substring(0, 1));//K
		//Baslangic ve bitis index'lerini ayni yaparsaniz hicbirsey almis olursunuz
		System.out.println(c.substring(2, 2));//""
		//subtring() methodunda baslangic index'i bitis index'inden buyuk olamaz.
		//Oyle yazarsaniz Run Time Error alirsiniz
		//System.out.println(c.substring(5, 3));
		
		//15. trim() methodu bir String'in bas ve son taraflarindaki space'leri siler. Dikkat
		//edin aradakileri degil sadece bas ve sondakileri siler.
		String d = "  Java iyidir   ";
		System.out.println(d.length());//16
		System.out.println(d.trim().length());//11

	}

}
