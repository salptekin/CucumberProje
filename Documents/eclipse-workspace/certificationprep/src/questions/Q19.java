package questions;

class Q19 {	
	Q19(){
		System.out.println("Good!");
	}
}

class C19 extends Q19 {
	C19(){
		System.out.println("Bad!");
	}
}

class D19 extends C19 {
	
	D19(){
		System.out.println("Ugly!");
	}
	
	public static void main(String[] args) {
		D19 obj = new D19();//?
	}
}

