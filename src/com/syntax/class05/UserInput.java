package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter name");
	       String name=scan.nextLine();
	       System.out.println(name);
	    		   
	    System.out.println("plaese enter age"); 
	       int age=scan.nextInt();
	       System.out.println(age);
	    
	    System.out.println("Please enter price");
	    double price=scan.nextDouble();
	    System.out.println(price);
	    
	    System.out.println("Please enter boolen");
	     boolean boo=scan.nextBoolean();
	     System.out.println(boo);
	     
	     System.out.println("please anter any character");
	      char character =scan.next().charAt(0);
	      System.out.println(character);
	    
          scan.close();
	}

}
