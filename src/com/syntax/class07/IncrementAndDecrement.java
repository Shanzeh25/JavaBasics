package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		x=x+1;
		x+=1;
		
		System.out.println(x);
		
		x++; //increments value of a variable by 1
		System.out.println(x);

		
		x--; //decrements value of a variable by 1
		System.out.println(x);
	   
		//Increment and decrement operators work only with variable
		
		//10++ CE: Invalid argument to operation ++/--
		
		int num=100;
		num++;
		System.out.println(num);
	}

}
