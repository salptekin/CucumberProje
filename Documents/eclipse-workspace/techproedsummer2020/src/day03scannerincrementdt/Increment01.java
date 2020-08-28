package day03scannerincrementdt;

public class Increment01 {

	public static void main(String[] args) {
		//Increment: To increase the value of a variable
		
		int num1 = 10;
		System.out.println(num1);//10
		
		//1. Way
		num1 = num1 + 5;
		System.out.println(num1);//15
		
		//2. Way
        num1+=3;
        System.out.println(num1);//18
        
        //3. Way: This way is used for increasing by 1
        num1++;
        num1++;
        System.out.println(num1);//20
	}

}
