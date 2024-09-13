package org.example.demo2.test2;

import org.example.demo2.test1.Animal;

public class Dog extends Animal{
	private String model;
	
	public Dog(){
		
	}
	
	public void bark() {
		System.out.println("Bark: Whoof Whoof");
	}
	
	public void eat() {
		System.out.println("Dog eats");
	}
	
	public void sleep() {
		System.out.println("Dog sleeps");
	}
	
}

