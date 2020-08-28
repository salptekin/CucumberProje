package questions;

public class Q11 {

	public static void main(String[] args) {     
        sum(5.1, 6.2f);//?
        
        sum(3.2, 4.8);//?
        
        sum(4f, 4);//?
        
        sum(1, 2);//?    
	}
	
	public static void sum(int x, int y) {
		System.out.println("int - int");
	}
	public static void sum(double x, double y) {
		System.out.println("double - double");
	}
	public static void sum(float x, float y) {
		System.out.println("float - float");
	}
	public static void sum(int x, double y) {
		System.out.println("int - double");
	}

}
