package day04scanner;

public class IslemOnceligi {

	public static void main(String[] args) {
		
		/*
		       Islem Onceligi:
		 1)Parantez icleri
		 2)Carpma ve bolme (Soldaki once yapilir)
		 3)Toplama ve cikarma (Soldaki once yapilir)
		*/
		
		int a = 12 - 2 * (3 + 6/2) + 1;		
		double b = (5/2)*4 - 3*(1.2);		
		System.out.println(a);//1
		System.out.println(b);//4.4
		System.out.println(a / b);//0.2272727...

	}

}
