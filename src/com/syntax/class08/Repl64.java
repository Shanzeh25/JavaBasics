package com.syntax.class08;

import java.util.Scanner;

public class Repl64 {

	
	
	//Write a for loop that will print out a series of numbers starting at 0 and ending at the doubled value of end
	//(value must be taken from a user), exclusive.

	//Each number should be on the same line, separated by a space.
	
	 public static void main(String[] args) {
		   Scanner user=new Scanner(System.in);
		  
		   int end=user.nextInt();
		    
		   for (int i=0; i<=(end+end-1); i++) 
		     
		     {  System.out.print(i+" ");
		      } 
		  
user.close();
		}


}
