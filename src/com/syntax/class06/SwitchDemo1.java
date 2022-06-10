package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*l
		 * 
		 * 
		 */
 
		Scanner scan=new Scanner(System.in);
		
		String country, favouriteFood ;
		System.out.println("please tell me where are you from?");
		
		country=scan.nextLine();
		
		switch (country.toLowerCase()) {

	    case "mexico":
		     favouriteFood="tacos";
		     break;

	    case "canada":
		     favouriteFood="poutine";
		     break;

	    case "turkey":
		     favouriteFood="lahmacum";
		     break;
		
		case "pakistan":
			favouriteFood="pati chai";
			break;
		case "egypt":
			favouriteFood="koshary";
			break;

		case "usa":
			favouriteFood="burgers";
			break;	
	     default:
		  favouriteFood="Unknown";
		}
		
		
		System.out.println("You are from "+country+ " and your favourite food is "+favouriteFood);
		scan.close();
	}

}
