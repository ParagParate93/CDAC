package org.example;
import java.util.Scanner;

public class DiscountImplementation {
	private float price;
	private float discount;
	private float discountAmount;
	private float finalPrice;
	

	public void calculateDiscount() {
		discountAmount=price*(discount/100);
		finalPrice=price-discountAmount;
	}

	public void printRecord() {
		System.out.println("Discount Amount: "+discountAmount);
		System.out.println("Final Price: "+finalPrice);
	}

	public void setPrice(Scanner s) {
		System.out.println("Enter the price: ");
		this.price = s.nextFloat();
	}

	public void setDiscount(Scanner s) {
		System.out.println("Enter the discount percentage: ");
		this.discount = s.nextFloat();
	}
	
}


/*

	public void acceptRecord(Scanner s) {
		System.out.println("Enter the price: ");
		price = s.nextFloat();
		System.out.println("Enter the discount percentage: ");
		discount = s.nextFloat();
	}

*/