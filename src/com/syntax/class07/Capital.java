package com.syntax.class07;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("What is the capital of Zimbabwe");
	String capital=input.nextLine();
	  
	while (!capital.equalsIgnoreCase("Harare")) {
		System.out.println("What is the capital of Zimbabwe");
		capital=input.nextLine();
	}System.out.println("You are right");
	input.close();

	}

}
