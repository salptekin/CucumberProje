package day31exceptions;

public class E02 {

	/*
	 		ArithmeticException
	*/
	public static void main(String[] args) {
		
		int a = 12;
		int b = 3;
		
		try{
			
			System.out.println(a / b);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Sayilar sifira bolunemez");
			
		}finally {
			
			System.out.println("finally block");
			
		}

	}

}
