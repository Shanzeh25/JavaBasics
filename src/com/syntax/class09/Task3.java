package com.syntax.class09;

public class Task3 {

	public static void main(String[] args) {
		//Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.

String[] cars= {"Honda","Tesla","Mercedes","Civic","Land Cruser","Range Rover"};
      
       for (int i=0; i<cars.length; i++) {
    	   System.out.print(cars[i]+" ");
       }
       
  System.out.println();     
       
  // other loop (Enhanced loop)
       
       for ( String car : cars) {
    	   System.out.print(car+" ");
       }
       
       
      

	}

}
