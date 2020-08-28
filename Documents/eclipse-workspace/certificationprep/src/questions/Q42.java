package questions;

public class Q42 {
	
	String s;
	double d;
	boolean b;
	
	Q42(String s, double d){
		this.s = s;
		this.d = d;
	}	
	Q42(String s, double d, boolean b){
		this.s = s;
		this.d = d;
		this.b = b;
	}
	public static void main(String[] args) {
		Q42 obj1 = new Q42("John", 300);
		System.out.println(obj1);//?
		
		Q42 obj2 = new Q42("Mark", 100, true);
		System.out.println(obj2);//?
		
		//Why is it complaining when I uncomment?
//		Q42 obj3 = new Q42();
//		System.out.println(obj3);//?

	}	
	public String toString() {
		return s + " ==> " + d + " ==> " + b;
	}

}
