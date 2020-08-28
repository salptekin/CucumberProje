package day10forloopwhileloopnt;

public class Scope01 {
	
	static int num;
	//If you do not assign any value for an Instance Variable, Java will assign
	//default values. Default value for numbers is 0 every time, for Strings it will be "",
	//for chars it will be ''.

	public static void main(String[] args) {
		/*
		 Scope means where to use a variable
		  
		 1. Rule: If you create a variable out of methods and inside class
		          you can use it inside the class and inside the methods. I mean 
		          you can use it everywhere in class
		          Note: Non-static things cannot be used inside the static things
		 2. Rule: If you create a variable inside a method you cannot use it 
		          outside the method.         
		 3. Rule: If you create a variable inside a method parantheses you can use
		          it just inside the method body. Do not use it outside the method 
		          body   
		 4. Rule: If you want to use a variable, you have to declar first  
		 
		 Note: If a variable is created in a method or in a method parentheses then
		       it is called "Local Variable" 
		 Note: If a variable is created outside the methods inside the class then 
		       they are called "Instance variable"  
		       
		 Note: You have to assign a value for Local Variables but if you want you may not
		       not assign a value for Instance Variables.                                
		*/
		num = num + 3;
	}
	
	public void add() {
		num = num -3;
		char ch;
		//System.out.println(ch);
	}
	public void product() {
		//System.out.println(ch);
		//ch is created inside the add() because of that
		//you cannot use inside the product()
	}
	public void div(int num1, int num2) {
		num1 = num1 / num2;
		//num1 and num2 can be used just inside the div()
	}
	public void sub() {
		//Following code is wrong because declaration must be done first
		//then the variable can be used
		//     x = x - 2;
		//     int x = 5;
	}
	
	
	
	
	

}
