package org.example.demo2.test2;

import org.example.demo2.test1.Vehicle;

public class Car extends Vehicle{
	private String model;
	
	public Car(){
		this.model="SDX240";
	}
	
	public Car(String m, int y, String mo) {
		super(m,y);
		this.model = mo;
	}

	public String toString() {
		return super.toString()+" "+this.model;
	}
	
}

