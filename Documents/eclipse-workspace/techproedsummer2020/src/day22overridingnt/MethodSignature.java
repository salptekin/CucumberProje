package day22overridingnt;

public class MethodSignature {

	public static void main(String[] args) {
       /*
        When I tell you method signature you should understand a)Method name 
        b)Parameters. If you want to make methods you have to change method signature
        I mean method names and parameters
        */
	}
	
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	
	public void add1(int x, int y) {
		System.out.println(x+y);
	}
	
	public void add(int x) {
		System.out.println(x);
	}

}
