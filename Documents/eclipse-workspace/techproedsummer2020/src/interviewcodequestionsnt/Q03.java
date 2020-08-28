package interviewcodequestionsnt;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Q03 {
	/*
	 Ask user to enter a String.
	 Create a method to see which word is used how many times?
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		
		Map<String,Integer> map = new HashMap<>();
		String a[] = s.split(" ");
		
		for(int i=0; i<a.length; i++) {
			
			if(!map.containsKey(a[i])) {
				map.put(a[i], 1);
			}else {
				map.put(a[i], map.get(a[i])+1);
			}			
		}	
		System.out.println(map);		
	}
}
