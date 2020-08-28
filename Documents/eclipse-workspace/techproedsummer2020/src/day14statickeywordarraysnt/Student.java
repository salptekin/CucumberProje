package day14statickeywordarraysnt;

public class Student {

	int number;
	String name;
	static String college= "ITS";
	
	Student(int r, String n, String college){
		//For instance variables using this or not-using this is same
		this.number= r;
		this.name = n;
		//But for static variables if you do not use this it is not changing the variable
		this.college = college;
	}

	public static void main(String[] args) {
		Student s1 = new Student (111, "Karan", "MIT");
		Student s2 = new Student (222, "Aryan", "Harvard");
		
		System.out.println(s1.number);
		System.out.println(s2.number);
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		System.out.println(s1.college);
		System.out.println(s2.college);
	}

}
