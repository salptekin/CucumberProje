package day35interfaceiterators;

public class Runner implements I01{

	public static void main(String[] args) {
		
		//multiply() methodu "static" keyword ile olusturuldugundan 
		//ulasmak icin sadece interface ismi yeterlidir.
		System.out.println(I01.multiply());//12
		
		
		//add() methodu "default" keyword kullanilarak olusturuldugundan
		//ulasmak icin mecburen object uretmelisiniz. Object uretmeden
		//ulasmaniz mumkun degildir.
		I01 obj = new Runner();
		System.out.println(obj.add());//2
		
		/*
		 Concrete bir class, bir interface'in child class'i oldugunda interface'deki
		 tum abstract methodlari override etmek zorundadir. Fakat bu zorunluluk
		 "default" ve "static" keyword'ler kullanilarak olusturulan concrete method'lar
		 icin yoktur. 
		 
		 Burada gordugunuz gibi, add() ve multiply() method'larini override etmedik cunku
		 oyle bir zorunluluk yok ama istersek override edebiliriz.
		*/

	}

}
