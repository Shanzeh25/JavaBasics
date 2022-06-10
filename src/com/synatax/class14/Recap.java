package com.synatax.class14;

public class Recap {

	public static void main(String[] args) {
	
		String str="I never forget about recordings";
		System.out.println(str.replace("never", "always").replace("I","Shanzeh"));
		
		String str2="Batch 13 is Great.Batch 13 is Best.Batch 13 is Excellent";
		String []arr=str2.split("[.]");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		str="WE #LOVE# JAVA";
		String[] arr2=str.split("[#]");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		

	}

}
