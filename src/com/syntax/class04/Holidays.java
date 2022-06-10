package com.syntax.class04;

public class Holidays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String month= "jan";
		 int date=1;
		 
		 if (month.equals("jan")) {
			 System.out.println("January");
		 if (date==1) {
			 System.out.println("new years day");}
			 else if (date==3) {
				 System.out.println("new years day observed");
			 }
			 else {System.out.println("No holiday observed");
			  }
		  }
		 
		 
		 if (month.equals("apr")) {
			 System.out.println("April");
		 if (date==15) {
			 System.out.println("Good Friday");}
			else {System.out.println("No holiday observed");
			  }
		  }
		 
		 
		 if (month.equals("may")) {
			 System.out.println("May");
		 if (date==2) {
			 System.out.println("Early may bank holiday");}
			else {System.out.println("No holiday observed");
			  }
		  }
		 
		 
		 if (month.equals("jun")) {
			 System.out.println("June");
		 if (date==2) {
			 System.out.println("Spring bank holiday");}
			 else if (date==3) {
				 System.out.println("Queens platinum jubliee");
			 }
			 else {System.out.println("No holiday observed");
			  }
		  }
		 
		 
		 if (month.equals("dec")) {
			 System.out.println("December");
		 if (date==25) {
			 System.out.println("Christmas Day");}
			 else if (date==26) {
				 System.out.println("Boxing Day");
			 }else if (date==27) {
				 System.out.println("Substitute Bank Holiday for christmas day");
			 }
			 else {System.out.println("No holiday observed");
			  }
		  }
		 
		 
		  
	}

}
