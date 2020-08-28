package day26encapsulationdt;

public class E02 {

	public static void main(String[] args) {
		
		E01 obj1 = new E01();
		System.out.println(obj1.retired);//false
		
		System.out.println(obj1.getName());//Suleyman Alptekin
		
		//Before updating salary
		System.out.println(obj1.getSalary());//80000
		
		//Updating salary
		obj1.setSalary(90000);
		
		//After updating salary
		System.out.println(obj1.getSalary());//90000
		
		//Create an object from E03 Class
		E03 obj2 = new E03();
		System.out.println(obj2.getDisease());//Headache
		System.out.println(obj2.isOld());//false

	}

}
