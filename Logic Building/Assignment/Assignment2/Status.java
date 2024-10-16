/*

Question 5: Student Pass/Fail Status with Nested Switch
Write a program that determines whether a student passes or fails based on their 
grades in three subjects. If the student scores more than 40 in all subjects, they 
pass. If the student fails in one or more subjects, print the number of subjects 
they failed in.

*/

/* import java.util.*;

class Status{
	public static void main(String args[]){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the marks in subject1: ");
		int a = s1.nextInt();
		System.out.println("Enter the marks in subject2: ");
		int b = s1.nextInt();
		System.out.println("Enter the marks in subject3: ");
		int c = s1.nextInt();
		int count=0;
		
		switch(a>40?1:0){
			case 1:
				switch(b>40?1:0){
					case 1:
						switch(c>40?1:0){
							case 1:							
									System.out.println("PASS");
									break;
	
							case 0:
									count++;
									break;
						}
					break;	
					case 0:
						count++;
						switch(c>40?1:0){
							case 1:
									break;	
							case 0:
									count++;
									break;
						}
					break;
				}
			break;
			
			case 0:
				count++;
				switch(b>40?1:0){
					case 1:
						switch(c>40?1:0){
							case 1:
								break;	
							case 0:
								count++;
								break;
						}
					break;
					
					case 0:
						count++;
						switch(c>40?1:0){
							case 1:
									break;
							case 0:
									count++;
									break;
						}
					break;
						
				}
			break;
			
		}
		
		System.out.println("FAIL: No. of subjects failed in: "+count);

	}
} */


//OR;

import java.util.Scanner;

class Status {
		public static void main(String[] args){	
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter marks of S1");
		int m1 = s1.nextInt();
		System.out.println("Enter marks of S2");
		int m2 = s1.nextInt();
		System.out.println("Enter marks of S3");
		int m3 = s1.nextInt();
		int failcount = 0;
		switch(m1>40?1:0)
		{
			case 0:
			{
				failcount++;
				break;
			}
		}
		switch(m2>40?1:0)
		{
			case 0:
			{
				failcount++;
				break;
			}
		}
		switch(m3>40?1:0)
		{
			case 0:
			{
				failcount++;
				break;
			}
		}
		switch(failcount)
		{
			case 0:
			{
				System.out.println("PASS");
				break;
			}
			default:
			{
				System.out.println("FAIL: No. subjects failed in: "+ failcount);
				break;
			}
		}	
	}
}

