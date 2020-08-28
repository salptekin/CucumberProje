package day20arraysdt;

public class Test02 {

	public static void main(String[] args) {
		String phoneNumber = "+1-407-640-1256";
		
		//Which ones print 407 on the console
		System.out.println(phoneNumber.substring(3, 6));
		
		String arr[] = phoneNumber.split("-");
		System.out.println(arr[1]);

	}

}
