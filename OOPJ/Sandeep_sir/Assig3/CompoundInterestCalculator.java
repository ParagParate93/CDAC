package org.example;

import java.util.Scanner;

public class CompoundInterestCalculator {
private float amount;
private float rate;
private int ntimes;
private float duration;
private double futureValue;
private double totalInterest;

public void acceptRecord(Scanner s) {
	
	System.out.println("Enter the initial investment amount: ");
	amount = s.nextFloat();
	
	System.out.println("Enter the annual interest rate: ");
	rate = s.nextFloat();
	
	System.out.println("Enter the number of times the interest is compounded per year: ");
	ntimes = s.nextInt();
	
	System.out.println("Enter the investment duration (in years): ");
	duration = s.nextFloat();
}

public void calculateFutureValue() {
	futureValue = amount*(Math.pow((1+((rate/100)/ntimes)),(ntimes*duration)));
	totalInterest = futureValue-amount;
}

public void printRecord() {
	System.out.println("Future Value: Rs "+futureValue);
	System.out.println("Total Interest Earned: Rs "+totalInterest);
}


}
