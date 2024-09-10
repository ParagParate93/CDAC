package org.example;

import java.util.Scanner;

class InstanceCounter{
	 private static int count;
	 
	 static{
		 System.out.println("Inside static block");
		 count = 0;
	 }
	
	 InstanceCounter(){ //parameterless constructor
		System.out.println("Inside parameterless constructor");
		InstanceCounter.count++;
		//count++
	}
	
	 InstanceCounter(Scanner s){ //parameterized constructor
			System.out.println("Inside parameterized constructor");
			InstanceCounter.count++;
			//count++;
		}
	 
	public static InstanceCounter getReference() {
		System.out.println("Inside get reference method");
		return new InstanceCounter();
	}
	
	public static int getCounter() {
		return InstanceCounter.count;
	} 
	
}


