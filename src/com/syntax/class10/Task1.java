package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//From an array of integer elements find the largest number
		
		 int[] values= {16,79,54,91};
		 
		 int largest = values[0]; 
		 
		 for(int i=1; i<values.length; i++){ 
		  
		  	if(values[i] > largest){ 
		 		largest = values[i]; 
		 	} 
		 } 
		System.out.println("The largest num is "+largest);
		 
System.out.println();		
//with enhanced loop
		
		int[] nums= {2, 4, 6, 8};
		int largest1 = 0;
		
		for(int large:nums) {
			if(largest1<large) {
				largest1=large;
			}
		}
		System.out.println("The largest # is "+largest1);
	}

}
