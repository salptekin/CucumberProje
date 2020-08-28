package day19arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		
		int arr[] = {3, 7, 1, 18};
		System.out.println(Arrays.toString(arr));//[3, 7, 1, 18]
		
		//Array elemanlarini kucukten buyuge siralayalim(sort)
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//[1, 3, 7, 18]
		
		//Bir String array olusturun elemanlarini alfabetik sirada dizin
		String srr[] = {"Ali", "Veli", "Can", "Fadime"};
		Arrays.sort(srr);
		System.out.println(Arrays.toString(srr));//[Ali, Can, Fadime, Veli]
		
		//Bir integer array'deki en buyuk ve en kucuk sayiyi ekrana yazdiran code yaziniz
		int irr[] = {13, 9, 6, 18, 23, 7, 11};
		Arrays.sort(irr);
		System.out.println(Arrays.toString(irr));//[6, 7, 9, 11, 13, 18, 23]
		System.out.println("En kucuk: " + irr[0]);
		System.out.println("En buyuk: " + irr[irr.length-1]);
		
		//Bir String array olusturun alfabetik siraya bastan ve sondan 
		//ikinci elemanlari ekrana yazdirin
		String krr[] = {"Ali", "Veli", "Can", "Fadime"};
		Arrays.sort(krr);
		System.out.println(Arrays.toString(krr));//[Ali, Can, Fadime, Veli]
		System.out.println(krr[1]);//Can
		System.out.println(krr[krr.length-2]);//Fadime
		
		//Bir elemanin array'de var olup olmadigini kontrol etmek
		int nrr[] = {2, 1, 7, 3, 5};
		
		//nrr array'inde 7 elemaninin var olup olmadigini kontrol ediniz 
		
		//1. Yol: Loop ile
		int count = 0;		
		for(int i=0; i<nrr.length; i++) {
			if(nrr[i]==7) {
				count++;
			}
		}			
		if(count!=0) {
			System.out.println("7 eleman olarak var");
		}else {
			System.out.println("7 eleman olarak yok");
		}
		
		//2. Yol: binarySearch() kullanarak
		  //==> a)Once kesinlikle sort() kullanmalisiniz
		Arrays.sort(nrr);//[1, 2, 3, 5, 7]
		  //==> b)Aradiginiz eleman array'de varsa binarySearch() size o elemainin 
		  //      index'ini verir
	    System.out.println(Arrays.binarySearch(nrr, 7));//4
	    /*
	     binarySearch() methodu eleman array'de var oldugunda asla negatif bir output vermez.
	     binarySearch() methodu eleman array'de yoksa negatif bir output verir.
	    */
	    System.out.println(Arrays.binarySearch(nrr, 6)); 
	    // -5 verir ==> "-" nin anlami yok demek
	    //          ==> "5" in anlami; 6 eleman olarak bulunsaydi 5'inci eleman olurdu demek
		
	    System.out.println(Arrays.binarySearch(nrr, 4));//-4
	    System.out.println(Arrays.binarySearch(nrr, 99));//-6
	    
	    //Note: Bir array'de tekrarli elemanlar varsa binarySearch() methodu elemainin
	    //      var olup olmadigi hakkinda dogru karar verebilir ama o elamin sirasi hakkinda
	    //      bazen yanilir. 
	    int mrr[] = {1, 3, 8, 3, 11};
	    Arrays.sort(mrr);//[1, 3, 3, 8, 11]
	    System.out.println(Arrays.binarySearch(mrr, 3));//1 veya 2 ama kesin sonuc yok

	}

}
