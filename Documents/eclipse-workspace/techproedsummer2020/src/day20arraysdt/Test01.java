package day20arraysdt;

public class Test01 {

	public static void main(String args[]){
		String input = "Hello Welcome to Merit Campus";
        String[] result1 = input.split(" ");
        String[] result2 = input.split("X");
        System.out.println(result1.length + "-" + result2.length);
    }

}
