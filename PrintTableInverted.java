package com.Arrays;



public class PrintTableInverted {
	
	  public static void main(String [] args){
	  int number = 9;
	  
	  printTable(number); 
	  }
	  private static void printTable(int n) 
	  {
	  
	   for (int j = 10; j >=0; j --) { //from 9 to 0
		 System.out.format("%2d x %d = %3d\n", n,j,n*j);
		 }
	     System.out.println();
	  	 }
	}
	



	
	