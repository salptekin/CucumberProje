package day24accessmodifierstringbuilder;

public class Sb01 {
	
	/*
	 1) String class her degisim icin yeni bir String olusturur
	    var olan String'i degistirmez. Bu yuzden String'ler "immutable"(Degistirilemez)dir denir.
	    
	    StringBuilder ise degisime aciktir, yeni String olusturmadan var olani degistirmek mumkundur.
	    StringBuilder'lar "mutable"(Degistirilebilir) demektir.
	 */

	public static void main(String[] args) {
		
		//StringBuilder ile String olusturmak icin 3 farkli yol var
		//1. Yol
		StringBuilder stb1 = new StringBuilder();
		System.out.println(stb1);
		
		stb1.append("Java");
		System.out.println(stb1);
		
		stb1.append("Kolaydir");
		System.out.println(stb1);
		
		//2. Yol
		StringBuilder stb2 = new StringBuilder(5);
		stb2.append("Ali");	
		System.out.println(stb2);
		stb2.append("Kazandi");
		System.out.println(stb2);
		
		//3. Yol
		StringBuilder stb3 = new StringBuilder("Java");
		System.out.println(stb3);
		
		/* Soru
		   1)Ucuncu yolu kullanarak bir String olusturun
		   2)Bu Stringe ekleme yapin
		   3)Bu Stringin belli bir bolumunu ekrana yazdirin
		*/
		
		StringBuilder stb4 = new StringBuilder("Java Gercekten Kolay mi?");
        stb4.append("Calisirsan Kolay").append("Hmmmmm");//Method Chain(Zincir)
        System.out.println(stb4);//Java Gercekten Kolay mi?Calisirsan KolayHmmmmm
        System.out.println(stb4.substring(5, 15));//Gercekten
        
        System.out.println(stb4.charAt(3));//a
        
        //delete() Birinci parametre dahil, ikinci parametre dahil degildir.
        System.out.println(stb4.delete(40, 46));//Java Gercekten Kolay mi?Calisirsan Kolay
        
        System.out.println(stb4.getClass());//class java.lang.StringBuilder
        
        System.out.println(stb4.indexOf("Kolay"));//15
        
        stb4.insert(4, ",");
        System.out.println(stb4);//Java, Gercekten Kolay mi?Calisirsan Kolay
        
        System.out.println(stb4.lastIndexOf("a"));//39
        
        System.out.println(stb4.length());//41
        
        stb4.replace(25, 35, "");
        System.out.println(stb4);//Java, Gercekten Kolay mi? Kolay
        
        //String tersten yazdirma loop ile
        String s = "";        
        for(int i = stb4.length()-1; i>=0; i--) {       	
        	s = s + stb4.charAt(i);
        }
        System.out.println(s);//yaloK ?im yaloK netkecreG ,avaJ
        
        //String tersten yazdirma StringBuilder kullanarak
        stb4.reverse();
        System.out.println(stb4);//yaloK ?im yaloK netkecreG ,avaJ
        
        stb4.setCharAt(6, 'X');
        System.out.println(stb4);//yaloK Xim yaloK netkecreG ,avaJ
        
        //capacity() ve length() farki?
        StringBuilder stb5 = new StringBuilder(9);
        stb5.append("Java");
        /*
         Belirlenen kapasiteyi gecerseniz kapasite belirlenen kapasitenin 2 katinin 2 fazlasi 
         olarak yazilir. Belirlenen kapasitenin 2 katinin 2 fazlasini da gecerseniz kapasite ile length
         ayni olur.
         */
        System.out.println(stb5.capacity());//9
        System.out.println(stb5.length());//4
        
        //Onemli Not
        StringBuilder stb6 = new StringBuilder("Java Kolay");
        //StringBuilder class'indan gelen methodlar StringBuilder'i degistirir.
        stb6.append("X");
        System.out.println(stb6);//Java KolayX
        
        //substring() String class'inin methodudur bu yuzden StringBuilder'i update edemez.
        stb6.substring(8);
        System.out.println(stb6);//Java KolayX

	}

}
