package questions;

class Q44 {

	public static void main(String[] args) {
         C44 obj1 = new C44(11);
         C44 obj2 = new C44(12);
         
         System.out.println(obj1);//?
         System.out.println(obj2);//?
	}

}

class C44 {
	
	static int si;
	int i;
	
	C44(int i){
		if(i>si) {
			si = i;
			this.i = i;
		}
	}
	
	public String toString() {
		return si + " - " + i;
	}
	
}
