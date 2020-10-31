package day18staticblockarrays;

import java.util.Arrays;

public class Arrays01 {

	int x = 12;
	
	/*
	 1)Array'ler birden fazla degeri depolamak icin kullanilabilir.
	 2)Array'lere konulan degerlerin data type'lari ayni olmalidir.
	 3)Array olustururken mutlaka kac eleman yerlestirecegimizi belirtmemiz gerekir.
	 4)Array'lerde sadece a)primitive ve b)reference'lar depolanabilir.
	 */
	
	public static void main(String[] args) {
		//Array olusturmak
		int a[] = new int[4];
		
        //Array'i console'a yazdirmak
		System.out.println(Arrays.toString(a));//[0, 0, 0, 0]
		
		//Array'e eleman eklemek
		a[0] = 8;
		System.out.println(Arrays.toString(a));//[8, 0, 0, 0]
		a[2] = 15;
		System.out.println(Arrays.toString(a));//[8, 0, 15, 0]
		a[3] = 8;
		System.out.println(Arrays.toString(a));//[8, 0, 15, 8]
		a[1] = 23;
		System.out.println(Arrays.toString(a));//[8, 23, 15, 8]
		
		//Array'de kac eleman oldugunu bulmak
		//String'lerde kullandigimiz length() dir, Array'lerde kullandigimiz length.
		System.out.println(a.length);//4
		
		//String array olusturunuz.
		String b[] = new String[3];
		System.out.println(Arrays.toString(b));//[null, null, null]
		b[0] = "Ali";
		System.out.println(Arrays.toString(b));//[Ali, null, null]
		b[1] = "Ayse";
		System.out.println(Arrays.toString(b));//[Ali, Ayse, null]
		b[2] = "Kemal";
		System.out.println(Arrays.toString(b));//[Ali, Ayse, Kemal]
		
		//Bir array'den specific bir elemani yazdirmak
		System.out.println(b[2]);//Kemal
		System.out.println(b[0]);//Ali
		System.out.println(b[1]);//Ayse
		
		//Array'deki elemanlari 1'er 1'er ekrana yazdirmak
		//b array'indeki elemanlari alt alta console'a yazdiriniz
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		//a array'indeki elemanlari ayni satira onlerine "*" koyarak tersten yazdiriniz
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(" *" + a[i]);
		}
		
		System.out.println();
		
		//a array'inde index'i cift olan elemanlari yazdiriniz
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
		
		//Array'deki elemanlari kucukten buyuge(ascending order) siralamak
		
		//a array'indeki elemanlari kucukten buyuge siralayiniz
		Arrays.sort(a);//[8, 8, 15, 23]
		System.out.println(Arrays.toString(a));//[8, 8, 15, 23]
		
		//sort() methodunu b array'i icin kullaniniz.
		//String array'lerde sort() methodu alfabetik siralama yapar.
		//Java'da kucukten buyuge siralama ve alfabetik siralama yerine "Natural Order"
		//kullanilir.
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));//[Ali, Ayse, Kemal]

	}

}
