package org.example.demo2.test1;

public class Vehicle{
	
	private String make;
	private int year;
	
	public Vehicle(){
		this.make = "Toyota";
		this.year = 2010;
	}
	
	public Vehicle(String make, int year) {
		this.make = make;
		this.year = year;
	}

	public String toString() {
		return this.make+" "+this.year;
	}
	
}

