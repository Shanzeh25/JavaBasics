package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner user=new Scanner (System.in);
		System.out.println("Do you have a credi card?");
		 boolean creditCard=user.nextBoolean();
		
		
		if (creditCard) {System.out.println("What is the Balance?");
		 int balance=user.nextInt();
	   if (balance>1000) {System.out.println("Pay off immediately");
	   
	   }else {System.out.println("you can spend more");
		}

	} else {System.out.println("I will offer you the credit card");
	
	}
		user.close();
	}

}
