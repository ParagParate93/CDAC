package org.example_7_2;

import java.util.Scanner;

public class Demo1 {
	
	Scanner s = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		
		int[] b = new int [5];
		Demo1 d = new Demo1();
		d.acceptRecord(b);
		d.printRecord(b);
		
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
		s.close();
	}
	
	
}
