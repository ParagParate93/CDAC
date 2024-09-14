package org.example_7_7;
import java.util.Scanner;

/*
 
Declare a single-dimensional array as a field inside a class and instantiate it inside the class 
constructor. Define methods named acceptRecord and printRecord within the class and test their 
functionality.
 
 */


public class Demo1 {
	private int[] a;
	Scanner s = new Scanner(System.in);
	
	Demo1(){
		this(5);
	}
	
	public Demo1(int size) {
		
		this.a = new int[size];
	}

	private void acceptRecord() {
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter elements: ");
			a[i] = s.nextInt();
			
		}
	}
	
	private void printRecord() {
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		
	}
	
	public static void main(String args[]) {
		
		
		Demo1 d = new Demo1();
		d.acceptRecord();
		d.printRecord();
	}

}
