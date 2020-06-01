package day02variablesscannernt;

public class Decrement01 {

	public static void main(String[] args) {
		//Decrement: To decrease the value of a variable
		
		int num1 = 10;
		System.out.println(num1);//10
		
		//1. Way
		num1 = num1 - 3;
		System.out.println(num1);//7
		
		//2. Way
		num1-=2;
		System.out.println(num1);//5
		
		//3. Way: This way is just for decreasing by 1 
		num1--;
		System.out.println(num1);//4
		
		//Create a float variable decrease it by 1 in 3 different ways
		float num2 = 2.3f;
		System.out.println(num2);
		
		num2 = num2 - 1;
		System.out.println(num2);//1.3
		
		num2-=1;
		System.out.println(num2);//0.3
		
		num2--;
		System.out.println(num2);//-0.7
		
		//Create a variable and decrease the value by using division
		double num3 = 8.4;
		System.out.println(num3);
		
		num3 = num3 / 2;
		System.out.println(num3);//	4.2	
		
		num3/=2;
		System.out.println(num3);//2.1
	}
}
