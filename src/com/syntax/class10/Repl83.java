package com.syntax.class10;

public class Repl83 {

	public static void main(String[] args) {
		//Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers

		//For example, if we run rowSums for the following 2D array:

		//{
		//{1,1,2}, //sum = 4
		//{3,1,2}, //sum = 6
		//{3,5,3}, //sum = 11
		//{0,1,2}  //sum = 3
		//}
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
	      int rows, cols, sumRow; 
	    rows = a.length;  
	        cols = a[0].length;  
	      for(int i = 0; i < rows; i++){  
	            sumRow = 0;  
	            for(int j = 0; j < cols; j++){  
	              sumRow = sumRow + a[i][j];  
	            }  
	            System.out.println(sumRow);  
	        }  

	}

}
