package day17staticblock;

public class Sb02 {

	int x = 10;
	 
	public static void main(String[] args) {
        Sb02 obj = new Sb02();
        System.out.print(obj.x);//10

	}
	
	static {
		int x = 20;
		System.out.print(x + " ");//20
	}

}
