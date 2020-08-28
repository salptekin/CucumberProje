package day20inheritancent;

public class Teacher {
	
	public String collegeName = "Good College";
	protected boolean basketball = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void speak() {
		System.out.println("They can speak English and French");
	}
	
	Teacher(){
		System.out.println("Teacher constructor");
	}

}
