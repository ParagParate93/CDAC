package org.example_7_8;
import java.util.Scanner;

/*
 
Declare a single-dimensional array as a field inside a class and instantiate it inside the class 
constructor. Define methods named acceptRecord and printRecord within the class and test their 
functionality.
 
 */


public class Demo1 {
	private int[] a;
	private static Scanner s = new Scanner(System.in);
	
	Demo1(){
		this(5);
	}
	
	public Demo1(int size) {
		
		this.a = new int[size];
	}
	
	public void getA() {
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		
	}

	public void setA() {
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter elements: ");
			a[i] = s.nextInt();
			
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Enter the size of array: ");
		int size = s.nextInt();
		Demo1 d = new Demo1(size);
		d.setA();
		d.getA();
	}

}
