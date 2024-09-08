package org.example;

import java.util.Scanner;

class LoanAmortizationCalculator {
private float p;
private float r;
private float t;
private double monthlyPayment;

public void acceptRecord(Scanner s) {
	
	System.out.println("Enter the principal amount(loan amount): ");
	setP(s.nextFloat());
	
	System.out.println("Enter the annual interest rate: ");
	setR((s.nextFloat())/12/100);
	
	System.out.println("Enter the loan term: ");
	setT(12*(s.nextInt()));
	
}

public void calculateMonthlyPayment() {
	monthlyPayment = p*(r*Math.pow((1+r),t))/(Math.pow((1+r),t)-1);
}

public void printRecord() {
	System.out.println("Monthly Payment: Rs "+monthlyPayment);
	System.out.println("Total amount paid: Rs "+(monthlyPayment*getT()));
}

public float getP() {
	return p;
}

public void setP(float p) {
	this.p = p;
}

public float getR() {
	return r;
}

public void setR(float r) {
	this.r = r;
}

public float getT() {
	return t;
}

public void setT(float t) {
	this.t = t;
}



}
