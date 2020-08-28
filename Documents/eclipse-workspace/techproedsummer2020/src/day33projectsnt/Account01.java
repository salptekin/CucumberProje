package day33projectsnt;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account01 {
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;

	Scanner scan = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(int checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(int savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	/*Calculate checking account withdraw */
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	/*Calculate saving account withdraw */
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	/*Calculate checking account deposit */
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	/*Calculate saving account deposit */
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	/*Customer checking account withdraw input */
	public void getCheckingWithdrawInput() {
		System.out.println("Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking account: ");
		double amount = scan.nextDouble();
		
		if(checkingBalance-amount>=0) {
			calcCheckingWithdraw(amount);
			System.out.println("New balance: " + moneyFormat.format(checkingBalance));
		}else {
			System.out.println("No enough money to withdraw for that amount");
		}
	}
	
	/*Customer checking account withdraw input */
	public void getSavingWithdrawInput() {
		System.out.println("Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving account: ");
		double amount = scan.nextDouble();
		
		if(savingBalance-amount>=0) {
			calcSavingWithdraw(amount);
			System.out.println("New balance: " + moneyFormat.format(savingBalance));
		}else {
			System.out.println("No enough money to withdraw for that amount");
		}
	}
	
	/*Customer checking account deposit input */
	public void getCheckingDepositInput() {
		System.out.println("Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit from checking account: ");
		double amount = scan.nextDouble();
		
		if(checkingBalance+amount>=0) {
			calcCheckingDeposit(amount);
			System.out.println("New balance: " + moneyFormat.format(checkingBalance));
		}else {
			System.out.println("No enough money to deposit for that amount");
		}
	}
	
	/*Customer checking account deposit input */
	public void getSavingDepositInput() {
		System.out.println("Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposit from saving account: ");
		double amount = scan.nextDouble();
		
		if(savingBalance+amount>=0) {
			calcSavingDeposit(amount);
			System.out.println("New balance: " + moneyFormat.format(savingBalance));
		}else {
			System.out.println("No enough money to deposit for that amount");
		}
	}

}
