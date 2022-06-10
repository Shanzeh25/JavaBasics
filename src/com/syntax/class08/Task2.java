package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
	//declare a secret number
    // want user to guess secret number
	//keep asking until user gets the number
		
		Scanner input=new Scanner(System.in);
		System.out.println("What's the secret number");
		int  num=input.nextInt();
		  
		while (num!=26) {
			System.out.println("What's the sectret number");
			num=input.nextInt();
		}System.out.println("You are right");
		input.close();	
		
		
		
		
	}
	
	
	

}
