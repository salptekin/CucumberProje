package questions;

public class Q48 {

	public static void main(String[] args) {
		
		String cc = "1234567891011121";
		secret(cc);//?

	}
	
	public static void secret(String cc) {
		String scc = "**** - **** - **** - ";
		scc = scc + cc.substring(12);
		System.out.println(scc);
	}

}


