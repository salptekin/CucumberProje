package day34interface;

public class Runner {

	public static void main(String[] args) {
		
		Civic c1 = new Civic();
		c1.hareket();
		c1.benzin();
		c1.koltuk();
		c1.direksiyon();
		c1.ayna();
		c1.far();
		c1.kaporta();
		c1.garanti();
		c1.jant();
		
		//Asagidaki kod CTE verir. Cunku; interfacelerdeki
		//tum variable'lar otomatik olarak "final" olurlar ve
		//final variable'larin degerleri degistirilemez.
		//c1.FIYAT = 30000;
		
		//"fiyat" variable'ina "interface" ismi ile ulasabiliriz. Object uretmeye gerek yok.
		//Demek ki; interface'lerdeki variable'lar "static" dir.
		System.out.println(IcDonanim.FIYAT);
		
		//Interface'deki tum class memberlar "public" dir. Oyle ise;
		//interface'deki variable'lar public + static + final'dir.
		
		//Ayni isimli, ayni data type'li variable'lar parent interface'lerde
		//olusturulabilir. Ama ayni isimli variable'lari object kullanarak
		//cagirirsaniz, Java hangisini sececegine karar veremez ve asagidaki gibi CTE verir.
		//CTE almamak icin ayni isimli variable'lar kesinlikle "interface" isimleri 
		//kullanilarak cagrilmalidir.
		//Zaten interface'lerdeki tum variable static oldugundan dogrusu variable'lari
		//interface ile cagirmaktir. Java staticleri object ile cagirinca sari alt cizgi verir.
		//System.out.println(c1.MARKA);
		
		System.out.println(IcDonanim.MARKA);//Honda
		System.out.println(DisDonanim.MARKA);//Mazda
		System.out.println(Lastik.MARKA);//Audi

	}

}
