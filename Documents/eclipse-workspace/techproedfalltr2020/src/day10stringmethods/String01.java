package day10stringmethods;

public class String01 {

	public static void main(String[] args) {
		//4.endsWith() ==> String ile calisir, char kabul etmez
		
		String s1 = "Testi al kendini gor";
		
		System.out.println(s1.endsWith("r"));//true
		System.out.println(s1.endsWith("gor"));//true
		System.out.println(s1.endsWith(""));//true
		System.out.println(s1.endsWith("kendini gor"));//true
		System.out.println(s1.endsWith("Testi al kendini gor"));//true
		
		//5.equals()
		System.out.println("Ali".equals("Ali"));//true
		System.out.println("Ali".equals("ALI"));//false
		System.out.println("Ali"=="Ali");//true
		
		//6.equalsIgnoreCase()
		System.out.println("ali".equalsIgnoreCase("ALI"));//true
		
		//7.indexOf() methodu index'i sorulan char'in String icindeki ilk 
		//gorunumunun index'ini return eder.
		
		//indexOf() methodunda hem char hem de String kullanilabilir.
		//indexOf() methodunda birden fazla character'in index'i sorulursa, ilk character'in index'i
		//return edilir.
		System.out.println(s1.indexOf('i'));//4
		System.out.println(s1.indexOf('T'));//0
		System.out.println(s1.indexOf(' '));//5
		System.out.println(s1.indexOf("al"));//6
		//indexOf() methodu olmayan char'lar icin -1 return eder
		System.out.println(s1.indexOf('x'));
		System.out.println(s1.indexOf(""));//0
		
		//8.indexOf()
		String s2 = "Cabuk ogrenilen cabuk unutulur";
		System.out.println(s2.indexOf('a', 6));//17
		System.out.println(s2.indexOf('r', 8));//8
		System.out.println(s2.indexOf("buk", 5));//18
		
		//9.isEmpty() methodundan true aliyorsaniz, o String'in icinde hic bir character yok demektir
		//yani; o String'in length'i 0 demetir.
		
		String s3 = "Tekrar et tekrar unutma";
		
		System.out.println(s3.isEmpty()); //false
		System.out.println("".isEmpty());//true
		
		//10.lastIndexOf() index'i sorulan characterin son gorunumunun index'ini return eder.
		System.out.println(s3.lastIndexOf('e'));//11
		System.out.println(s3.lastIndexOf("rar"));//13
		System.out.println(s3.lastIndexOf('r', 16));//15
		System.out.println(s3.lastIndexOf("k", 14));//12
		
		//11.length() methodu bir String'deki character'lerin sayisini verir.
		System.out.println(s3.length());//23
		
		//12.replace()
		System.out.println(s3.replace('e', 'E'));//TEkrar Et tEkrar unutma
		System.out.println(s3.replace('x', 'M'));//Tekrar et tekrar unutma
		System.out.println(s3.replace("krar", "miz"));//Temiz et temiz unutma
		System.out.println(s3.replace("a", ""));//Tekrr et tekrr unutm
		System.out.println(s3.replace(" ", ""));//Tekrarettekrarunutma
		System.out.println(s3.replace("", "|"));//|T|e|k|r|a|r| |e|t| |t|e|k|r|a|r| |u|n|u|t|m|a|
		
		//13.replaceAll()
		/*
			 Regular Expression(regex): Belli turdeki character'leri secebilmemize yarar
			 1) \\d ==> Tum rakamlar
			    \\D ==> Tum rakam disi characterler
			    
			 2) \\w ==> A->Z    a->z   0->9   _  
			    \\W ==> A->Z    a->z   0->9   _  disindaki hersey
			    
			 3) \\s ==> space 
			    \\S ==> space disindakiler  
		 */
		String s4 = "Code1 yazarak2 ogrenilir3__ ";
		
		System.out.println(s4.replaceAll("\\d", "*"));//Code* yazarak* ogrenilir*
		System.out.println(s4.replaceAll("\\D", "*"));//****1********2**********3
		
		System.out.println(s4.replaceAll("\\w", "*"));//***** ******** ************
		System.out.println(s4.replaceAll("\\W", "*"));//Code1*yazarak2*ogrenilir3__*
		
		System.out.println(s4.replaceAll("\\s", "*"));//Code1*yazarak2*ogrenilir3__*
		System.out.println(s4.replaceAll("\\S", "*"));//***** ******** ************
		
		//14.
		System.out.println(s4.startsWith("C"));//true
		System.out.println(s4.startsWith("c"));//false
		System.out.println(s4.startsWith("Code"));//true
		//s4 String'inin 4.character'i(index 3 demektir) "e" mi?
		System.out.println(s4.startsWith("e",3));//true

	}

}
