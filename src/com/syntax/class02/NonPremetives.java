package com.syntax.class02;

public class NonPremetives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Oleg";
		String lastName=" Smith";
		
		long phone=1233455666L;
		
		//xxx-xxx-xxxxx
		
		String phoneNumber="123-456-7890";
		String address="123 Washington str";
		
		System.out.println(phoneNumber+address+phone);
		
		int age=30;
		String city="Miami";
		
		
   System.out.println(name + lastName);
   
   //shortcut for printing
   // syso+ctrl+space ----> hit enter
   
   
   /*
    * we can use +
    * to attach string to string 
    */
  
    
    
    //Oleg lives in Miami
    System.out.println(name+" "+"lives in"+" "+city);
    
    //Oleg is 30 years old
    System.out.println(name+" "+age+" "+"years old");
 
  

	}

}
