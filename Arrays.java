package com.Arrays;

public class Arrays {

	public static void main(String[] args) {
	
		System.out.println("Java Practice");
		//Add 2 numbers 
		
		int a=2;
		int b=3; 
		int Sum=a+b;
	
		
		// have to declare return type for the variable 
		System.out.println("Sum of a+b is"+ Sum);
		// Concatenate operator using + 
		
		
		//Classobject.methodname ...m is the method for the javabasics2 class 
		JavaBasics2 m = new JavaBasics2();
		ClassB cb = new ClassB (); 
		//JavaBasics2.ValidateHeader();
		cb.ValidateFooter(); 
			
		System.out.println(m.ValidateHeader());	
		System.out.println(cb.ValidateFooter());
	
		
		String input="reverse this string";
		String output = reverse(input); 
	}	
	private static String reverse(String input) {
		String reverse = "";
		if(input.length() <=1){
			reverse = input; 
		} else {
		String[] originalArray = input.split("\\s+"); // reverse, this, string
		for (String item : originalArray) {   // reverse+ "", this + reverse, string + this reverse 
				reverse = item +reverse;
			}
		}
		return reverse.trim();
	}
	
}
