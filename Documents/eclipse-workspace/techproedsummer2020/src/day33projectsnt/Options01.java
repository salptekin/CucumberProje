package day33projectsnt;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Options01 extends Account01 {

	Scanner scan = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<>();
	
	/*Validate login information, customer number and pin number*/
	
	public void getLogin() {
		int x =1;
		
		do {
			try {
				data.put(9876543, 9876);
				data.put(8989898, 1890);
				data.put(1234567, 1234);
				
				System.out.println("Welcome to the ATM");
				
				System.out.println("Enter your customer number: ");
				setCustomerNumber(scan.nextInt());
				
				System.out.println("Enter your pin number: ");
				setPinNumber(scan.nextInt());
			}catch(Exception e) {
				System.out.println("Invalid characters. Use just numbers.");
				x=2;
			}
			
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("Invalid customer number or pin number");
		}while(x==1);
	}
	
	public void getAccountType() {
		System.out.println("Select the account you want to access: ");
		System.out.println("Option 1: Checking Account");
		System.out.println("Option 2: Saving Account");
		System.out.println("Option 3: Exit");
		System.out.println("Choice: ");
		
		int selection = scan.nextInt();
		
		switch(selection) {
			case 1:
				getChecking();
				break;
			case 2:
				getSaving();
				break;
			case 3:
				System.out.println("Thanks for using ATM, bye...");
				break;
			default:
				System.out.println("Invalid choice, please select one of 1, 2, 3");
				getAccountType();
		}
	}
	
	public void getChecking() {
		System.out.println("Checking account options: ");
		System.out.println("Option 1: View Balance");
		System.out.println("Option 2: Withdraw funds");
		System.out.println("Option 3: Deposit funds");
		System.out.println("Option 4: Exit");
		System.out.println("Choice: ");
		
		int selection = scan.nextInt();
		
		switch(selection) {
			case 1:
				System.out.println("Account balance: " + moneyFormat.format(getCheckingBalance()));
				getAccountType();
				break;
			case 2:
				getCheckingWithdrawInput();
				getAccountType();
				break;
			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("Thanks for using ATM, bye...");
				break;
			default:
				System.out.println("Invalid choice, please select one of 1, 2, 3, 4");
				getAccountType();
		}
	}
	
	public void getSaving() {
		System.out.println("Saving account options: ");
		System.out.println("Option 1: View Balance");
		System.out.println("Option 2: Withdraw funds");
		System.out.println("Option 3: Deposit funds");
		System.out.println("Option 4: Exit");
		System.out.println("Choice: ");
		
		int selection = scan.nextInt();
		
		switch(selection) {
			case 1:
				System.out.println("Account balance: " + moneyFormat.format(getSavingBalance()));
				getAccountType();
				break;
			case 2:
				getSavingWithdrawInput();
				getAccountType();
				break;
			case 3:
				getSavingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("Thanks for using ATM, bye...");
				break;
			default:
				System.out.println("Invalid choice, please select one of 1, 2, 3, 4");
				getAccountType();
		}
	}
	
	
}
