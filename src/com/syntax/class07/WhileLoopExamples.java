package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		//print numbers from 1 to 10
		
		int num=1;
		
		while(num<=10 ) {
			
			System.out.print(num+" ");
			num++;
		}

		
System.out.println("-----------------------------------------------------------------");		
		
		int num1=0;
		
		while (num1<10) {
			num1++;
			System.out.print(num1+" ");
        }
		
System.out.println("-----------------------------------------------------------------");	

   int a=10;
   
   while (a<=100) {
	   System.out.print(a+ " ");
	   a++;
   }
   
System.out.println("------------------------------------------------------------------");

    
int b=10;
  
       while (b>=1) {
	 System.out.print(b+ " ");
       b--;
  }
       
  
System.out.println("----------------------------------------------------------------");       
       int y=100;
       
       while (y>=50) {
	 System.out.print(y+ " ");
       y--;
  }
  
   
 
System.out.println("-----------------------------------------------------------------");       
       int c=-1;
       
       while (c>=-10) {
	 System.out.print(c);
       c--;
       }
       
System.out.println("--------------------------------------------------------------");

   int s=0;
   
   
  
   while (s<=20) {
     
	   System.out.print(s+" ");
      s+=2;
     
       
       
	}
	//second way
System.out.println("----------------------------------------------------------------");   

   int d=1;
   
	while (d<=20) {
		if (d%2==0) {System.out.print(d+" ");
		}
		d++;
	}
	System.out.println("----------------------------------------------------------------");   
	
	
//print odd numbers from 100 to 1	
	
	int e=100;
	   
		while (e>=1) {
			if (e%2!=0) {System.out.print(e+" ");
			}
			e--;
		}
System.out.println("--------------------------------------");

int r=99;
while (r>=1) {
	System.out.print(r+" ");
	r-=2;
	
}

System.out.println("-------------------------------------------");
	
	
	}
	
	
	

}
