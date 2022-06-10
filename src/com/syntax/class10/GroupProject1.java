package com.syntax.class10;

public class GroupProject1 {
	
	//Write a Java Program to print the first 10 numbers of
	//Fibonacci series
	
	/*
	 * Fibonacci numbers are a sequence of whole numbers arranged as
	 *  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,... 
	 *  Every number is the sum of the preceding two numbers.
	 */

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		
		for (int i=0; i<10; i++) {
			
			System.out.print(a+" ");  
			c=a+b;
			a=b;
			b=c;
	}
	}
}