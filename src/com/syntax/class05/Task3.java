package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter person height in inches");
	       double height=scan.nextDouble();
	   
	       
	       if (height<60) {System.out.println("Short");
	       
	       }else if (height>=60 && height<=72) {System.out.println("Medium");
	       
	       }else if (height>72){System.out.println("Tall");
	       
	       }
	       scan.close();

	}

}
