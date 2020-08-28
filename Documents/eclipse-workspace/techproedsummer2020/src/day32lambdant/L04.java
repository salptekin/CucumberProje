package day32lambdant;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class L04 {
	
	              /* How to work with Files in Lambda */
	
	public static void main(String[] args) throws IOException {
		    
		//How to read text from the file
		Files.lines(Paths.get("src/day32lambdant/TextFile"))
		     .forEach(System.out::println);
				
		System.out.println("==================");
		
		//How to convert all characters in the file to upper case
		Files.lines(Paths.get("src/day32lambdant/TextFile"))	
		     .map(t->t.toUpperCase())
		     .forEach(System.out::println);
		
		//How to check if a specific word(Lambda) exists in the text
		System.out.println(Files.lines(Paths.get("src/day32lambdant/TextFile"))
		                        .anyMatch(t->t.contains("Lambda")));
		
		//Print distinct words on the console in the file 
		Files.lines(Paths.get("src/day32lambdant/TextFile"))		
		     .map(t->t.split(" "))		     
		     .flatMap(Arrays::stream)		     
		     .distinct()	     
		     .forEach(t->System.out.print(t + " "));
		
		System.out.println("==================");
		
		//Get the words which end with "e" and print them on the console
		Files.lines(Paths.get("src/day32lambdant/TextFile"))	
		     .map(t->t.split(" "))
		     .flatMap(Arrays::stream)
		     .filter(t->t.endsWith("e"))
		     .forEach(t->System.out.print(t + " "));

	}

}
