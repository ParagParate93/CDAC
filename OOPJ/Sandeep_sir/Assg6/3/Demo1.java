package org.example_7_3;
import java.util.Scanner;

/*
 
 3. Write a program to find the maximum and minimum values in a single-dimensional array of integers.

 
 */


public class Demo1 {
	
	Scanner s = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		
		int[] b = new int [5];
		Demo1 d = new Demo1();
		d.acceptRecord(b);
		d.printRecord(b);
		d.maxValue(b);
		d.minValue(b);
	}

	private void minValue(int[] b) {
		int temp = b[0]; //don't initialize with 0 as it will be the lowest value and there will be no swap happening
		for(int i = 0 ; i<b.length; i++) {
			if(temp>b[i]) {
				temp=b[i];
			}
		}
		
		System.out.println("Min Value: "+temp);
	}

	private void maxValue(int[] b) {
		 int temp=0;
		for(int i=0; i<b.length; i++) {
				
				if(temp < b[i]) {
					temp=b[i];
					
				}
				
		}
		System.out.println("Max Value: "+temp);	
	}

	private void printRecord(int[] y) {
		for(int i=0; i<y.length; i++) {
			System.out.println("y["+i+"] = "+y[i]);
		}
		
	}

	private void acceptRecord(int[] x) {
		for(int i=0; i<x.length; i++) {
			System.out.println("Enter elements: ");
			x[i] = s.nextInt();
			
		}
	}
	
	
	
}
