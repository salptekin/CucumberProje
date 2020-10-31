package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		// Ekrana 10 kere "Hi!" yazdirin
//		System.out.println("Hi!");
//		System.out.println("Hi!");
//		System.out.println("Hi!");
//		System.out.println("Hi!");
//		System.out.println("Hi!");
//		System.out.println("Hi!");
//		System.out.println("Hi!");
//		System.out.println("Hi!");
//		System.out.println("Hi!");
//		System.out.println("Hi!");
		
		//Loop(Dongu): Tekrar tekrar ayni seyi yapmak zorunda kaldigimizda ayni kodu bir cok defa yazmak
		//             yerine loop'lari kullaniriz.
		
		//for-loop
		for(int i=1; i<=3; i++) {
			System.out.println("Hi!");	
		}
		
		//100'den 1'e kadar tum tam sayilari ekrana ayni satirda aralarina bosluk koyarak yaziniz
		for(int i=100; i>=1;       i--) {
			System.out.print(i + " ");
		}

	}

}
