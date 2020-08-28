package questions;

class Q26 {
	public static void main(String[] args) {
		Subclass s1 = new Subclass();
		s1.foo(); 
		System.out.println(s1.x);
		
		Super s2 = new Subclass();
		System.out.println(s2.x);
		s2.foo(); 
	}
}

class Super {
	int x = 11;
	public void foo() {    //When I make that private what happens? 
		System.out.println("Super");
	}
}

class Subclass extends Super {
	int x = 12;
	public void foo() {
		System.out.println("Subclass");
	}
}
