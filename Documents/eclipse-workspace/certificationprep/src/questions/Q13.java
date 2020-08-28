package questions;

class Q13 {	
	int x;
	
	Q13(){
		this(11);
	}
	
    Q13(int x){
		this.x = x;
	}
	public static void main(String[] args) { }
}

class C13 extends Q13 {	
	int y;
	C13(){
		this(22);
	}
    C13(int y){
    	super(33);
		this.y = y;
	}
    public String toString() {
    	return super.x + " - " + this.y;
    }
	public static void main(String[] args) { 
		C13 obj = new C13();
		System.out.println(obj);
	}
}
