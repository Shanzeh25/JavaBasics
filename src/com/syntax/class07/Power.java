package com.syntax.class07;

public class Power {

	public static void main(String[] args) {
		//write a program that prints all the power of 2 from 2^2 to 2^20
     
		int num=2;
		
		while (num<=Math.pow(2, 20)) {System.out.print(num+ " ");
		num=num*2;
	}
	}
}
