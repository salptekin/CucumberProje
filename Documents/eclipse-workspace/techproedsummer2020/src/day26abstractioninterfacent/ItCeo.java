package day26abstractioninterfacent;

public class ItCeo extends ItDepartment {

	public static void main(String[] args) {
		
		ItCeo emp = new ItCeo();
		emp.applicationForm();//Form is checked it is okay
		emp.salary();//60 hourly
		emp.task();//Task is good according to the application form

	}

	@Override
	public void applicationForm() {
		System.out.println("Form is checked it is okay");
	}

	@Override
	public void task() {
	    System.out.println("Task is good according to the application form");
	}
	
	

}
