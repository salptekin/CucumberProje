package day19encapsulationnt;

public class B {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.getName());//Ali
		obj.setAge(43);
		//For booleans do not look for getStudent() you will find isStudent()
		System.out.println(obj.isStudent());//true
		obj.setStudent(false);
		System.out.println(obj.isStudent());//false
		
		//if you do not want any data to be updated what should you do? 
		//Do not create setters for any data
		//Note: If you do not create any setter, it means no value will be updated.
		//      That kind of classes are called "immutable class"
		
		//If you do not want any data to be read what should you do?
		//Do not create any getters for any data
			
	}

}
