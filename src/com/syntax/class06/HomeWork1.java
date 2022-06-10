package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ask user to enter their country and capture it. Once values are captured print which language user speaks.
        */
		
		Scanner user=new Scanner(System.in);
		System.out.println("Enter your country");
		
		String country,language;
		country=user.nextLine();
	
		switch (country.toLowerCase()) {
		
		case "pakistan":
		language = "Urdu";
	    break;
	    
		case "saudiarabia":
	    language="Arabic";
	    break;
	    
		case "india":
		language="Hindi";
		break;
		
		case "russia":
		language="Rusian";
		break;
		
		default:
		language="English";}
		
		System.out.println("Your language is "+language); 
		
		
		
		System.out.println("-------------------------------------------------------");
		
		if (country.equals("pakistan")) { 
			language="Urdu";
			
		}else if (country.equals("saudiaarabia")) { 
				language="Arabic";
				
		}else if (country.equals("russia")) { 
					language="Russian";
					
		}else if (country.equals("indian")) { 
						language="Indian";			
			
		}else  { language="English";
		}
		
		{System.out.println("Your language is "+language);}
		
		user.close();
		
	}

}
