package org.example_7_1;

import java.util.Scanner;

public class Demo1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int a [] = new int [5]; 
		/*
		for(int var : a){ 
			System.out.print(var+" "); 
		}
		*/
		
		
		for (int i=0; i<a.length; i++) {
			System.out.println("Enter the elements: ");
			a [i] = s.nextInt();
		}
		
		for(int i = 0; i<a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]+" ");
		}
		
		s.close();
		
		
	}
}
