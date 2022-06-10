package com.syntax.class11;

public class Phone {

	String model;
	String color;
	int storage;
	
	void openPhone() {
		System.out.println("Opens the phone");
	}
	
	void goToApp() {
		System.out.println("Go to the Apps");
	}
	
	void closePhone() {
		System.out.println("Closes the phone");
	}
	
	public static void main(String[] args) {
		 Phone iphone=new Phone();
		 iphone.model="iphone13";
		 iphone.color="Gold";
		 iphone.storage=512;
		 iphone.openPhone();
		 iphone.goToApp();
		 iphone.closePhone();
		 
		 
		Phone pixel=new Phone();
		pixel.model="Pixel 6 pro";
		pixel.color="White";
		pixel.storage=256;
		 
		Phone samsung=new Phone();
		samsung.model="Galaxy A 11";
		samsung.color="Balck";
		samsung.storage=512;
	}
	}
	
	
	
	
	
	        
	