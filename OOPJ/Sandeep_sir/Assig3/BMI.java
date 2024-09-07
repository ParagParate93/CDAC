package org.example;

import java.util.Scanner;

public class BMI{

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		BMITracker bmi= new BMITracker();
		
		bmi.acceptRecord(s1);
		bmi.calculateBMI();
		bmi.classifyBMI();
		bmi.printRecord();
		
		s1.close();

	}

}
