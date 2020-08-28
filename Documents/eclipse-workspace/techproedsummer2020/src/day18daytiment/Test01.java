package day18daytiment;

public class Test01 {

	public static void main(String[] args) {
		StringBuilder strBld = new StringBuilder("LearnJava");
		
		strBld.delete(5, 9);
		System.out.println(strBld);
		
		strBld.substring(3);
		System.out.println(strBld);
		
		strBld.insert(0,"You");
		System.out.println(strBld);
		
		strBld.reverse();
		System.out.println(strBld);
		
		

	}

}
