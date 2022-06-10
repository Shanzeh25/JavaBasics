package com.syntax.class10;

public class Repl80 {

	public static void main(String[] args) {
		//Write a program to double the values of every element in the array and print it out.

		//Example Output:

		//2.8 4.0 6.6 4.0
		//8.0 3.0 12.2 2.0
		//2.4 6.2 8.0 3.2
		
		double[][] matrix = {
				{1.4*2,2.0*2,3.3*2,2*2},
				{4*2,1.5*2,6.1*2,1*2},
				{1.2*2,3.1*2,4*2,1.6*2}
			};
			//double and print array
	for (int i = 0; i < matrix. length; i++) { 
	  for (int j = 0; j < matrix[i]. length; j++) 
	    System.out.print(matrix[i][j] + " ");
	     System.out.println();
	  }

	}

}
