package com.syntax.class06;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Write a program to ask user to enter value for sale: yes or no
		* if there is no sale --> you are not going for shopping
		* if there is sale ask user which item they want to buy and it’s price
		* Based on the price you have to calculate the price of the item after the discount, discount rule:
		* if price is less than $20 --> apply 10%
		* if price is between $20 & $100 --> 20%
		* if price between $100 & $500 --> 30%
		* otherwise apply 50% discount
		After discount ___ the price of the item reduce from __ to ___
		*/

		
		Scanner user=new Scanner(System.in);
		  System.out.println("Enter a value for sale:yes or no");
		 String value=user.nextLine();
	      if (value.equals("yes")) {System.out.println("Which item they want to buy?");
	      String item=user.nextLine();
	      System.out.println("What's the price?");
	      double price=user.nextDouble();
	      if (price<20) {System.out.println("After  discount of 10% the price of the "+item+" reduced from "+price+" to "+(price-(price*.1)));}
	      else if (price>=20 && price<100) {System.out.println("After  discount of 20% the price of the item reduced from "+price+" to "+(price-(price*.2)));
	      }else if (price>=100 && price<=500) {System.out.println("After  discount of 30% the price of the item reduced from "+price+" to "+(price-(price*.3)));
	      }else {System.out.println("After  discount of 50% the price of the item reduced from "+price+" to "+(price-(price*.5)));
		 
	      }
	}
	      user.close();
	      
	      
}
}