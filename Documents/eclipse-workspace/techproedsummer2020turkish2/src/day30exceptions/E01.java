package day30exceptions;

public class E01 {
	
	/*
	 1)Kod yazarken kirmizi alt cizgi almadiginiz halde, kodu calistirdiktan sonra console'da kirmizi mesaj alirsaniz
	   buna 'Run Time Exception' denir. 
	        a) ArithmeticException bir Run Time Exception'dir. B ir sayiyi 0'a biolerseniz bu exception'i alirsiniz.
	        b) null atanmis bir String'in length'ini bulmak isterseniz NullPointerException alirsiniz.
	 */

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		int a = 12;
		int b = 3;
		
		String s1 = "";
		String s2 = null;
		
		try {		
		   System.out.println(a/b);	   
		}catch(ArithmeticException e) {
			
			System.out.println("Bir sayiyi sifira bolemezsiniz");	
		}
		
		System.out.println(s1.length());//0
		System.out.println(s2.length());//NullPointerException

	}

}
