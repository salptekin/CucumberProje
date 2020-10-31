package day38collectionsmaps;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProje {

	public static void main(String[] args) {
		/*
		 saveInfo() method olusturun:
		 1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
		 2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
		 3)Ayni kimlik numarasi ile bilgi girilmesine engel olun.
		 
		 getInfo() method olusturun:
		 1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
		 2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.
		 
		 removeInfo() method olusturun:
		 1)Kimlik numarasini girerek data silin.
		 2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
		 3)Collection bos ise kullaniciya hata mesaji verin.
		 
		 selectOption() method olusturun:
		 1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
		*/
		HashMap<String, String> person = new HashMap<>();
		int option = -1;
		selectOption(option, person);
		

	}
	
	public static void saveInfo(HashMap<String, String> person) {
		Scanner scan = new Scanner(System.in);
		String id = "";

		do {
			
			System.out.println("Kimlik numarasini giriniz.");
			System.out.println("Bilgi girisini durdurmak icin 'Q' tusuna basiniz");
			id = scan.next();
			if(id.equals("Q")) {
				break;
			}else if(person.keySet().contains(id)) {
				System.out.println("Var olan bir id eklenemez.Lutfen tekrar deneyiniz.");
				System.out.println("Kimlik numarasini giriniz.");
				System.out.println("Bilgi girisini durdurmak icin 'Q' tusuna basiniz");
				id = scan.next();
			} 
			scan.nextLine();
			
			System.out.println("Isminizi giriniz");
			String name = scan.nextLine(); 
			 
			System.out.println("Adresinizi giriniz");
			String address = scan.nextLine();
			
			System.out.println("Telefon numaranizi giriniz");
			String telNo = scan.nextLine(); 
			
			String info = "Name: " + name + "\nAddress: " + address + "\nPhone: " + telNo + "\n";
			
			person.put(id, info);

		}while(true);
		
		System.out.println(person);
	}
	
	public static void removeInfo(HashMap<String, String> person) {
		Scanner scan = new Scanner(System.in);
		String id = "";

		do {		
			System.out.println("Data silmek icin kimlik numarasini giriniz.");
			System.out.println("Silme islemini durdurmak icin 'Q' tusuna basiniz");
			id = scan.next();
			if(id.equals("Q")) {
				break;
			}
			scan.nextLine();
			
			if(person.keySet().isEmpty()) {
				System.out.println("There is no any data");
				break;
			}else if(person.keySet().contains(id)) {
				String removedData = person.remove(id);
				System.out.println("Removed: " + removedData);
			}else {
				System.out.println(id + " does not exist.\nPlease use a valid id.");
			}

		}while(true);
		
		System.out.println(person);
	 }
	
	public static void getInfo(HashMap<String, String> person) {
		Scanner scan = new Scanner(System.in);
		String id = "";

		do {		
			System.out.println("Data goruntulemek icin kimlik numarasini giriniz.");
			System.out.println("Goruntuleme islemini durdurmak icin 'Q' tusuna basiniz");
			id = scan.next();
			if(id.equals("Q")) {
				break;
			}
			scan.nextLine();
			
			if(person.keySet().isEmpty()) {
				System.out.println("Herhangi bir data yok");
				break;
			}else if(person.keySet().contains(id)) {
				String data = person.get(id);
				System.out.println(id + ":\n" + data);
			}else {
				System.out.println(id + " yok.\nLutfen gecerli bir id giriniz.");
			}

		}while(true);
		
		System.out.println(person);
	}
	
	public static void selectOption(int option, HashMap<String, String> person) {
		Scanner scan = new Scanner(System.in);

		do {		
			System.out.println("Asagidakilerden birini seciniz:");
			System.out.println("1: Data ekle\n2: Data goruntule\n3: Data sil");
			System.out.println("Programi sonlandirmak icin '0' tusuna basiniz");
			option = scan.nextInt();
			if(option == 0) {
				break;
			}
			scan.nextLine();
			
			if(option==1) {
				saveInfo(person);
			}else if(option==2) {
				getInfo(person);
			}else if(option==3){
				removeInfo(person);
			}

		}while(true);
		
		System.out.println(person);
	}
	
	
	
	
	
	
	
	
	
	

}
