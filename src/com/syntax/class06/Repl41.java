package com.syntax.class06;

import java.util.Scanner;

public class Repl41 {
	 public static void main(String [] args) {

			
			Scanner user=new Scanner(System.in);
		    System.out.println("Enter the age of the child");
	    int age=user.nextInt();
	    String result;
	    switch (age){
	      case 1:
	        result="You can Crawl";
	        break;

	      case 2:
	        result="You can Talk";
	        break;

	      case 3:
	        result="You can Dance";
	        break;

	      case 4:
	        result="You can get Trouble";
	        break;

	      default:
	        result="I don't know how old you are";
	    }
	    System.out.println(result);
	    user.close();
	    }
	
		}
	      
	

