package org.example.demo2;

import org.example.demo2.test1.Vehicle;
import org.example.demo2.test2.Car;
import org.example.demo2.test3.Motorcycle;

public class Program {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.startEngine();
		v.stopEngine();
		
		Car c = new Car();
		c.startEngine(1);
		c.stopEngine(0);
		c.startEngine(2);
		c.stopEngine(1);
		
		Motorcycle m = new Motorcycle();
		m.startEngine(100);
		m.stopEngine(99);
		m.startEngine(1);
		m.stopEngine(2);
		
		Vehicle v1 = new Car();
		v1.startEngine();
		//v1.startEngine(1); // Not ok
		
		
	}

}
