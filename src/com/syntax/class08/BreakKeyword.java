package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {

		//break-break block of code
		//usually we are going to place this in condition
		
		for (int i=1;i<=5;i++) {
			System.out.println("hello");
			if(i==2) 
			break;
		}
		
		boolean summer=true;
		 int temp=95;
		while (summer) {
			System.out.println("It is hot");
			if(temp<70) {
				System.out.println("it is not hot anymore");
				break;
			}temp-=10;
			
		}
		
		


	}
	}

