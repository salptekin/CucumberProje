package day15constructors;

public class C02 {
	/*
	 1) Class olusturdugumuzda Java bizim kesinlikle object uretecegimizi dusunur ve class ile beraber 
	    gorunmez bir Constructor olusturur. Bu Constructor parametresiz Constructor'dir ve ismi 
	    "Default Constructor" dir.
	 2) Siz kendiniz herhangi bir constructor uretirseniz Java default constructor'i iptal eder.   
	*/
	
    C02(int i){
		
	}
    
    C02(){
    	
    }
	
	public static void main(String[] args) {
       
		C02 obj1 = new C02();
		
	}

}
