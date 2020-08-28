package questions;

public class Q12 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 5;
		
		for(int i=0; i<x; i++){
			
		    for(int a = 0; a<y; a++){
			    System.out.print(" ");
		    }
		    y--;
		    
		    for(int b=0; b<x; b++){
		        System.out.print("* ");
		    }
		    
		    System.out.println();
		    
		    x++;
		    if(x==7){
		         break;
		    }	 
		}
	}
}
