package day25stringbuilder;

public class Sb01 {
	
	/*
	 1)String Class'i "immutable(Degistirilemez)" dir. Java "mutable(Degistirilebilir)" String'ler
	   uretebilmemiz icin "StringBuilder" isimli bir class uretti.
	 2)Java'da "StringBuilder" ile hemen hemen ayni isi yapan bir de "StringBuffer" class'i var.
	   "StringBuffer" class'i "StringBuilder" class'indan daha once uretilmisti.
	   StringBuffer yavas calisan bir class'dir, StringBuilder hizli calisir.  
	   Stringbuffer "synchronize" islemlerini yapabilir ama StringBuilder yapamaz.	   
	 3)Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread" = Yapilan islerin herbiri
	   Multi threading varsa, bu islerin siraya konulmasi lazim. Islerin siraya konulmasina "synchronization" denir. 
	 */

	public static void main(String[] args) {
		
		String str = "Learn";
		concat(str); //LearnX
		//String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir. Bunu iki sebebi var;
		//  1)Java pass-by-value kullanir   2)String Class'i immutable class'dir.
		System.out.println(str);//Learn

	}
	
	public static void concat(String str) {
		System.out.println(str + "X");
	}

}
