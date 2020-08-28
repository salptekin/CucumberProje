package day21inheritancent;

public class Question {

	public static void main(String[] args) {
		
		int i = 0;
		int x = 2;
		//Post increment
		x = i++;
		System.out.println(x);//0
		System.out.println(i);//1
				
		System.out.println("===========");
		
		int j = 0;
		int y = 2;	
		//Pre increment
		y = ++j;
		System.out.println(y);//1
		System.out.println(j);//1
	}

}
