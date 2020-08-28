package day18arrays;
import java.util.Arrays;

public class A01 {
	public static void main(String[] args) {
	
		int arr1[] = new int[3];
		
		//Bir array'i console'a yazdirmak icin Arrays.toString() kullaniriz
		System.out.println(Arrays.toString(arr1));//[0, 0, 0]
		
		//Bir array'e eleman ekleme  
		arr1[2] = 11; // <== Son eleman 11 olsun
        System.out.println(Arrays.toString(arr1));//[0, 0, 11]
        
        arr1[1] = 9;  // <== Orta eleman 9 olsun
        System.out.println(Arrays.toString(arr1));//[0, 9, 11]
        
        arr1[0] = 7;  // <== Ilk eleman 9 olsun
        System.out.println(Arrays.toString(arr1));//[7, 9, 11]
        
        //Bir array'de olmayan index'i kullanmaya calisirsaniz Compile Time Error degil
        //Run Time Error alirsiniz. Yani; kodu calistirdiktan sonra console'da kirmizi 
        //hata mesaji gorursunuz. Kodu yazarken kirmizi alt cizgi almazsaniz.
        //Ornegin; arr1[3] = 13; kod calistiktan sonra "ArrayIndexOutOfBoundsException" hatasi verir.
        
        //Kisa yoldan array olusturup deger atama
        int arr2[] = {8, 10, 12, 14};
        System.out.println(Arrays.toString(arr2));//[8, 10, 12, 14]
        
        //Bir array'deki belli bir elemani ekrana yazdirmak
        System.out.println(arr2[1]);//10
        System.out.println(arr2[3]);//14
        System.out.println(arr2[0]);//8 ==> Ilk eleman her zaman arrayismi[0] ile yazdirilir
        
        // Her array'de son elemani yazdiran kod ne olabilir?
        int arr3[] = {21, 22, 23, 24, 25, 26, 27};
        System.out.println(arr3[arr3.length-1]);//27 ==> Son eleman her zaman arrayismi[length - 1] ile bulunur
        
        //Bir array olusturunuz bu array'in tum elemanlarini for-loop kullanarak ekrana 
        //ayni satirda aralarina bosluk koyarak yazdiriniz
        int arr4[] = {1, 3, 5, 7, 9};
        for(int i=0; i<arr4.length; i++) {
        	System.out.print(arr4[i] + " ");
        }
        
        //Bir array olusturunuz. Bu array'in index'i cift sayi olan elemanlarini while loop
        //kullanarak ekrana ayni satirda ve aralarina bosluk koyarak yaziniz
        int arr5[] = {23, 24, 25, 26, 27, 28, 29};
        
        int i = 0;
        
        System.out.println();
        
        while(i<arr5.length) {
        	if(i%2==0) {
        		System.out.print(arr5[i] + " ");
        	}
        	i++;
        }
	}
}
