package day03scannerincrementdt;

public class Decrement01 {

	public static void main(String[] args) {
		//Decrement: To decrease the value of a variable
		int num = 10;
		System.out.println(num);//10
		//1. Way
		num = num - 3;
		System.out.println(num);//7
		//2. Way
		num-=2;
		System.out.println(num);//5
		//3. Way: To decrease by 1 use that way
		num--;
		System.out.println(num);//4
		
		int num1 = 12;
		System.out.println(num1);//12
		
		//To increase we can use multiplication as well
		//1. Way
		num1 = num1 * 2;
		System.out.println(num1);//24
		//2. Way
		num1*=3;
		System.out.println(num1);//72
		
		//To decrease we can use division as well
		//1. Way
		num1 = num1/6;
		System.out.println(num1);//12
		//2. Way
		num1/=2;
		System.out.println(num1);//6	
	}
}
