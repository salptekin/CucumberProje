package questions;

public class Q45 {
	
	static int si;
	int i;

	public static void main(String[] args) {
		
         Q45 obj1 = new Q45();
         Q45 obj2 = new Q45();
         obj1.m();
         obj2.m();
         
         System.out.println(si + " - " + obj1.i);//?
         
         System.out.println(si + " - " + obj2.i);//?
         
         System.out.println(obj1.si + " - " + obj1.i);//?
         
         System.out.println(obj2.si + " - " + obj2.i);//?
		
	}
	
	public void m() {
		while(i<3) {
			i++;
			si++;
		}
	}

}
