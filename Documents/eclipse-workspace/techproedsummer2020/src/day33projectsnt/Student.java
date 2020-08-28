package day33projectsnt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;

	//Constructor prompt user to enter students name and year 
	public Student() {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter student's first name" );
		this.firstName = scan.nextLine();
		
		System.out.println("Enter student's last name" );
		this.lastName = scan.nextLine();
		
		System.out.println("Enter student's class level:\n 1 - Freshmen\n 2 - Sophmore\n 3 - Junior\n 4 - Senior" );
		this.gradeYear = scan.nextInt();
		
		setStudentId();	

	}
	
	//Generate an Id
	private void setStudentId() {
		//Grade level + Id
		id++;
		this.studentId = gradeYear + "" + id;
	}
	
	//Enroll in course
	public void enroll() {
		//Get inside a loop, user hits 0
		do{
			Scanner scan = new Scanner(System.in); 
			System.out.println("Enter course to enroll (Q to quit)");
		    String course = scan.next();
		    if(!course.equals("Q")) {
			   courses = courses + "\n" + course;
			   tuitionBalance = tuitionBalance + costOfCourse;
		    }else {
			   break;
		    }

		}while(1!=0);    
		System.out.println("Enrolled in: " + courses);

	}
	
	//View balance and pay tuition
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	public void payTuition() {
		viewBalance();
		Scanner scan = new Scanner(System.in);
		System.out.println("How much do you want to pay?");
		int payment = scan.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thanks for payment of $" + payment);
		viewBalance();

	}

	//Show status
	public String toString() {
		return  "STUDENT ID: " + studentId +
				"\nNAME: " + firstName + " " + lastName + 
				"\nGRADE LEVEL: " + gradeYear +
				"\nCOURSES ENROLLED: " + courses + 
				"\nBALANCE: " + tuitionBalance;
	}
	
	//Add students info to a HashMap
	static Map<String, String> studentInfo = new HashMap<>();	
	
	public static void createStudentDatabase() {
		Scanner scan = new Scanner(System.in);
		String exit = "";
		while(!exit.equals("S")) {
			Student s = new Student();
			s.enroll();
			s.payTuition();
			studentInfo.put(s.studentId, s.toString());
			System.out.println("Press 'S' to stop entrance");
			System.out.println("Press Enter to go on entrance");
			exit = scan.nextLine();			
		}		
		selectOptions();
	}
	
	//Get students info by id
	public static void getStudentInfo() {
		
		Scanner scan = new Scanner(System.in);
		String id = "";
		String result = "";
		
		do {
			System.out.println("Enter student id to get information");
			System.out.println("Press 'X' to end the program");
			id = scan.nextLine();
			result = studentInfo.get(id);
			if(!id.contentEquals("X")) {
			   System.out.println(result);	
			}
			
		}while(!id.equals("X"));
		selectOptions();
		
	}
	
	//Remove student by id
	public static void removeStudent() {
		
		Scanner scan = new Scanner(System.in);
		String id = "";
		String result = "";
		
		do {
			System.out.println("Enter student id to remove");
			System.out.println("Press 'X' to end the program");
			id = scan.nextLine();
			result = studentInfo.remove(id);
			if(!id.equals("X")) {
				System.out.println(result + " \nRemoved from the students list");	
			}
			
		}while(!id.equals("X"));
		selectOptions();	
	}
	
	public static void selectOptions() {
		System.out.println("Select the options:");
		System.out.println("1: Add students\n" + "2: Print information\n" + "3: Delete students\n");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		switch(option) {
		case 1:
			createStudentDatabase();
			break;
		case 2:
			getStudentInfo();
			break;
		case 3:
			removeStudent();
			break;
		default:
			System.out.println("Invalid option select 1, 2, or 3");			
		}
		
	}

}
