package com.syntax.class05;

import java.util.Scanner;

public class BirthMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user=new Scanner (System.in);
		System.out.println("Enter your birth month");
		 String month=user.nextLine();
		 
		 if (month.equalsIgnoreCase("january") || month.equalsIgnoreCase("feburary") || month.equalsIgnoreCase("november") || month.equalsIgnoreCase("december")) {System.out.println("You were born in winter season");
		 
		 }else if  (month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april") || month.equalsIgnoreCase("may")) {System.out.println("You were born in spring season");
		 
		 }else if  (month.equalsIgnoreCase("june") || month.equalsIgnoreCase("july") || month.equalsIgnoreCase("august")) {System.out.println("You were born in summer season");
		 
		 }else if  (month.equalsIgnoreCase("september") || month.equalsIgnoreCase("october")) {System.out.println("You were born in autumn season");
		 
		 }
		 user.close();
		 
	
	}
}
