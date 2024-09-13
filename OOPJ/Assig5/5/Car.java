package org.example.demo2.test2;
import org.example.demo2.test1.Vehicle;

public class Car extends Vehicle{
	
	public Car(){
		
	}
	
	public void startEngine(int num) {
		if (num == 1)
		System.out.println("Car: Engine Started.");
		else
			System.out.println("Car: Provide right key to start engine");
	}
	
	public void stopEngine(int num) {
		if (num == 0)
		System.out.println("Car: Engine Stopped.");
		else
			System.out.println("Car: Provide right key to stop engine");
	}
	
	
}

