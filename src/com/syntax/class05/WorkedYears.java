package com.syntax.class05;

import java.util.Scanner;

public class WorkedYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user=new Scanner (System.in);
		System.out.println("Enter number of worked years?");
		 int years=user.nextInt();
		
		 if (years>=5) {System.out.println("You is eligible for bonus");
		 
		 System.out.println("What is your annual salary?");
		    int salary=user.nextInt();
		 
		if (salary>50000) {System.out.println("Your bonus will be equal to 5000");
		 
		 }else {System.out.println("Your bonus is 3000");}
		
		 
		 } else {System.out.println("You are not eligible for bonus");
		 }
		 user.close();
		 }
		 

	}


