package org.example;

import java.util.Scanner;

class LoanAmortizationCalculator {
private float p;
private float r;
private float t;
private double monthlyPayment;

public void acceptRecord(Scanner s) {
	
	System.out.println("Enter the principal amount(loan amount): ");
	p = s.nextFloat();
	System.out.println("Enter the annual interest rate: ");
	r = (s.nextFloat())/12/100;
	System.out.println("Enter the loan term: ");
	t = 12*(s.nextInt());
}

public void calculateMonthlyPayment() {
	monthlyPayment = p*(r*Math.pow((1+r),t))/(Math.pow((1+r),t)-1);
}

public void printRecord() {
	System.out.println("Monthly Payment: Rs "+monthlyPayment);
	System.out.println("Total amount paid: Rs "+(monthlyPayment*t));
}
}
