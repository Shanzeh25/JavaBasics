package com.syntax.class10;

public class Repl85 {

	public static void main(String[] args) {
		//Write a program that sums all numbers that are on even index and on even row.

		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};

       for (int i=2; i<a.length; i++ ) {
    	   for (int j=2; j<a[i].length; j++) {
    		   if (a[i][j]%2==0) {
    			   System.out.println(a[i][j]);
    		   }
    	   }
       }
	}

}
