package day18daytiment;

public class Varargs01 {

	public static void main(String[] args) {
		// Sometimes we need to use flexible number of parameters in a method
		// Varargs is an array actually but it is flexible in length
		
		/*
		 1)Using more than 1 varargs is not allowed. If you use you will get
		   Compile Time Error 
		 2)Varargs must be the last parameter in a method. If you put a varargs
		   at the beginning or in the middle you will get Compile Time Error 
		 */
		add(); // 0
		add(5);// 5
		add(6, 7);// 13
		add(6, 7, 8, 9, 10, 11);// 51
		
		join('S', 'u', 'l', 'e', 'y', 'm', 'a', 'n');
		
		System.out.println();
		
		count();//0
		count("A", "BC");//2
		count("ABC", "DEFG", "HIJL");//3

	}
	
	//add() method is adding any number of integers
	public static void add(int... x) {
		int sum = 0;
		for(int w : x) {
			sum = sum + w;
		}
		System.out.println(sum);	
	}
	
	//Create a method which accepts chars as arguments then joins the chars
	//and printing the joined chars on the console. Use varargs as parameter 
	public static void join(char... x) {
		for(char w : x) {
			System.out.print(w);
		}
	}
	
	//Create a method which prints the number of arguments
	public static void count(String... s) {
		System.out.println(s.length);
	}

}
