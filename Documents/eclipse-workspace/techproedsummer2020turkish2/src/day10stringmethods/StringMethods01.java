package day10stringmethods;

public class StringMethods01 {
	
	public static void main(String[] args) {
		
		String s = "Java ah Java!";
		
		//1. Method charAt() methodu
		//charAt() methodu String istedigimiz character'i index kullanarak 
		//secip almaya yarar
		System.out.println(s.charAt(0));//J
		System.out.println(s.charAt(8));//J
		System.out.println(s.charAt(12));//!
		
		/* Note:Bazen kod yazarken kirmizi alt cizgi aliriz bu hata yapiyoruz demektir.
		        Java'da kirmizi alt cizgi veren hatalara "Compile Time Error" 
		        
		   Note: Bazen de Compile Time Error almayiz, kodu calistirdiktan sonra 
		         console'da kirmizi mesajlar aliriz. Bu mesajlar da hata yaptigimiz
		         anlamina gelir. Bu hatalar kod run edildikten sonra alindigi icin
		         "Run Time Error" olarak adlandirilir 
		   Note: charAt() methodunda var olmayan bir index kullanirsaniz Run Time Error
		         alirsiniz. Ekranda "StringIndexOutOfBoundsException" mesajini gorursunuz.           	  
	    */	
		// System.out.println(s.charAt(13));
		
		//2. Method contains() methodu
		// contains() methodu bir String'de herhangi bir character veya characterlerin
		// olup olmadigini kontrol etmek icin kullanilir. Varsa true, yoksa false return eder.
		// contains() methodunda String kullanilir.
		String t = "Hayat ah hayat!";
		System.out.println(t.contains("y"));//true
		System.out.println(t.contains("w"));//false
		System.out.println(t.contains("yat"));//true
		System.out.println(t.contains("Ayat"));//false
		
		//3. Method endsWith() methodu
		//endsWith() methodu bir String'in hangi character veya characterler ile bittigini
		//kontrol eder. True veya false return eder.
		String u = "Guzel Gunler!";
		System.out.println(u.endsWith("Guzel Gunler!"));//true
		System.out.println(u.endsWith("ler!"));//true
		System.out.println(u.endsWith("X"));//false
		
		//4. Method length() methodu
		//length() methodu bir String'deki characterlerin sayisini bulmaya yarar
		String v = "Hey gidi gunler!";
		System.out.println(v.length());//16
		String v1 = " ";//Cift tirnak arasinda gorunmeyen space character'i var
		System.out.println(v1.length());//1
		String v2 = "";//Cift tirnak arasinda hicbirsey yok
		System.out.println(v2.length());//0
		
		//5. Method toUpperCase() methodu
		String y = "Maske takiniz!";
		System.out.println(y.toUpperCase());//MASKE TAKINIZ!
		
		//6. Method toLowerCase() methodu
		String z = "Evde Kal!";
		System.out.println(z.toLowerCase());//evde kal!
		
		//7. Method replace();
		//replace() methodu bir String'deki bir veya birden fazla characterin yerine 
		//baska bir character yazmaya yarar. Dikkat edin secilen characterlerin tamamini
		//degistirir.
		String a = "Bir seyler oldu!";
		System.out.println(a.replace("Bir", "Cok"));
		System.out.println(a.replace("e", "a"));
		System.out.println(a.replace("!", "."));
		System.out.println(a.replace("oldu", "de olmadi"));
		
		//replace() methodunda char da kullanilbilir
		System.out.println(a.replace('r', 'n'));
		//replace() methodu kullanarak istenilen bir characterin tamami Stringden
		//silinir.
		System.out.println(a.replace("e", ""));
		
		//8. Method replaceAll();
		/* replaceAll() methodu replace() methodu ile ayni isi yapar. 
		   Farklari: 1)replaceAll() methodu char kabul etmez, sadece String
		               ve regex (Regular Expressions) kullanir.
		             2)replace() methodu regex kabul etmez, sadece char ve String
		               kabul eder.  
		 */
		System.out.println("====>");
		String b = "Ali 12 ?_";
		// ==> \\d ifadesi tum rakamlar(digit) anlamindadir ==> 0,1,2,3,4,5,6,7,8,9
		System.out.println(b.replaceAll("\\d", "*"));//Java **** ?!@$_		
		// ==> \\D ifadesi rakamlar disindaki hersey demektir
		System.out.println(b.replaceAll("\\D", "*"));//*****1257******
		
		// ==> \\S ifadesi space disindaki hersey demektir
		System.out.println(b.replaceAll("\\S", "*"));//**** **** ***** 		
		// ==> \\s ifadesi space demektir
		System.out.println(b.replaceAll("\\s", "*"));//Java*1257*?!@$_
		// Space'leri degistirmek replace() ile de mumkun
		System.out.println(b.replace(" ", "*"));//Java*1257*?!@$_
		
		// ==> \\w ifadesi (word --> kelime ve harf) ==> a-->z ve A-->Z ve 0-->9 ve _
		System.out.println(b.replaceAll("\\w", "*"));//**** **** ?!@$*		
		// ==> \\W ifadesi a-->z ve A-->Z ve 0-->9 ve _ disindaki hersey
		System.out.println(b.replaceAll("\\W", "*"));//Java*1257*****_
		
		System.out.println(b.replaceAll("Java", "Ali"));//Ali 1257 ?!@$_

	}

}
