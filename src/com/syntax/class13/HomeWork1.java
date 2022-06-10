package com.syntax.class13;

public class HomeWork1 {

	public static void main(String[] args) {
		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		String sentence="I love Playing Cricket";
		String str=sentence.replaceAll(" ", "");
		System.out.println(str);
		
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many Alphanumeric characters are there in the String.
		
		String combination="hsdfgdsrdsFDSGCS6253&%$GHVJH&*%^%$#$@DFD@!1233";
		String str1=combination.replaceAll("[A-za-z0-9]","");
		System.out.println(str1.length());
			
		//You have a String a=”Is it Saturday? Is it raining? Do we have a Java Class today?”
		//How would you find out how many sentences are in that String?
		
		String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
        int count = a.split("[?]").length;
        System.out.println(count);
        
        
       
	}

}
