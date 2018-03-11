package com.Arrays;

public class IfExample {

	public static void main(String[] args) {
		
		int i=60;
		if(i<50){
			System.out.println("i is less than 50");
			}
					System.out.println("This is outside of if");
		int b=20;
		if(b<10){
				System.out.println("b is less than 20");
			}
				System.out.println("This is equal or outside of if");
		
		int myNum= 7;
		int youNum= 8;
			// print out statement when equals to
				if(myNum == 7){
					System.out.println(" Lucky 7!");
			}
			// print out statement when integer is greater than if statement
				if(youNum > 7){
					System.out.println(" 8 is bigger than 7!");
			}
			// else if statements
		// print a statement using if and else if where you have 1 out of 3 visitors is a professor that comes to visit so print a statement with designation and name 		
		String visitor = "X";
		String designation = null; 	
		if(visitor == "Y"){
			designation = "professor"; 
			} else if (visitor == "Z"){
				designation = "principal";
			} else if (visitor == "X")
				designation = "Professor";
					System.out.println(" Good Morning " + designation + visitor);
					
				}
			}
			
	
	

