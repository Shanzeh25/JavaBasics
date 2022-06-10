package com.syntax.class04;
import java.util.Scanner;

public class Assingment31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner=new Scanner(System.in);
		  System.out.println("Is it sunny outside?");
		
		  boolean isSunny = scanner.nextBoolean();
		
        
            
		 if (isSunny) { System.out.println("It is a sunny day, I should go somewhere!");
		
		  System.out.println("What is the temperature outside?");
		    int temp=scanner.nextInt();
		  
		  if (temp>85) {System.out.println("I am going to the beach");}
		  else if (temp<85) {System.out.println("I am going to the park");}
		 }
		 
	          else { System.out.println("I stay home and practice Java");}
		 
	 scanner.close();
	}
		  
		  
		  
		
		  
		  
	      }
	
	
	
	
		 
	


