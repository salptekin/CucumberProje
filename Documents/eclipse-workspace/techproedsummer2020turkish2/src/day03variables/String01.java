package day03variables;

public class String01 {

	public static void main(String[] args) {
		
		String isim = "Suleyman";
		System.out.println(isim);//Suleyman
		
		String soyIsim = "Can";
		
		System.out.println(isim + soyIsim);//SuleymanCan
		System.out.println(isim + " " + soyIsim);//Suleyman Can
		
		//int data type'ine char atamasi yaparsaniz Java o char'in sayi degerini alir
		int ilkKucukHarf = 'a';
		System.out.println(ilkKucukHarf);//97
		
		int koseliParantez = '[';
		System.out.println(koseliParantez);//91
		
		//Iki tane char arasina herhangi bir matematiksel islem koyarsaniz Java
		//o char'larin ASCII degerleri uzerinden islem yapar
		System.out.println('a' + 'b');//Ekrana 97+98 yani 195 yazar
		
		//Illa ki char'lari yanyana yapistirmak isterseniz en basa bos String koyun
		System.out.println("" + 'a' + 'b');//ab

	}

}
