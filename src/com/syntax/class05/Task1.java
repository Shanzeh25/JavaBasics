package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dmv=new Scanner (System.in);
		System.out.println("What is your age");
		int age=dmv.nextInt();
		
		if (age>=18) {System.out.println("I will issue you a driving license");
		
		}else {System.out.println("Get a learners permit");
		
		}
		dmv.close();

	}

}
