package day20inheritancent;

public class Art extends Teacher {
	
	public boolean soccer = true;

	public static void main(String[] args) {
		Science sci = new Science();
		
	}
	
	public void talk() {
		System.out.println("They can speak Spanish");
	}
	
	Art(){
		System.out.println("Art constructor");
	}

}
