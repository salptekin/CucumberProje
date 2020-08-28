package questions;

public class Q43 {

	public static void main(String[] args) {
		
        String s[] = {"X", "Y", "Z", "T", "U", "V"};
        
        for(String w : s) {
        	if(w.equals("Y")) {
        		continue;
        	}
        	
        	System.out.print(w + " ");
        	
        	if(w.equals("T")) {
        		break;
        	}
        	
        	System.out.println("Good");
        }
		

	}

}
