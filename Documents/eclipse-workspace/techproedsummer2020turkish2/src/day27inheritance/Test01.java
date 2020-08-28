package day27inheritance;

class Test01 {

	public void myMethod(int i, int j) {
		System.out.println(i + j);
	}
	
	public void yourMethod(int i, int j) {
		System.out.println(i * j);
	}
}

class Test extends Test01 {
	
	public void myMethod(int i, int j) {
		System.out.println(i - j);
	}
}

class Main {
	
	public static void main(String args[]){
         Test obj = new Test();
         obj.myMethod(12, 4); 
         obj.yourMethod(5, 10);
     }
}
