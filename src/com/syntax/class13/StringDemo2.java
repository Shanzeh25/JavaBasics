package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="jsbdgJSGDUFGbheb8364ehfj846dbkj!@#%$";
		System.out.println(str.replaceAll("[0-9]", "#")); 
		System.out.println(str.replaceAll("[a-z]", "#")); 
		System.out.println(str.replaceAll("[A-Z]", "#")); 
		System.out.println(str.replaceAll("[A-Za-z]", "#"));
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
		
		//Reverse
		System.out.println(str.replaceAll("[^a-z]","*"));
		System.out.println(str.replaceAll("[^A-Z]","*"));
		System.out.println(str.replaceAll("[^A-Za-z0-9]","*"));
		
		//we can also provide the range
		str="hcggdggfvc";
		System.out.println(str.replaceAll("[a-f]","*"));
		
		//we can also remove    //empty string will remove it
		str="jshdansgkasfdgdf&^%$#h1243";
		System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
	}

}
