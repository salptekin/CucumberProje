package day36interfacesiteratorsdt;

public class Accounting implements Employee {

	public static void main(String[] args) {

	}

	@Override
	public double salary() {
		double task = 5000;
		double education = 500;
		double kids = 200;
		double rate = 80000;
		double salary = task + education + kids + rate; 
		return salary;
	}

	@Override
	public void task() {
		System.out.println("Automation Tester");
		
	}

	@Override
	public void personalInfo() {
		System.out.println("2 kids, master degree");		
	}

}
