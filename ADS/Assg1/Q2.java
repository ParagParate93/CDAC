// Problem: Write a Java program to check if a given number is prime.

import java.util.Scanner;

class Q2{
	public static void main(String[] arr){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int prime = 0;
		for(int i =2;i<value/2;i++){
			if(value % i == 0){
				prime = 1;
			}
		}
		if(prime == 0){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
		
	}
}

/*

C:\Users\91916\Downloads>java Q2
Enter the number
21
Not Prime

C:\Users\91916\Downloads>java Q2
Enter the number
7
Prime

*/

