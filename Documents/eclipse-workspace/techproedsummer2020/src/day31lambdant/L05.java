package day31lambdant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class L05 {

	public static void main(String[] args) {
	
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
		
		List<Course> list = new ArrayList<>();
		list.add(courseTurkishDay);
		list.add(courseTurkishNight);
		list.add(courseEnglishDay);
		list.add(courseEnglishNight);
		
		System.out.println(list);
		
		//Check if all average scores are greater than 98
		System.out.println(list.stream()
		                       .allMatch(t->t.getAverageScore()<99));//true
		
		//Check if all course names containing the word "Day"
		System.out.println(list.stream()
		                       .allMatch(t->t.getCourseName().contains("Day")));//false
		
		//Check if any number of students is 154
		System.out.println(list.stream()
		                       .anyMatch(t->t.getNumberOfStudents()==154));//true
		
		//Check if any season is Autumn
		System.out.println(list.stream()
		                       .anyMatch(t-> t.getSeason().equals("Autumn")));//false
		
		//Check if no number of students is equal to 100
		System.out.println(list.stream()
				               .noneMatch(t->t.getNumberOfStudents()==100));//true
		
		//Sort the list elements according to the number of students
		System.out.println(list.stream()
		                       .sorted(Comparator.comparing(Course::getNumberOfStudents))
		                       .collect(Collectors.toList()));
		
		//Sort the list elements according to the names of the courses in reverse order
		System.out.println(list.stream()
		                       .sorted(Comparator.comparing(Course::getCourseName).reversed())
		                       .collect(Collectors.toList()));		

	}

}
