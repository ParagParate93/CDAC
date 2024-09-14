package org.example_7_4;
import java.util.Scanner;

/*
 
 Write a program to remove duplicate elements from a single-dimensional array of integers.

 
 */


public class Demo1 {
	
	Scanner s = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		
		int[] m_arr = new int [5];
		Demo1 d = new Demo1();
		d.acceptRecord(m_arr);
		
		int[] c = d.removeDuplicates(m_arr);
		d.printRecord(c);
	}


	
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



	/*
	private void removeDuplicates(int[] b) {
		int visited = -1;
		for(int i = 0; i<b.length; i++) {
			if(b[i] != -1) {
				for (int j = i+1; j<b.length; j++) {
					if(b[i] == b[j]) {
						b[j] = visited;
					}
				}
				System.out.println(b[i]);
			}
		}
		
	}
	*/


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
