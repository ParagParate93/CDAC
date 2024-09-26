// Problem: Write a Java program to print the first n numbers in the Fibonacci series.

import java.util.Scanner;

class Q4{
	public static int Fib(int value){
		if(value<=1){
			return value;
		}
		return Fib(value-1) + Fib(value-2);
	}
	public static void main(String[] arr){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i<n;i++){
			System.out.println(Fib(i) + " ");
		}
		
	}
}

/*

C:\Users\91916\Downloads>java Q4
Enter the number
7
0
1
1
2
3
5
8


*/

