package day33exceptionsdt;

public class E01 {

	public static void main(String[] args) {
		try {		
			divide(12, 0);			
		}catch(ArithmeticException e) {		
			/*
			 System.out.println(e); ==> That prints the name of the exception and the 
			                            reason of the exception
			*/			
			/* 
			 e.printStackTrace(); ==> That prints the name of the exception and the 
			                          reason of the exception and all traces of the exception		  
			*/			
		}
		
		try {
			add();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}	
	public static void divide(int x, int y) {	
		System.out.println(x/y);	
	}
	
	public static void add() {
		throw new RuntimeException("I created that exception");
	}
}
