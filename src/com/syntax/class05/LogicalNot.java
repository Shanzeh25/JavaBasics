package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Not ! -- reverse the condition
		 *  
		 */

		 boolean boo=!true;
		 
		 System.out.println(boo);
		 
		 boolean boo1=!false;
		 
		 System.out.println(boo1);
		 
		 
		 System.out.println("________________________________________________");
		 
		 /*
		  * if there is no traffic--> i will reach work on time 
		  * 
		  */
		 
		 boolean traffic=false;
		 
		 if (!traffic) {System.out.println("I will reach work on time");
		 
		 }
		 
		 System.out.println("________________________________________________-");
		 
		 
		 String name="Shanzeh";
		 
		 if (!name.equals("Emre")) {System.out.println("You are not Emre,and I need Emre");
		 
		 
		 
		 }
		 
		 
	}

}
