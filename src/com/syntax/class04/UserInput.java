package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		//create a scanner
		Scanner input= new Scanner(System.in);
		
		//send instructions to console
		System.out.println("Please enter your name");
		
		//we need to grab the value from console
		String name=input.next();
		//after you type the value-->hit enter
		
		System.out.println(name);
		input.close();
		

	}

}
