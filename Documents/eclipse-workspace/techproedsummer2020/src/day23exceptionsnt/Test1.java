package day23exceptionsnt;

public class Test1 {
	
	public static void main(String[] args) {

		try {
			int a = 0;
			System.out.println("Hi");
			int b = 20 / a;
			System.out.println("How are you?");
		}

		catch (ArithmeticException e) {
			System.out.println("Good");
		}

		finally {
			System.out.println("Bad");
		}
	}
}
