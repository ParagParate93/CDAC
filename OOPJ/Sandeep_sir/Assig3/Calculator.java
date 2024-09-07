package org.example;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		LoanAmortizationCalculator lac = new LoanAmortizationCalculator();
		 lac.acceptRecord(s1);
		 lac.calculateMonthlyPayment();
		 lac.printRecord();
		 s1.close();
		
	}

}
