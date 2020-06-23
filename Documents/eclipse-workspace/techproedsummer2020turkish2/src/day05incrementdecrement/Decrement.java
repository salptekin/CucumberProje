package day05incrementdecrement;

public class Decrement {

	public static void main(String[] args) {
		// Decrease = Azaltmak(Fiil)   Decrement = Azalis(Isim)
		
		//Decrement 1. Yol
		int s = 12;
		System.out.println(s);//12	
		s = s - 3;
		System.out.println(s);//9
		
		//Decrement 2. Yol
		int t = 22;
		System.out.println(t);//22		
		t -= 3;
		System.out.println(t);//19
		
		//Sadece 1 azaltacaksaniz asagidaki yontemi kullanin
		int u = 32;
		System.out.println(u);//32
		u--;
		System.out.println(u);//31
		
		//Carpma ile increment
		int v = 42;
		v = v * 2;
		System.out.println(v);//84		
		v *= 3;
		System.out.println(v);//252
		
		//Bolme ile decrement
		int y = 52;
		y = y / 2;
        System.out.println(y);//26		
        y /= 2;
		System.out.println(y);//13
		
	}

}
