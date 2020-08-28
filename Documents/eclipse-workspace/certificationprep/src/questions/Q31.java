package questions;

public class Q31 {

	public static void main(String[] args) {

		numbers('z', 'e', 'r', 'o');
		numbers('o', 'n', 'e');
		numbers('t', 'w', 'o');
		numbers('t', 'h', 'r', 'e', 'e');
		numbers('f', 'o', 'u', 'r');
		numbers('f', 'i', 'v', 'e');
		numbers('s', 'i', 'x');
		numbers('s', 'e', 'v', 'e', 'n');
		numbers('e', 'i', 'g', 'h', 't');
		numbers('n', 'i', 'n', 'e');

	}

	public static void numbers(char... c) {
		StringBuilder word = new StringBuilder("twoseven");
		String result = "";//switch statement does not accept StringBuilder as parameter
		
		for(char w : c) {			
			for(int i=0; i<word.length(); i++) {
				
				if(word.charAt(i)==w) {
					result = result + word.charAt(i);
					word.delete(0, i+1);
					break;
				}
			}				
		}	
		
        switch(result) {
	        case "zero":
				System.out.println("zero: " + 0);
				break;
			case "one":
				System.out.println("one: " + 1);
				break;
			case "two":
				System.out.println("two: " + 2);
				break;
			case "three":
				System.out.println("three: " + 3);
				break;
			case "four":
				System.out.println("four: " + 4);
				break;
			case "five":
				System.out.println("five: " + 5);
				break;
			case "six":
				System.out.println("six: " + 6);
				break;
			case "seven":
				System.out.println("seven: " + 7);
				break;
			case "eight":
				System.out.println("eight: " + 8);
				break;
			case "nine":
				System.out.println("nine: " + 9);
				break;
			default:
				System.out.println("Just checks digits");
        }
	}

}
