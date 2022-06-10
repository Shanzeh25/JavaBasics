package com.syntax.class06;

import java.util.Scanner;

public class MeRepl35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner user=new Scanner (System.in);
			System.out.println("Do you need a loan?");
			 boolean loan=user.nextBoolean();
	 if (loan)
	 {System.out.println("What is your credit score?");
	   int score=user.nextInt();

	     String criteria=null;
			 if (score<600) { criteria="Not eligible";}
			else if (score>=600 && score<=700) { criteria="Maybe eligible";}
	      else  if (score>=701 && score<=800) {criteria="Eligible";}
	       else  if (score>800) {criteria="Definitely eligible";} 
	 System.out.println("The eligibility is "+criteria);
	   }
	  else {System.out.println("Unknown");}
	   user.close();
	}

}
