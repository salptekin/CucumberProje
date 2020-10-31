package day17constructorsstatickeyword;

public class Insan {
	
	int age;
	String name;
	int height;
	boolean isHonest;
	String job;
	String gender;
	
	/*
	 1) Constructor icinden baska bir constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
	    Aksi takdirde CTE alirsiniz.
	 2) Bir constructor icinden sadece bir tane constructor cagrisi yapabilirsiniz. Cunku 2 tane cagri yaparsaniz
	    birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir. 
	 */
	
	public Insan() {
		this("Nurse", "Erkek"); 
		System.out.println("Parametresiz");	
	}

	public Insan(String name) {
		this();
		System.out.println("Name parametreli");
	}
	
	public Insan(String job, String gender) {
		System.out.println("Job ve Gender parametreli");
	}
	

	public static void main(String[] args) {
		
		Insan i1 = new Insan("Ahmet");
		
	}

}
