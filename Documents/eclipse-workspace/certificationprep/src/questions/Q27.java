package questions;

public class Q27 {
	
	public static void main(String[] args) {
		try {
			
			throw new ArithmeticException("Hello ");
			
		} catch (Exception e) {
			
			System.out.print(e.getMessage());
			
		}
//		catch (ArithmeticException e) { // Why is it complaining?
//			
//			System.out.print(e.getMessage());
//			
//		} 
		finally {
			
			System.out.println("World");
			
		}
	}
}
