package org.example;
import java.util.Scanner;

public class BMI{

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		BMITracker bmi= new BMITracker();
		
		System.out.println("Enter weight (in kilograms): ");
		bmi.setWeight(s1.nextFloat());
		
		System.out.println("Enter height (in meters): ");
		bmi.setHeight(s1.nextFloat());
		
		bmi.calculateBMI();
		bmi.classifyBMI();
		System.out.println(bmi.getClassify());
		
		s1.close();

	}

}
