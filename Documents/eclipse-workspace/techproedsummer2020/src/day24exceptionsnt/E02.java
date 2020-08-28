package day24exceptionsnt;

public class E02 {

	public static void main(String[] args) {		
		try {
			run();
		}catch(Exception e){
			System.out.println(e.getMessage());//I cannot run
		}
	}
	
	public static void run() {
		throw new RuntimeException("I cannot run");
	}

}
