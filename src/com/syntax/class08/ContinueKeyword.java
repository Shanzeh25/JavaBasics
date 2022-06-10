 	 package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		//continue- skips current execution/iteration
		//we write it inside a condition
		//when java executes continue
		//go back to the beginning of the loop
		//so rest of the code inside loop body
		//will be skipped/ignored
		
		for (int i=1;i<=5;i++) {
			
			if(i==2) {
			continue;
			}
			System.out.print(i+" ");
		}
		
		
System.out.println("-----------------");

//print numbers from on to ten except number 5 and 7

for (int i=1;i<=10;i++) {
	
	if(i==5 || i==7) {
	continue;
	}
	System.out.print(i+" ");
}


	}

}
