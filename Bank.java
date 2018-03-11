package com.Arrays;
/* subclass inherits all class members from the superclass
*superclass is the parent and subclass is the child
*Syntax
* 	class SubClassName extends SuperClassName{
		//ClassBody
*/
// Class SuperClassName
public class Bank {
	int accountNumber;
	int accountBalance;
	int accountdeposit;
	void showAccountNumber ()
	{
	System.out.println("The account number is" + accountNumber + "You have deposited"+accountdeposit + "dollars");
	}
public class BankTotal extends Bank
	{
	public String holderName;	
	int newAccountBalance ()
	{
		return accountBalance+accountdeposit;
	}
	void holderName()
	{
	System.out.println("The holder of the account is" + holderName);
	}
}
public static class BankDetails 
	{
	private String holderName;
	private int accountNumber;
	private String newAccountBalance;

	public static void main(String[]args)
	{
	Bank Detail = new Bank();
	BankDetails AccountofHolder = new BankDetails();
	Detail.accountBalance= 10000;
	Detail.accountdeposit= 100; 
	AccountofHolder.holderName= "John Doe";
	AccountofHolder.accountNumber= 14353;
	System.out.println("Account details are" + AccountofHolder.newAccountBalance);
	}
	
}
}




	
	


