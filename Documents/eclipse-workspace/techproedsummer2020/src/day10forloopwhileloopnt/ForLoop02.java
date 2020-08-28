package day10forloopwhileloopnt;

public class ForLoop02 {

	public static void main(String[] args) {
		//If you do not type increment part in for-loop you will have infinite loop
		//I commented out the following loop to prevent infinite-loop
//		for(int i=0; i<5; ) {
//			System.out.println("Hello");
//		}
		
		//If you do not type condition part again you will get infinite loop
		//I commented out the following loop to prevent infinite-loop
		//for(int i=0; ;i++) {
		//	System.out.println("Hello");
		//}
		
		//If you do not type starting part, you will get Compile Time Error
		//because in starting part you are declaring i, if you do not declar a
		//variable Java cannot use it, and gives Compile Time Error
		//for(;i<5;i++) {
		//	System.out.println("Hello");
		//}
		
		//If you do not type all starting point, condition part, and invcrement part
		//you will get infinite loop as well.
		//I commented out the following loop to prevent infinite-loop
		//for( ; ; ) {
		//	System.out.println("Hello");
		//}
		
	}
}
