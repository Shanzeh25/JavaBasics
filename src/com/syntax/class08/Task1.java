package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {

		
//print 1 to 100		
		   for (int x=1; x<=100; x++) {
			   System.out.print(x+" ");}
		   
//print 100 to 1		   
		   
System.out.println("----------------------");		   
		   for (int b=100; b>=1; b--) {
			   System.out.print(b+" ");}
		   
System.out.println("-----------------------");	
 
//print out even number
for (int a=20; a>=1; a-=2) {
	   System.out.print(a+" ");}

//second way
System.out.println("--------------------");


for (int e=20; e>=1; e--) {if (e%2==0) System.out.print(e+" ");}

System.out.println("-----------------");

//Print out odd numbers 
for (int y=21; y<=50; y+=2) {
	   System.out.print(y+" ");}

System.out.println("----------------------------------------");
		   
for (int q=20; q<=50; q++) {if (q%2!=0) System.out.print(q+" ");}

	}

}
