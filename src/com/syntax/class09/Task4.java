package com.syntax.class09;

public class Task4 {

	public static void main(String[] args) {
		//Create an array of cars and store 6 elements into it.
		//Using 2 different loops print all values from the array.

		
		String[] animals= {"cat","dog","monkey","horse","donkey"};
		
		for (int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
	}
	
System.out.println();		
		
//other loop enhanced loop
		
		for (String animal:animals) {
			System.out.print(animal+" ");
		}
	

	}

}
