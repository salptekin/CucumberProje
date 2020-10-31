package day18staticblockarrays;

public class Test1 {
	
	int x = 10;

	public static void main(String[] args) {
		//Class ismi ile ulasilabilecek variable static variable'dir.
		//Yukaridaki x variable'i static degil, asagidaki x variable'i da local variable'dir.
		//Bu yuzden System.out.println(Test1.x); Compile Time Error verir.
        // System.out.println(Test1.x);
	}
	
	static {
		int x = 20;
		System.out.println(x + " ");
	}

}
