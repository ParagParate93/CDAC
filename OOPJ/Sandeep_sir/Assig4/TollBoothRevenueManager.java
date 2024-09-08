package org.example;

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
	
	
	public float getTrCar() {
		return trCar;
	}

	public void setTrCar(float trCar) {
		this.trCar = trCar;
	}

	public float getTrTruck() {
		return trTruck;
	}

	public void setTrTruck(float trTruck) {
		this.trTruck = trTruck;
	}

	public float getTrMotorcycle() {
		return trMotorcycle;
	}

	public void setTrMotorcycle(float trMotorcycle) {
		this.trMotorcycle = trMotorcycle;
	}

	public int getnCar() {
		return nCar;
	}

	public void setnCar(int nCar) {
		this.nCar = nCar;
	}

	public int getnTruck() {
		return nTruck;
	}

	public void setnTruck(int nTruck) {
		this.nTruck = nTruck;
	}

	public int getnMotorcycle() {
		return nMotorcycle;
	}

	public void setnMotorcycle(int nMotorcycle) {
		this.nMotorcycle = nMotorcycle;
	}


	public void calculateRevenue() {
		tRevCar = trCar*nCar;
		tRevTruck = trTruck*nTruck;
		tRevMotorcycle = trMotorcycle*nMotorcycle;
	}

	public void printRecord() {
	
	calculateRevenue();	
	System.out.println("Car: Rs"+tRevCar);
	System.out.println("Truck: Rs"+tRevTruck);
	System.out.println("Motorcycle: Rs"+tRevMotorcycle);
	
	}
	
	
	
	
}


