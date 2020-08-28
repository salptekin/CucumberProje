package day44lambdadt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class L03 {
	
			/* How to work with Files in Lambda */

	public static void main(String[] args) throws IOException {

		//How to read a file by using lambda		
		Files.lines(Paths.get("src/day44lambdadt/TextFile"))		
		     .forEach(t->System.out.println(t));
		
		//Convert all characters to upper case then read it
		Files.lines(Paths.get("src/day44lambdadt/TextFile"))
		     .map(t->t.toUpperCase())
		     .forEach(t->System.out.println(t));
		
		//Check if the text contain the word "Lambda"
		boolean result = Files.lines(Paths.get("src/day44lambdadt/TextFile"))
		                      .anyMatch(t->t.contains("Lambda"));
		System.out.println(result);
		
		//Print all distinct words in the text on the console.
		Files.lines(Paths.get("src/day44lambdadt/TextFile"))
		     .map(t->t.split(" "))
		     .flatMap(Arrays::stream)
		     .distinct()
		     .forEach(System.out::println);
		
		System.out.println("===============");
		
		//Print all words which contains "e" in the text on the console.
		Files.lines(Paths.get("src/day44lambdadt/TextFile"))
		     .map(t->t.split(" "))
		     .flatMap(Arrays::stream)
		     .map(t->t.replace(",", ""))
		     .map(t->t.replace(".", ""))
		     .filter(t->t.contains("e"))
		     .distinct()
		     .forEach(System.out::println);
		
		//Print the number of letters in the text (Learn, Java. ==> 9)
		int numberOfLetters = Files.lines(Paths.get("src/day44lambdadt/TextFile"))
				
		                           .map(t->t.split(" "))
		                           
		                           .flatMap(Arrays::stream)
		                           
		                           .map(t->t.replace(",", ""))
		                           
		                           .map(t->t.replace(".", ""))
		                           
		                           .map(t->t.replace(" ", ""))
		                           
		                           .map(t->t.length())
		                           
		                           .reduce(0, (t,u) -> t+u);
		System.out.println(numberOfLetters);//113
		
		//Print the distinct words which are ending with a
		Files.lines(Paths.get("src/day44lambdadt/TextFile"))
		     .map(t->t.split(" "))
		     .flatMap(Arrays::stream)
		     .map(t->t.replace("[^a-zA-Z]", ""))
		     .filter(t->t.endsWith("a"))
		     .forEach(t->System.out.print(t+" "));//Java lambda Lambda

	}

}
