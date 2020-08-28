package day20inheritancent;

class C {
	public int x = 11;
    public void m() { System.out.println("Good"); }
}
class B extends C {
	public int x = 12;
    public void m() { System.out.println("Bad"); } 
}
public class A extends B {
	//Note: If the names of variables are same then output 
	//      depends on the Data Type.
	
	//Note: If the methods of variables are same then output 
	//      depends on the Constructor.
	public static void main(String[] args) {
	        B b = new B();
	        b.m();
	        System.out.println(b.x);
	        
	        C c = new B();
	        c.m();
	        System.out.println(c.x);
	        
	        C d = new C();
	        d.m();
	        System.out.println(d.x);
	}
}
