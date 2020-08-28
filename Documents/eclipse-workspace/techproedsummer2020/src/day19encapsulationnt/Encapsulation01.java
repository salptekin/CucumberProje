package day19encapsulationnt;

public class Encapsulation01 {
	
	private int ssn = 100003123;
	private String disease = "Cancer";
	private double salary = 200000;

	public static void main(String[] args) {
		/* 
		  What is encapsulation?
		  Encapsulation is data hiding
		  
		  How do you do encapsulation?
		  I make the variables "private"
		  
		  How do you update encapsulated data from other classes?
		  I create setter() methods to update encapsulated data
		  
		  How do you read encapsulated data from other classes?
		  I create getter() methods to read encapsulated data

		*/
	}
	
	public int getSsn() {
		return ssn;
	}
	
	public String getDisease() {
		return disease;
	}
	
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
