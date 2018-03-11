package com.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		//Declaring and initializing 2D Array
		
				int arr[][]={{8,6,7},{2,4,5},{4,4,5}};
				
				//printing 2D array
				
				for(int i=0;i<3;i++)
				{
					for (int j=0;j<3;j++)
					{
						System.out.print(arr[i][j]+"");
					}
					System.out.println();
				}
				{
				int i,j; 
				
				int [][] twod=new int [3][3]; 
				
				twod[0][0]=85; 
				
				twod[0][1]=50;
				
				twod[0][2]=85;
				
				twod[1][0]=60;
				
				twod[1][1]=30;
				
				twod[1][2]=30;
				
				twod[2][0]=30;
				
				twod[2][1]=30;
				
				twod[2][2]=30;
				
				System.out.println(twod[2][0]);
				
				//printing 2d array
				
			}
	}

}
