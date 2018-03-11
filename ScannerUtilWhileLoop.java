package com.Arrays;

	/**
	 * This program will convert measurements expressed in inches,
	 * feet, yards, or miles into each of the possible units of
	 * measure.  The measurement is input by the user, followed by
	 * the unit of measure.  For example:  "17 feet", "1 inch", or
	 * "2.73 mi".  Abbreviations in, ft, yd, and mi are accepted.
	 * The program will continue to read and convert measurements
	 * until the user enters an input of 0.
	 */
	import java.util.Scanner;
	
	
	 public class ScannerUtilWhileLoop{
	 
	    public static void main(String[] args) {
	    	
	       double inches, feet;  							// Measurement expressed in each possible unit of measure.
	       Scanner user_input= new Scanner(System.in);		//Scanner class created to allow I/O
	       
	       System.out.println("Enter measurements in inches, or feet.");
	       System.out.println("For example:  1 inch   17 feet ");
	       System.out.println("You can use abbreviations: in   ft ");
	       System.out.println("I will convert your input into the other units");
	       System.out.println("of measure.");
	       System.out.println();
	       
	       while (true) {
	       // Get the user's input, and convert units to lower case. 
	       System.out.print("Enter your measurement, or 0 to end: ");
	       // Numerical measurement, input by user.
	       double measurement = user_input.nextInt();	  		       	     
           if (measurement == 0)
	       	    // Terminate the while loop.
	        break;  									
	       	// The unit of measure for the input, also specified by the user.
	       	String units = user_input.next();  				
	       	// convert units to lower case
	       	units = units.toLowerCase();  					
	        // Convert the input measurement to inches. 
	          
	          if (units.equals("inch") || units.equals("inches")|| units.equals("in")) {
	              inches = measurement;
	          } else {
				  if (units.equals("foot") || units.equals("feet")|| units.equals("ft")) {
				  inches = measurement * 12;
				  }
				else {
				  System.out.println("Sorry, but I don't understand \"" + units + "\".");
				  continue;  // back to start of while loop
				  }
	          }
	          /* Convert measurement in inches to feet, yards, and miles. */
	          feet = inches / 12;
	          /* Output measurement in terms of each unit of measure. */
	          System.out.println();
	          System.out.println("That's equivalent to:");
	          System.out.printf("%12.5g", inches);
	          System.out.println(" inches");
	          System.out.printf("%12.5g", feet);
	          System.out.println(" feet");
	          System.out.println();
	       
	       } // end while
	       System.out.println();
	       System.out.println("OK!  Bye for now.");
	       
	    } // end main()
	    
	 } // end class LengthConverter

