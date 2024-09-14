package org.example_7_5;
import java.util.Scanner;

/*

Write a program to find the intersection of two single-dimensional arrays.

 
 */


public class Demo1 {
	
	Scanner s = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the size of array A: ");
		int size_A = s1.nextInt();
		int[] m_arr = new int [size_A];

		System.out.println("Enter the size of array B: ");
		int size_B = s1.nextInt();
		int[] n_arr = new int [size_B];
		Demo1 d = new Demo1();
		
		System.out.println("Enter elements in array A: ");
		d.acceptRecord(m_arr);
		System.out.println("Enter elements in array B: ");
		d.acceptRecord(n_arr);
		
		int[] o = d.removeDuplicates(m_arr);
		int[] p = d.removeDuplicates(n_arr);
		
		int[] c = d.findIntersection(o, p);
		System.out.println("\nIntersection between A & B : ");
		d.printRecord(c);
		s1.close();
	}

	private int[] findIntersection(int[] m_arr, int[] n_arr) {
		int[] c_arr; //= new int [5];
		
		if(m_arr.length >= n_arr.length ) {
			c_arr = new int[n_arr.length];
		}
		else {
			c_arr = new int[m_arr.length];
		}
		
		int k = 0;
		//int visited = -1;
		
		for(int i = 0; i<m_arr.length; i++) {
			for(int j = 0; j<n_arr.length; j++) {
				if(m_arr[i] == n_arr[j])
					c_arr[k++] = m_arr[i];
				else
					continue;
			}
		}
		
		int[] d_arr = new int[k];
		int index = 0;
		for (int i = 0; i<5; i++) {
			if (c_arr[i] != 0) {
				d_arr[index++] = c_arr[i];
			}
			else
				continue;
		}
		
		return d_arr;
	}

// Optimize above method further** reduce array used and counter used even the element visited in outer 
//	loop should be reduced.

	private int[] removeDuplicates(int[] s_arr) {
		
		int visited = -1;
		int duplicate = 0;
		
		for(int i = 0; i<s_arr.length-1; i++ ) {
			for(int j = i+1; j<s_arr.length; j++) {
				if (s_arr[i] != -1) {
					if (s_arr[i] == s_arr[j]) {
						s_arr[j] = visited;
						duplicate++;
					}
				}
			}
		}
		
		int size = s_arr.length - duplicate;
		int[] s2_arr = new int [size];
		int index = 0;
		for(int i = 0; i<s_arr.length; i++ ) {
			if(s_arr[i] != -1)
				s2_arr [index++] = s_arr[i];
			else
				continue;
		}	
		
		return s2_arr;
	}


	private void printRecord(int[] s_arr) {
		for(int i=0; i<s_arr.length; i++) {
			System.out.println("Array["+i+"] = "+s_arr[i]);
		}
		
	}

	private void acceptRecord(int[] s_arr) {
		for(int i=0; i<s_arr.length; i++) {
			System.out.println("Enter elements: ");
			s_arr[i] = s.nextInt();
			
		}
	}
	
	
	
}
