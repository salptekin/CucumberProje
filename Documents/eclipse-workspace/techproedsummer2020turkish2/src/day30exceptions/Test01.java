package day30exceptions;

public class Test01 {
	@SuppressWarnings({ "finally", "null" })
	public static void main(String[] args) {	
		String result = "";
		String v = null;	
		try {			
			try {
				result = result + "Iyi";
				v.length();
				result = result + "Kotu";			
			}catch(NullPointerException e) {
				result = result + "Cirkin";
				throw new RuntimeException();
			}finally {
				result = result + "Guzel";
				throw new Exception();
			}			
		}catch(Exception e) {
			result = result + "Akilli";
		}     
		System.out.println(result);
	}
}
