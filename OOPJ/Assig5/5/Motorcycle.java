package org.example.demo2.test3;
import org.example.demo2.test1.Vehicle;

public class Motorcycle extends Vehicle{
	
	public Motorcycle(){
		
	}
	
	public void startEngine(int num) {
		if (num == 100)
		System.out.println("Motorcycle: Engine Started.");
		else
			System.out.println("Motorcycle: Provide right key to start engine");
	}
	
	public void stopEngine(int num) {
		if (num == 99)
		System.out.println("Motorcycle: Engine Stopped.");
		else
			System.out.println("Motorcycle: Provide right key to stop engine");
	}
	
	
}

