package day05ifelseifstatementnt;

public class IfElseIf01 {

	public static void main(String[] args) {
		
	/*
	 Type java code by using if-else if() statement, 
     If both of the two integers are positive, output will be the sum of them. 
     If both of the two integers are negative, output will be the multiplication of them.
     Otherwise; output will be “I cannot add or multiply different signed numbers”
	*/	
	//If you have more than 1 if condition, you need to use if-else if() statement
		
		int a = -12;
		int b = 0;
		
		if(a>0 && b>0) {
			System.out.println(a+b);
		}else if(a<0 && b<0) {
			System.out.println(a*b);
		}else{
			System.out.println("I cannot add or multiply different signed numbers");
		}	
	}
}
