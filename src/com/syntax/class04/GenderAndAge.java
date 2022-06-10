package com.syntax.class04;

import java.util.Scanner;

public class GenderAndAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your gender");
        String gender=input.next();
        System.out.println("Please enter your age");
        int age=input.nextInt();
        
        if  (age>25) 
          if (gender.equals("F"))
           { System.out.println("Women");
             } else
            {System.out.println("Man");} 

       if (age<25) 
           if (gender.equals("M"))
           {System.out.println("Boy");
             }else 
          {System.out.println("Girl");}
    
input.close();
}
}
