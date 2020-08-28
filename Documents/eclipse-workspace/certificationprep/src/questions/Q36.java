package questions;

class C36{
	
	public int i;
	
	public C36(int i){
		this.i = i;
	}
	
	public int m1() {
		return i;
	}
	
	public  void m2(int k) {
		i = i * k;
		System.out.println(i);
	}
}

class Q36 extends C36 {

	public Q36(int i) {
		  super(i);
          this.i = i;
	}

	public static void main(String[] args) {
		C36 obj = new C36(600);
		obj.m2(3); //?
	}

}
