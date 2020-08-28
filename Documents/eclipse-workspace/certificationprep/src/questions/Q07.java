package questions;

public class Q07 {

	public static void main(String[] args) {
		
		int a[][] = {{1, 2, 3}, {4, 5}};
		
//		for(int i = 0; i<a.length; i++) {		
//			for(int j = 0; j<a[i].length; j++) {				
//				System.out.print(a[i][j] + " ");				
//				if(a[i][j]==2 || a[i][j]==4) {
//					continue;
//				}				
//			}			
//		}

//		System.out.println();
		
		for(int i = 0; i<a.length; i++) {		
			for(int j = 0; j<a[i].length; j++) {
				if(a[i][j]==2 || a[i][j]==4) {
					continue;
				}			
				System.out.print(a[i][j] + " ");
			}
		}

	}

}
