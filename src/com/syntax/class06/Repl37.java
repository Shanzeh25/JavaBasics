package com.syntax.class06;

import java.util.Scanner;

public class Repl37 {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
	    System.out.println("Are you thirsty?");
	    boolean thirsty=user.nextBoolean();
	    System.out.println("Are you sleepy?");
	    boolean sleepy=user.nextBoolean();
	    String drink;
	    if ((thirsty) && (!sleepy)){drink="water";}
	    else if ((thirsty) && (sleepy)){drink="coffee";}
	    else if ((!thirsty) && (sleepy)) {drink="tea";}
	    else {drink="nothing";}
	System.out.println("Looks like you need to drink "+drink);
	user.close();
	}
	
	
	

}
