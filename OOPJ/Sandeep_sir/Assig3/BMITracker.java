package org.example;

import java.util.Scanner;

public class BMITracker {
	
	private float weight;
	private float height;
	private float bmical;
	private String classify;
		
	public void acceptRecord(Scanner s) {
		System.out.println("Enter weight (in kilograms): ");
		weight=s.nextFloat();
		System.out.println("Enter height (in meters): ");
		height=s.nextFloat();
		
	}

	public void calculateBMI() {
		
		bmical=weight/(height*height);
		
	}

	public void classifyBMI() {
		if(bmical<18.5) {
			classify = "Underweight";
		}
		else if(bmical>=18.5 && bmical<=24.9) {
			classify = "Normal weight";
		}
		else if(bmical>=25 && bmical<29.9){
			classify = "Overweight";
		}
		else {
			classify = "Obese";
		}
	}

	public void printRecord() {
		System.out.println(classify);
		
	}


}
