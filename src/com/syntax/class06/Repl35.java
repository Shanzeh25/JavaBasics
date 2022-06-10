package com.syntax.class06;
		import java.util.Scanner;
		class Main {
		 public static void main(String [] args){
		   Scanner input=new Scanner(System.in);
		   System.out.println("Do you need a loan?");
		   boolean loan=input.nextBoolean();
		   System.out.println(loan);
		   if(loan){
		     System.out.println("What is your credit score?");
		     int creditScore=input.nextInt();
		      if(creditScore<600){
		     System.out.println("The eligibility is Not eligible");
		     }else if(creditScore>600 && creditScore<700){
		     System.out.println("The eligibility is Maybe eligible");
		     }else if(creditScore>700 && creditScore<800){
		     System.out.println("The eligibility is Eligible");
		    }else if(creditScore>800){
		    System.out.println("The eligibility is Definitely eligible");
		 }else{
		        System.out.println("Unknown");
		 }
		     }
		
		   input.close();
	}
		 

}
