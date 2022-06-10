package com.syntax.class02;

public class WaysToCreateVariable {

	public static void main(String[] args) {
		// to create a variable we need 2 things = data type and name
	
           /*
            * 1 way to create a variable 
            * dataType name = value
            */
		int temperature=60;
		
		/*
		 * 2 way that is done in 2 steps
		 * create a variable (dataType and name)
		 * assign the value
		 */
		
		int sum;  //create a variable 
		sum=30;    //assign the value
		sum=50;   // reassign the value
		
		int num1,num2,num3; //create 3 variables
		num1=10;
		num2=20;
		num3=30;
				
           System.out.println(sum); // only 50 will come
           System.out.println(temperature);
           System.out.println(num1);
           System.out.println(num2);
           System.out.println(num3);
           
           
           
	}

}
