package com.syntax.class09;

public class Task5 {

	public static void main(String[] args) {
		//Create an array to store double values and
		//then print all elements using 2 different loops
   double[] values= {2.1,3.1,4.1,5.1};
	
       for (int i=0; i<values.length; i++) {
    	   System.out.print(values[i]+" ");
       }
       
  System.out.println();
  
  //other enhanced loop
  
  for (double value:values) {
	  System.out.print(value+" ");
  }
	}
}
