package com.syntax.class10;

public class ShortWayOf2DArray {

	public static void main(String[] args) {
		
		int [][] numbers= {
				
				{10,20,30,40},
				{1,2,3,4},
				{9,8,7,6},
		};
		
		System.out.println(numbers[1][2]);
		
System.out.println();		
		
// create a 2 d array of state
		//1 array-- new York--- all cities of new York
		//2 array--California--all cities of CA
		//3 array--Florida--all cities of FL
		//4 array--us--all cities of USA
		
		
   String [][] usa= {
				
				{"New York","Albany","Buffalo"},
				{"Los Angeles","San Fransisco","San jose","San diego","Redding"},
				{"Miami","Orlando","Niceville","Tamp"},
				{"McLean","Richmond","Lessburg"},
		};
   
   System.out.println(usa[1][2]);
   System.out.println("I want to go to "+usa[2][0]);
   
   
   System.out.println("Total num of 1D array is "+usa.length);
   
   //i want to see how many elements inside my first array
   
   int elem1array=usa[0].length;
   System.out.println("Num of elements in 1 array = "+elem1array);
   
   
   
   int elem2array=usa[1].length;
   System.out.println("Num of elements in 1 array = "+elem2array);
	}

}
