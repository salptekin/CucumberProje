package day09switchstringmethods;

public class String01 {

	public static void main(String[] args) {
		
        //1.charAt()
		String s1 = "StudyHardStayHumble";
		
		System.out.println(s1.charAt(0));//S
		//7. characteri ekrana yazdiriniz
		System.out.println(s1.charAt(6));//h
		//Son characteri ekrana yazdiriniz
		System.out.println(s1.charAt(s1.length()-1));
		//Ortadaki characteri ekrana yazdiriniz
		if(s1.length()%2!=0) {
			System.out.println(s1.charAt((s1.length()-1)/2));
		}else {
			System.out.println("Orta character yok");
		}
		//charAt() methodunda olmayan bir index kullandiginizda, programi calistirdiktan
		//sonra ekranda kirmizi hata mesaji alirsiniz.
		//System.out.println(s1.charAt(38));
		
		/*
		 Java'da temelde iki tur hata vardir;
		 1)Compile Time Error: Kod yazarken alinan kirmizi alt cizgiler
		 2)Run Time Error: Yazilan kod calistirildiktan sonra console'da gozuken kirmizi mesajlar
		                   Run Time Error olustugunda sonraki kodlar calistirilmaz. 
		                   Java kod calistirmayi(eXecution) durdurur.
		*/
		
		//2.concat()
		String s2 = "Ogreten ogrenir";
		//String method'lari gecici degisiklik yapar. Orjinal String degismez.
		System.out.println(s2.concat(" tamam mi?"));//Ogreten ogrenir tamam mi?
		System.out.println(s2);//Ogreten ogrenir
		
		//3.contains()
		String s3 = "Java ogren zengin ol";
		//contains() methodu boolean(true/false) return eder
		System.out.println(s3.contains("J"));//true
		System.out.println(s3.contains("x"));//false
		System.out.println(s3.contains("ogren"));//true
		System.out.println(s3.contains("Zengin"));//false
		System.out.println(s3.contains(""));//true
		System.out.println(s3.contains(" "));//true
		
	}

}
