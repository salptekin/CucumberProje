package day03operations;

public class IncrementDecrement {

	public static void main(String[] args) {
		/*
		 Increment:Bir variable'in degerini toplama veya carpma kullanarak artirmaya denir.
		*/
		int i1 = 12;
		System.out.println(i1);//12
		
		//1.Yol
		i1 = i1 + 5; 
		System.out.println(i1);//17
		//i1'in degerini 8 artirin
		i1 = i1 + 8;
		System.out.println(i1);//25
		
		//2.Yol: Recommended
		i1 += 10;
		System.out.println(i1);//35
		//i1'i 2. yolu kullanarak 5 artirin
		i1 += 5;
		System.out.println(i1);//40
		
		//3.Yol: Sadece 1 artirmak istenildiginde kullanilir
		i1++;
		System.out.println(i1);//41
		
		int i2 = 3;
		System.out.println(i2);//3
		i2 = i2 * 4;
		System.out.println(i2);//12
		i2 *= 2;
		System.out.println(i2);//24
		
		/*
		 Decrement: Bir variable'in degerini cikarma veya bolme yaparak azaltmak demektir.
		*/
		int k = 12;
		System.out.println(k);//12
		
		//k'nin degerini 1. yolla 3 azaltin 
		k = k - 3;
		System.out.println(k);//9
		
		//k'nin degerini 2. yolla 5 azaltin 
		k -= 5;
		System.out.println(k);//4
		
		//k'nin degerini 3. yolla 1 azaltiniz
		k--;
		System.out.println(k);//3
		
		int m = 12;
		System.out.println(m);//12
		
		//Bolme kullanarak 1. yolla yarisina indirin
		m = m / 2;
		System.out.println(m);//6
		
		//Bolme kullanarak 2. yolla yarisina indirin
		m /= 2;
		System.out.println(m);//3

	}

}
