package org.example;

import java.util.Scanner;

public class TollBoothRevenueManager {
	
	private float trCar;
	private float trTruck;
	private float trMotorcycle;
	private int nCar;
	private int nTruck;
	private int nMotorcycle;
	private float tRevCar;
	private float tRevTruck;
	private float tRevMotorcycle;
	
	public void acceptRecord(Scanner s) {
		System.out.println("Enter the number of Cars passong thr tollbooth: ");
		nCar=s.nextInt();
		System.out.println("Enter the number of Trucks passong thr tollbooth: ");
		nTruck=s.nextInt();
		System.out.println("Enter the number of Motorcycle passong thr tollbooth: ");
		nMotorcycle=s.nextInt();
	}
	
	public void setTollRates(Scanner s) {
		
		System.out.println("Enter the toll rate for Car: ");
		trCar=s.nextFloat();
		System.out.println("Enter the toll rate for Truck: ");
		trTruck=s.nextFloat();
		System.out.println("Enter the toll rate for Motorcycle: ");
		trMotorcycle=s.nextFloat();
	}

	public void calculateRevenue() {
		tRevCar = trCar*nCar;
		tRevTruck = trTruck*nTruck;
		tRevMotorcycle = trMotorcycle*nMotorcycle;
	}

	public void printRecord() {
	System.out.println("Car: Rs"+tRevCar);
	System.out.println("Truck: Rs"+tRevTruck);
	System.out.println("Motorcycle: Rs"+tRevMotorcycle);
	}
	
}
