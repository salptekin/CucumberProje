package questions;

class Q08 {
	
	int x;
	
	Q08(int x){
		this.x = x;
	}

	public static void main(String[] args) {
	}
}

class C08 extends Q08{
	int y;
	C08(int x, int y){ //Why is it complaining when you comment line 18?
        super(x);
		this.y = y;
	}
	
	public static void main(String[] args) {
		C08 obj = new C08(11, 22);
	}
}







