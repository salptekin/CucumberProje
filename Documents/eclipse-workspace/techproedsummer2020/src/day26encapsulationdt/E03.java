package day26encapsulationdt;

public class E03 {
	
	private String disease = "Headache";
	private int ccn = 10001000;
	private boolean old =  false;

	public static void main(String[] args) {
		/*
		 1)Create 3 variables which are disease, credit card number, and old(boolean) 
		 2)Encapsulate them all
		 3)Make the disease readable but not updatable
		 4)Make the credit card number updatable but not readable
		 5)Make the old both readable and updatable
		*/

	}
    //If the data type of encapsulated data is boolean do not use "get" for the getter 
	//method name, use "is". This is naming convention of getters for encapsulated data.
	//For setters every time we use set.
	public boolean isOld() {
		return old;
	}

	public void setOld(boolean old) {
		this.old = old;
	}

	public String getDisease() {
		return disease;
	}

	public void setCcn(int ccn) {
		this.ccn = ccn;
	}
	
	/*
	 If you do not want any data to be updatable DO NOT create SETTERS. If all
	 data of a class are encapsulated and no setter method is created then the 
	 class is called "IMMUTABLE CLASS" 
	*/

}
