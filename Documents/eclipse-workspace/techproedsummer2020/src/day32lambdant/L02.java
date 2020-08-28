package day32lambdant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import day31lambdant.Course;

public class L02 {

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
		
		//System.out.println(list);
		
		//Sort the list elements according to the season and average score and limit the elements by 2
		list.stream()
		    .sorted(Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore))
		    .limit(3)
		    .forEach(t->System.out.print(t + " <==> "));
		
		System.out.println();
		
		//Sort the list elements according to the season and average score and skip first 3 elements
		list.stream()
		    .sorted(Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore))
		    .skip(3)
		    .forEach(System.out::print);
		
		System.out.println();
		
		//Get the element whose average score is maximum
		System.out.println(list.stream()   
		                       .max(Comparator.comparing(Course::getAverageScore)));
		
		System.out.println();
		
		//Get the element whose number of students is minimum
		System.out.println(list.stream()  
		                       .min(Comparator.comparing(Course::getNumberOfStudents)));
		
		System.out.println();
		
		//Get the first element
		System.out.println(list.stream()
		                       .findFirst());
		
		System.out.println();
		
		//Get any element from the list
		System.out.println(list.stream()
		                       .findAny());
		
		System.out.println();
		
		//Find the sum of the number of students whose average grades are more than 95
		System.out.println(list.stream()
		                       .filter(t->t.getAverageScore()>95)
		                       .map(t->t.getAverageScore())
		                       .reduce(0, (t,u)->t+u));
		
		System.out.println();
		
		//Find the average of the number of students whose average grades are more than 93
		System.out.println(list.stream()
							   .filter(t->t.getAverageScore()>93)
							   .mapToInt(t->t.getNumberOfStudents())
							   .average());
		
		//Find the number of courses whose average grades are more than 93
		System.out.println(list.stream()
		                       .filter(t->t.getAverageScore()>93)
		                       .count());

	}

}
