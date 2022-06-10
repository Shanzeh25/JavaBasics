package com.syntax.class06;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HW: Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
		*
		*/
        
		Scanner user=new Scanner(System.in);
		System.out.println("Enter a number1 operator and number 2");
		int num1=user.nextInt();
		
		char operator=user.next().charAt(0);
		
		int num2=user.nextInt();
		
		int result = 0;
		switch (operator) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            result = num1 / num2;
            break; 
          default:
        	  System.out.println("illegal operant");

		}
         
        	{ System.out.println("Result: " +result);}
        user.close();
        	
	}
}
		
        	 
		
	
