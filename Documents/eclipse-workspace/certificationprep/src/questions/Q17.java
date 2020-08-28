package questions;

class Q17 {	
	String s= "Good";
	int i = 11;	
	Q17(String s, int i){
		this.s = s;
		this.i = i;
	}	
	Q17(){
		
	}
	public static void main(String[] args) {

	}
}
class C17 extends Q17 {	
	String t;	
	C17(String t){
		this.t = t;
	}	
	C17(String s, int i, String t){
		super(s, i);
		this.t = t;
	}
	public static void main(String[] args) {
         C17 obj1 = new C17("Bad");
         C17 obj2 = new C17("Ugly", 33, "Normal");
         System.out.println(obj1.s + obj1.i + obj1.t);//?
         System.out.println(obj2.s + obj2.i + obj2.t);//?
	}
}
