package day13whileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		// for-loop kullanarak 1'den 5'e kadar tamsayilari ekrana yazdiriniz
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		// while-loop kullanarak 1'den 5'e kadar tamsayilari ekrana yazdiriniz
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;	
		}
		
		//while-loop kullanarak 10 dan kucuk sayma sayilarini, ayni satirda, aralarina bosluk koyarak yaziniz
		int k=1;
		while(k<10) {
			System.out.print(k + " ");
			k++;
		}
		
		System.out.println();
		
		//while-loop kullanarak 50 dan kucuk cift sayma sayilarini, ayni satirda, aralarina bosluk koyarak yaziniz
		int m=1;
		while(m<50) {
			if(m%2==0) {
				System.out.print(m + " ");
			}
			m++;
		}
		
		System.out.println();
		
		//while-loop kullanarak "Java kolaydir" Stringini tersten yazdiriniz
		String s = "Java kolaydir";
		
		int n = s.length()-1;
		
		while(n>=0) {
			
			System.out.print(s.charAt(n));
			
			n--;
			
		}
		

	}

}
