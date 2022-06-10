package com.syntax.class08;

public class LoopsSum {

	public static void main(String[] args) {
		
	 int sum=0;
	for (int a=1;a<=70;a++)  {if (a%2==0)
	     sum+=a;
	}
	   {System.out.print(sum+"  ");
	}
		
	   
System.out.println("---------------------");  
 
// for odd numbers
int sum1=0;
for (int a=1;a<=70;a++)  {if (a%2!=0)
     sum1+=a;
}
   {System.out.print(sum1+"  ");
}

 System.out.println("---------------------");  
   
   //Another way
   int sumEven=0;
   int sumOdd=0;

   for (int i = 1; i <= 70; i++) {

   if (i % 2 == 0) {
   sumEven+=i;
   }else {
   sumOdd+=i;
   }
   }

   System.out.println("Sum even numbers is "+sumEven);
   System.out.println("Sum odd numbers is "+sumOdd);
  
   
   
   
	}
	}


