package day17foreachloopnt;

public class PassByValue {

	public static void main(String[] args) {
		//When a method wants to use value of a variable, Java creates a copy of the
		//variable value then sends it to the method because of that original value 
		//of the variable remains same. This is called "Pass by Value"
		
		//Some programming languages use pass by reference, if you use pass by refernece
		//methods change the original value
		//See the video ==> https://www.youtube.com/watch?v=7nOy9t791_w
		
		int shirt = 100;
		System.out.println(seniors(shirt));//80
		System.out.println(students(shirt));//90
		System.out.println(disabled(shirt));//85
	}	
	public static int seniors(int shirt) {
		return shirt - 20;
	}
	public static int students(int shirt) {
		return shirt - 10;
	}
	public static int disabled(int shirt) {
		return shirt - 15;
	}
}
