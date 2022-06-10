package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	boolean vaccine=true;
	int dose=1;
	
	if (vaccine) {
		System.out.println("Let me check how many doses yo have?");
	
	
	if (dose==1) {System.out.println("You need one more shot");}
	else{System.out.println("you are fully vaccinated.");}
		
	
	}
	
	System.out.println("--------");
	
	
	String month="Jan";
    int day=19;
    
    
    if (month.equals("May")){ 
    	System.out.println("Let me check what is today's date");
    
           if (day==8) {System.out.println("Today is mother day");}
           
    }else if(month.equals("June")) {
    	System.out.println("Let me check what is today's date");
    	
    	if (day==19) {
    		System.out.println("Today is a Father's Day");
    	}
           
    }
    
	}
 
}


    
