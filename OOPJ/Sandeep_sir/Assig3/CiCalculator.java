package org.example;

import java.util.Scanner;

public class CiCalculator {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		CompoundInterestCalculator c = new CompoundInterestCalculator();
		c.acceptRecord(s1);
		c.calculateFutureValue();
		c.printRecord();
		s1.close();
	}

}
