package com.syntax.class06;

import java.util.Scanner;

public class Repl36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


    Scanner user=new Scanner(System.in);
    System.out.println("word1");
    String word1=user.nextLine();
    System.out.println("word2");
    String word2=user.nextLine();
    System.out.println("int1:");
    int int1=user.nextInt();
    System.out.println("int2:");
    int int2=user.nextInt();

   if (word1.equals(word2) &&
     (int1==int2) ){System.out.println("AND");}
   else if (word1.equals(word2)|| (int1==int2)){System.out.println("OR");}
    else {System.out.println("NONE");}
    
  user.close();
  
	}

}
