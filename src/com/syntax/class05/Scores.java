package com.syntax.class05;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user=new Scanner (System.in);
		System.out.println("Enter your quiz midterm and final scores");
		 int quiz=user.nextInt();
		 int midterm=user.nextInt();
		 int finalscore=user.nextInt();

		 int averageScore=((quiz+midterm+finalscore)/3);
		 
		 if (averageScore>=90) {System.out.println("Grade=A");
		 
		 }else if  (averageScore>=70 && averageScore<90) {System.out.println("Grade=B");
		 
		 }else if  (averageScore>=50 && averageScore<70) {System.out.println("Grade=C");
		 
		 }else if  (averageScore<50) {System.out.println("Grade=F");
		 
		 }
		 user.close();
	}

}
