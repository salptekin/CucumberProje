package day02variablesscannernt;

public class Increment01 {

	public static void main(String[] args) {
		//Increment: To increase value of a variable
		
		int num1 = 10;
		System.out.println(num1);//10
		//1. Way
		num1 = num1 + 3;
		System.out.println(num1);//13
		
		num1 = num1 + 5;
		System.out.println(num1);//18
		
		//2. Way
		int num2 = 10;
		System.out.println(num2);//10
		
		num2+=3;
		System.out.println(num2);//13
		
		num2+=5;
		System.out.println(num2);//18
		
		//3. Way: If you want to increase by 1, you can use that way
		int  num3  = 10;
		System.out.println(num3);//10
		
		//num3 = num3 + 1; that one works but I will not use it
		//num3+=1; that one works but I will not use it as well
		
		num3++; //You increased num3 by 1
		System.out.println(num3);//11
		
		//Create a double variable increase it by 1 in 3 different ways 
		double num4 = 2.3;
		System.out.println(num4);//2.3
		
		num4 = num4 + 1;
		System.out.println(num4);//3.3
		
		num4+=1;
		System.out.println(num4);//4.3
		
		num4++;
		System.out.println(num4);//5.3
		
		//Increase the value of variable by using multiplication
		int num5 = 2;
		System.out.println(num5);
		
		//1. Way
		num5 = num5 * 3;
		System.out.println(num5);//6
		
		//2. Way
		num5*=7;
		System.out.println(num5);//42
	}
}
