package com.Arrays;

public class JavaBasics2 {

	public static void main(String[] args) {
			}

	public int ValidateHeader()
	{
		System.out.println("Navigate to home page");
		//calling class from parent to inform it about the methods class 
		return 2; 
		//you have to specify what type of return type you want so class must be defined as specific data type 
		}
	
}
	//Declare instance variables 
		class Deposit{
			int hourlyrate;
			int hours;
			int days;
			String weeks;
		}
	//Declare Methods by creating a object and defining the values for each object 
		class MoneyEarned
		{
		//public access modifier will allow access to code defined outside of its class
		//static keyword permits a member to be accessed before any object is created within its class 
		  public static void main(String args[])
			{
			  //create an object to to define the behavior using keyword new 
			Deposit Cash101 = new Deposit();
			int totalEarned;
			Cash101.hourlyrate=45;
			Cash101.hours=80;
			Cash101.days=10;
			Cash101.weeks="Two"; 
			totalEarned= Cash101.hours*Cash101.hourlyrate;
			System.out.println("Total money earned is"+totalEarned + "for working two weeks");
			}
		}
		
		  
		
		
		


			


