package day10forloopwhileloopnt;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 Print first 70 counting numbers which are divisible by 4 and 6
		*/ 
		
		int count = 0;//If you create a variable before loop to use inside the loop
		              //it is called flag. Flag can be every data type.
		
		for(int i=1; count<70; i++) {
			
			if(i%4==0 && i%6==0) {
				System.out.print(i + " ");
				count++;
			}
			
		}

	}

}
