package questions;

public class Q16 {
	int x, y;
	
	public Q16(int x, int y) {
		initialize(x,y);
	}

	public static void main(String[] args) {
		 int x=2, y=3;
		 
         Q16 obj = new Q16(x,y);
       
         System.out.println(obj.x + " - " + obj.y);//?
         
         System.out.println(x + " - " + y);//?
	}
	
	public void initialize(int x, int y) {
		this.x = x*x*x;
		this.y = y*y*y;
	}

}
