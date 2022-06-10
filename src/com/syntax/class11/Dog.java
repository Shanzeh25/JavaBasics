package com.syntax.class11;

public class Dog {

	String name;
	String color;
	int age;
    int weight;
	
	void walks() {
		System.out.println("Likes to Walk");
	}
	
	void plays() {
		System.out.println("Loves to play fetch");
	}
	
	void eats() {
		System.out.println("Likes to eat dog food");
	}
	
	public static void main(String[] args) {
		Dog Husky=new Dog();
		Husky.name="Togo";
		Husky.color="Black and White";
		Husky.age=14;
		Husky.weight=45;
		Husky.plays();
		
		Dog Bulldog=new Dog();
		Bulldog.name="Hunter";
		Bulldog.color="Brown";
		Bulldog.age=10;
		Bulldog.weight=50;
		Bulldog.walks();
		
		Dog Labrador=new Dog();
		Labrador.name="Marley";
		Labrador.color="white";
		Labrador.age=2;
		Labrador.weight=55;
		Labrador.eats();
	}
}
