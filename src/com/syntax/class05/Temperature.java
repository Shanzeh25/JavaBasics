package com.syntax.class05;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user=new Scanner (System.in);
		System.out.println("Which city you live in?");
		 String city=user.nextLine();
		 
	 System.out.println("What is the temperature there?");
	  int temp=user.nextInt();
	  
	    
	       temp=(temp-32)*5/9;
	   
	     
	     System.out.println("The temperature in the city "+city+ " is "+temp);
	     
	     user.close();
	     
	     
			  
			  
		 
	}

}
