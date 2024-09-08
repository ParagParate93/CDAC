package org.example;

import java.util.Scanner;

public class TollBooth {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		TollBoothRevenueManager t= new TollBoothRevenueManager();
		
		System.out.println("Enter the number of Cars passong thr tollbooth: ");
		t.setnCar(s1.nextInt());
		System.out.println("Enter the number of Trucks passong thr tollbooth: ");
		t.setnTruck(s1.nextInt());
		System.out.println("Enter the number of Motorcycle passong thr tollbooth: ");
		t.setnMotorcycle(s1.nextInt());
		System.out.println("Enter the toll rate for Car: ");
		t.setTrCar(s1.nextFloat());
		System.out.println("Enter the toll rate for Truck: ");
		t.setTrTruck(s1.nextFloat());
		System.out.println("Enter the toll rate for Motorcycle: ");
		t.setTrMotorcycle(s1.nextFloat());

		t.printRecord();		
		s1.close();
	}

}
