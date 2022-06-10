package com.syntax.class05;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner user=new Scanner (System.in);
		System.out.println("How much amount of loan is needed?");
		 long loan=user.nextLong();
		 
		 if (loan<=200000) {System.out.println("I would lend you the money");
		 
		 }else {System.out.println("I have to reject you.I can't lend you the money");
		 
		 }
		
      user.close();
	}

}
