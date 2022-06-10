package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* tuesday and wednesday--> manual testing
		 * thursday--> review
		 * sat and sun-->java
		 */
		
		/*
		 * OR ||
		 * true || true
		 * true || false 
		 * false || true
		 * false || false
		 */
		
		String day="Monday";
		
		if (day.equals("Monday") || day.equals("Friday")) {System.out.println("I have no class");
		
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {System.out.println("I have manual testing class");
		
		}else if (day.equals("Thursday")) {System.out.println("I have review class");
		
		
		}else if (day.equals("Saturday") || day.equals("Sunday")){System.out.println("I have java class");

	}

}
}