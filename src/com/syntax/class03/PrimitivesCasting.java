package com.syntax.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {
		
    int i=100;
    double d=100;
    
    System.out.println(i);
    System.out.println(d);
    
    //widening= coverting smaller datatype to bigger
    //byte-short-int-long-float-doube
    //so thats why we are able to put 100 in int and in double as well
    
    
    //narrowing=
    //double-float-long-int-short-byte
    
    //cannot convert from double to int 
    int x=(int)99.99;
    System.out.println(x);
    
    //cannot convert to to byte
    byte b=(byte)130;
    System.out.println(b);
    
    
    
    
    
    
    
    
    
    
		
		

	}

}
