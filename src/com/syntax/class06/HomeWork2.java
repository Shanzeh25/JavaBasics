package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		/*Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade was entered by a user with explanation.
		*/
		
		Scanner user=new Scanner(System.in);
		 System.out.println("Enter your grade?");
		 char grade;
		 String explanation;
		 grade=user.next().charAt(0);
		 
		 
        switch (grade) {
		
		case 'A':
		explanation="Excellent";
		break;
		
		case 'B':
		explanation="Good";
		break;
		
		case 'C':
	    explanation="Average";
	    break;
	    
		case 'D':
	    explanation="Bad";
	    break;
	    
	    default:
	    explanation="Not Aceptable";
	 
		
		} System.out.println("The grade you entered "+grade+" means "+explanation);
		
		System.out.println("----------------------------------------------------");
		
		if (grade=='A') { 
			explanation="Excellent";
		}else if(grade=='B') { 
			explanation="Good";	
		}else if(grade=='C') { 
			explanation="Average";	
		}else if(grade=='D') { 
			explanation="Bad";
		}else {explanation="Not Acceptable";
		}
		
		System.out.println("The grade you entered "+grade+" means "+explanation);
		
		user.close();
		
		
	}   
	

}
