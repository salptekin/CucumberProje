package day24varargsaccessmodifiersdt;

public class MyClass {
	
	int x;
	static int y;
	
	MyClass(int i){
		x = x + i;
		y = y + i;
	}

	public static void main(String[] args) {
		new MyClass(2);
		MyClass mc = new MyClass(3);
		System.out.println(mc.x + "," + mc.y);

	}

}
