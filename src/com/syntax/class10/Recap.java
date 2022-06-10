package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		
		String [] disney= {"Shrek","Else","Goofy","Mulan","Tom&jerry"};
		
		System.out.println(disney[1]);
		System.out.println("All elements using regular for loop");
		
		
		for (int i=0; i<disney.length; i++) {
			System.out.print(disney[i]+" ");
		}
	}

}
