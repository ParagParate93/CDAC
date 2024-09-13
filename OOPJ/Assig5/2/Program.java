package org.example.demo2;

import org.example.demo2.test2.Car;

public class Program {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.toString());
		Car c1 = new Car("Maruti",2015,"Kiz500");
		System.out.println(c1.toString());

	}

}
