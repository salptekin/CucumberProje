package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FEL01 {

	public static void main(String[] args) {
	
		List<Integer> il = new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(26);
		
		//for-each loop = Enhanced loop		
		//for-each loop array'lerde kullanilmaz
		for(Integer w : il) {			
			System.out.println(w);			
		}
		
		//il list'inin tum elemanlarini toplayiniz
		int sum = 0;
		for(Integer w : il) {			
			sum = sum + w;		
		}	
		System.out.println(sum);
		
		//il listinin icindeki tek sayi olan elemanlarin carpimini bulunuz.
		int product = 1;		
		for(int w : il) {			
			if(w%2!=0) {
				product = product * w;
			}		
		}
		System.out.println(product);
		
		//il listinin icindeki tek sayi(w%2!=0) olan elemanlari ekrana yazdiriniz.		
		for(int w : il) {			
			if(w%2!=0) {
				System.out.println(w);
			}			
		}
		
		//break ve continue karsilastirmasi
		
		//il list'inin ilk 3 elemanini yazdiriniz
		//1. Yol:
		int count = 0;		
	    for(int w : il) {	    	
	    	if(count<3) {
	    		System.out.print(w + " ");
	    		count++;
	    	}	    	
	    }
	    
	    System.out.println();
	    
	    //2. Yol:
	    int c = 0;	    
	    for(int w : il) {	    	
	    	System.out.print(w + " ");	    	
	    	c++;	    	
	    	if(c==3) {
	    		break;
	    	}	    	
	    }
	    
	    System.out.println();
	    
	    //il listinde 3 ile bolunebilenleri ekrana yazdiriniz
	    
	    //1. Yol:
	    for (int w : il) {    	
			if(w%3==0) {
				System.out.print(w + " ");
			}			
		}
	    
	    System.out.println();
	    
	    //2. Yol:
		for(int w:il) {			
			if(w%3!=0) {
				continue;
			}			
			System.out.print(w + " ");			
		}

	}

}
