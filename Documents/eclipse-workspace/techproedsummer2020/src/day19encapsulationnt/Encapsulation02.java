package day19encapsulationnt;

public class Encapsulation02 {

	public static void main(String[] args) {
		
		Encapsulation01 obj1 = new Encapsulation01();
		System.out.println(obj1.getSsn());//100003123
		System.out.println(obj1.getDisease());//Cancer
		
		obj1.setDisease("Stomach problem");
		System.out.println(obj1.getDisease());//Stomach problem
		
		obj1.setSsn(111111111);
		System.out.println(obj1.getSsn());//111111111
		
		System.out.println(obj1.getSalary());//200000
		obj1.setSalary(300000);
		System.out.println(obj1.getSalary());//300000
	}

}
