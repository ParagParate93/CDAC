package org.example;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		DiscountImplementation d = new DiscountImplementation();
		d.acceptRecord(s1);
		d.calculateDiscount();
		d.printRecord();
		
		s1.close();

	}

}
