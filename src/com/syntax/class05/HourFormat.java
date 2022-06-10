package com.syntax.class05;

import java.util.Scanner;

public class HourFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user=new Scanner (System.in);
		System.out.println("Enter the current time in 24 hour format?");
		 int time=user.nextInt();
		 
		 if (time>=1 && time<=11) {System.out.println("Morning");
		 
		 }else if (time>=12 && time<=15) {System.out.println("Afternoon");
		 
		 }else if (time>=16 && time<=20) {System.out.println("Evening");
		 
		 }else if (time>=21 && time<=24) {System.out.println("Night");
		 
		 }
		 user.close();

	}

}
