package com.syntax.class13;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How would you check if String is palindrome or not? aba=> true
		//		Abbc =>false
		
		String str="racecar";
		
		String reverseStr="";
	    int strLength = str.length();
		
		  
	     for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(true);
		    }
		    else {
		      System.out.println(false);
		    }

	}

}
